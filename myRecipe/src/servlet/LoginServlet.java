package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.LoginEntity;
import entity.RecipeEntity;
import bo.LoginLogicBO;
import dao.FindAllRecipeDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		直接URLを呼び出された場合つまりログインしていない場合、index.jspに飛ばす
		HttpSession session = request.getSession();
		String mailId = (String) session.getAttribute("mailId");

		if(mailId==null){
			response.sendRedirect("/myRecipe/");
		}else{

			List<RecipeEntity> recipeList = new ArrayList<RecipeEntity>();
			FindAllRecipeDAO dao = new FindAllRecipeDAO();
			recipeList = dao.FindAllRecipe(mailId);
			session.setAttribute("recipeList", recipeList);

			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			d.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");

		LoginEntity loginEntity = new LoginEntity(mail, pass);
		LoginLogicBO bo = new LoginLogicBO();
		boolean result = bo.LoginLogic(loginEntity);

		if(result){
			HttpSession session = request.getSession();
			session.setAttribute("mailId", mail);

//			DBから登録したレシピを取得してlistとしてセッションに格納
			List<RecipeEntity> recipeList = new ArrayList<RecipeEntity>();
			FindAllRecipeDAO dao = new FindAllRecipeDAO();
			recipeList = dao.FindAllRecipe(mail);
			session.setAttribute("recipeList", recipeList);

			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			d.forward(request, response);
		}else{
			response.sendRedirect("/myRecipe/WelcomeServlet");
		}
	}
}
