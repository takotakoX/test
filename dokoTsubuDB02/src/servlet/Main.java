package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GetMutterListLogic;
import model.Mutter;
import model.PostMutterLogic;
import model.User;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		GetMutterListLogicはfindAllメソッドを実行するためだけのメソッド。
//		DBから全てのつぶやきをMutterインスタンスの格納されたListとしてとってくる。
		GetMutterListLogic getMutterListLogic = new GetMutterListLogic();
		List<Mutter> mutterList = getMutterListLogic.execute();

//		リクエストスコープに保存
		request.setAttribute("mutterList", mutterList);

//		ログインしているかどうかの確認
		HttpSession session = request.getSession();
		User loginUser = (User) session.getAttribute("loginUser");

//		ログインしていない場合にURLの表示を遷移先のものにするためリダイレクト
		if(loginUser==null){
			response.sendRedirect("/dokoTsubuDB02/");
		}else{
			RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
			d.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

//		リクエストパラメータを取得
		request.setCharacterEncoding("UTF-8");
		String text = request.getParameter("text");

		if(text != null && text.length() != 0){

//			ログインユーザーの情報をセッションスコープから取得
			HttpSession session = request.getSession();
			User loginUser = (User) session.getAttribute("loginUser");

//			PostMutterLogicのexecuteメソッドはDAO
			Mutter mutter = new Mutter(loginUser.getName(), text);
			PostMutterLogic postMutterLogic = new PostMutterLogic();
			postMutterLogic.execute(mutter);

			}else{
			request.setAttribute("errorMsg", "つぶやきが入力されていません");
		}

		GetMutterListLogic getMutterListLogic = new GetMutterListLogic();
		List<Mutter> mutterList = getMutterListLogic.execute();
		request.setAttribute("mutterList", mutterList);

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		d.forward(request, response);
	}
}
