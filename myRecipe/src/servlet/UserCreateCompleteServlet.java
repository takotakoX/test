package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.TempUserEntity;
import dao.UserCreateDAO;

@WebServlet("/UserCreateCompleteServlet")
public class UserCreateCompleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean result = true;
		String errorMsg;

		HttpSession session = request.getSession();
		TempUserEntity tempUser = (TempUserEntity)session.getAttribute("tempUser");

		UserCreateDAO dao = new UserCreateDAO();
		result = dao.CreateUser(tempUser);

		if(result){
			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/userCreateComplete.jsp");
			d.forward(request, response);
		}else{
			errorMsg = "正常に登録できませんでした。";
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/userCreateComplete.jsp");
			d.forward(request, response);
		}
	}
}
