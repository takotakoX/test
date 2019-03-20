package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String[] luckArray={"超スッキリ","スッキリ","最悪"};
		int index=(int)(Math.random()*3);
//		random()メソッドは0~1未満の乱数を返すので3倍してint型にキャストすると
//		0~2の整数の乱数を取得できる。
		String luck = luckArray[index];

		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		String today=sdf.format(date);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"ja\">");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>スッキリ占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+today+"の運勢は"+luck+"です</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
