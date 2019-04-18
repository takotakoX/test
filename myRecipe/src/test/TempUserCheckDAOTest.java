package test;

import entity.TempUserEntity;
import dao.TempUserCheckDAO;

public class TempUserCheckDAOTest {
	public static void main(String[] args){
		testTempUserCheck1(); //重複した場合
		testTempUserCheck2(); //重複しなかった場合
	}

	public static void testTempUserCheck1(){
		TempUserEntity tempUser = new TempUserEntity("taro@gmail.com","123");
		TempUserCheckDAO dao = new TempUserCheckDAO();
		boolean result = dao.TempUserCheck(tempUser);
		if(result){
			System.out.println("test1: 失敗");
		}else{
			System.out.println("test1: 成功");
		}
	}

	public static void testTempUserCheck2(){
		TempUserEntity tempUser = new TempUserEntity("hanako@gmail.com","123");
		TempUserCheckDAO dao = new TempUserCheckDAO();
		boolean result = dao.TempUserCheck(tempUser);
		if(result){
			System.out.println("test2: 成功");
		}else{
			System.out.println("test2: 失敗");
		}
	}
}
