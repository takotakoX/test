package test;

import entity.RecipeEntity;
import dao.RecipeCreateDAO;

//注意！このテストをやると肉じゃがは登録されてしまう。テストをやり直す場合はmyRecipe.sqlを実行してリセットする！

public class RecipeCreateDAOTest {
	public static void main(String[] args){
		testCreateRecipe1();
		testCreateRecipe2();
	}

	public static void testCreateRecipe1(){
		RecipeEntity recipe = new RecipeEntity("肉じゃが","牛肉","じゃがいも","たまねぎ","にんじん","しらたき","","","","","",30,"taro@gmail.com");
		RecipeCreateDAO dao = new RecipeCreateDAO();
		boolean result = dao.CreateRecipe(recipe);
		if(result){
			System.out.println("重複なし：登録できたので成功");
			System.out.println(recipe.isDupeFlg());
		}else{
			System.out.println("重複なし：登録できないので失敗");
		}
	}

	public static void testCreateRecipe2(){
		RecipeEntity recipe = new RecipeEntity("レタス炒飯","牛肉","じゃがいも","たまねぎ","にんじん","しらたき","","","","","",30,"taro@gmail.com");
		RecipeCreateDAO dao = new RecipeCreateDAO();
		boolean result = dao.CreateRecipe(recipe);
		if(result){
			System.out.println("重複あり：登録できたので失敗");
		}else{
			System.out.println("重複あり：登録できないので成功");
			System.out.println(recipe.isDupeFlg());
		}
	}

}
