package test;

import com.internousdev.final_login.dao.LoginDAO;
import com.internousdev.final_login.dto.LoginDTO;

public class LoginDAOTest {
	public static void main(String[] args){
		testUserLogin();//ログイン成功
	}

	public static void testUserLogin(){
		String name = "taro";
		String pass = "123";
		LoginDTO dto = new LoginDTO();
		LoginDAO dao = new LoginDAO();

		dto = dao.UserLogin(name, pass);
		String retName = dto.getName();
		String retPass = dto.getPass();
		System.out.println(retName);
		System.out.println(retPass);

	}

}
