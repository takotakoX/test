package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RecipeCreateDAO;
import entity.RecipeEntity;

@WebServlet("/RecipeCreateServlet")
public class RecipeCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/recipeCreate.jsp");
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();

		String dish = request.getParameter("dish");
		String ing01 = request.getParameter("ing01");
		String ing02 = request.getParameter("ing02");
		String ing03 = request.getParameter("ing03");
		String ing04 = request.getParameter("ing04");
		String ing05 = request.getParameter("ing05");
		String ing06 = request.getParameter("ing06");
		String ing07 = request.getParameter("ing07");
		String ing08 = request.getParameter("ing08");
		String ing09 = request.getParameter("ing09");
		String ing10 = request.getParameter("ing10");
		int cookingTime = Integer.parseInt(request.getParameter("cookingTime"));
		String mail = (String)session.getAttribute("mailId");
		String errorMsg;

		RecipeEntity recipe = new RecipeEntity(dish, ing01, ing02, ing03, ing04, ing05, ing06, ing07, ing08, ing09, ing10, cookingTime, mail);
		RecipeCreateDAO dao = new RecipeCreateDAO();
		boolean result = dao.CreateRecipe(recipe);

		if(dish.equals("")){
			errorMsg = "料理名は必ず記入してください。";
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/recipeCreate.jsp");
			d.forward(request, response);
		}else if(result==false && recipe.isDupeFlg()==false){
			errorMsg = "既に登録されているレシピです。";
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/recipeCreate.jsp");
			d.forward(request, response);
		}else if (result==false){
			errorMsg = "正常に登録できませんでした。";
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/recipeCreate.jsp");
			d.forward(request, response);
		}else{
			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/recipeCreateComplete.jsp");
			d.forward(request, response);
		}
	}
}
