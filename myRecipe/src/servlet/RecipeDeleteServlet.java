package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RecipeDeleteDAO;

@WebServlet("/RecipeDeleteServlet")
public class RecipeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String dish = request.getParameter("dish");
		String mailId = request.getParameter("mailId");
		RecipeDeleteDAO dao = new RecipeDeleteDAO();
		boolean result = true;
		String errorMsg;

		result = dao.DeleteRecipe(dish, mailId);
		if(result){
			response.sendRedirect("/myRecipe/LoginServlet");
		}else{
			errorMsg="正常に削除できませんでした。";
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			d.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
