package test;

import com.internousdev.final_login02.dao.LoginDAO;
import com.internousdev.final_login02.dto.LoginDTO;

public class LoginDAOTest {
	public static void main(String[] args){
		testUserLogin1();
		testUserLogin2();
	}

	public static void testUserLogin1(){
		LoginDTO dto = new LoginDTO();
		LoginDAO dao = new LoginDAO();

		String name = "taro";
		String pass = "123";

		dto = dao.UserLogin(name, pass);
		System.out.println(dto.getName());
		System.out.println(dto.getPass());
	}

	public static void testUserLogin2(){
		LoginDTO dto = new LoginDTO();
		LoginDAO dao = new LoginDAO();

		String name = "taro";
		String pass = "234";

		dto = dao.UserLogin(name, pass);
		System.out.println(dto.getName());
		System.out.println(dto.getPass());
	}

}
