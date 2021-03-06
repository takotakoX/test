package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.TempUserCheckDAO;
import entity.TempUserEntity;

@WebServlet("/UserCreateServlet")
public class UserCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/userCreate.jsp");
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");

		TempUserEntity tempUser = new TempUserEntity(mail, pass);
		TempUserCheckDAO dao = new TempUserCheckDAO();
		boolean result = dao.TempUserCheck(tempUser);
		String errorMsg;

		if(result && !(mail.equals("")) && !(pass.equals(""))){
			HttpSession session = request.getSession();
			session.setAttribute("tempUser", tempUser);
			RequestDispatcher d = request.getRequestDispatcher("WEB-INF/jsp/userCreateConfirm.jsp");
			d.forward(request, response);
		}else if(result == false){
			errorMsg = "既に登録されているメールアドレスです";
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/userCreate.jsp");
			d.forward(request, response);
		}else{
			errorMsg = "記入されていない項目があります";
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/userCreate.jsp");
			d.forward(request, response);		}

	}

}
