package test;

import entity.TempUserEntity;
import dao.UserCreateDAO;

public class UserCreateDAOTest {
	public static void main(String[] args){
		testUserCreateDAO();
	}

	public static void testUserCreateDAO(){
		TempUserEntity tempUser = new TempUserEntity("hanako@gmail.com","123");
		UserCreateDAO dao = new UserCreateDAO();
		boolean result = dao.CreateUser(tempUser);

		if(result){
			System.out.println("success");
		}else{
			System.out.println("false");
		}
	}
}
