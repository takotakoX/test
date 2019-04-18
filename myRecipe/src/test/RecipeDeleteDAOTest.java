package test;

import dao.RecipeDeleteDAO;

public class RecipeDeleteDAOTest {
	public static void main (String[] args){
		testDeleteRecipe();
	}

	public static void testDeleteRecipe(){
		String dish = "キャベツサラダ";
		String mailId = "taro@gmail.com";
		boolean result = true;
		RecipeDeleteDAO dao = new RecipeDeleteDAO();

		result = dao.DeleteRecipe(dish, mailId);
		if(result){
			System.out.println("削除に成功");
		}else{
			System.out.println("削除に失敗");
		}
	}

}
