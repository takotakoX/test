package test;

import java.util.List;

import dao.FindAllRecipeDAO;

import java.util.ArrayList;

import entity.RecipeEntity;

public class FindAllRecipeDAOTest {
	public static void main(String[] args){
		testFindAllRecipe();
	}

	public static void testFindAllRecipe(){
		String mailId = "taro@gmail.com";
		List<RecipeEntity> recipeList = new ArrayList<RecipeEntity>();
		FindAllRecipeDAO dao = new FindAllRecipeDAO();
		recipeList = dao.FindAllRecipe(mailId);
		System.out.println(recipeList.get(0).getDish());
	}

}
