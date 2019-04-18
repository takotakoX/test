package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
		d.forward(request, response);
	}
//	healthCheck.jspにフォワードされる。

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");

		Health health = new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));

		HealthCheckLogic hcl = new HealthCheckLogic();
		hcl.execute(health);

		request.setAttribute("health", health);
//		リクエストスコープに保存している

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
		d.forward(request, response);
	}
}
