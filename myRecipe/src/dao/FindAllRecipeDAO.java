package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.RecipeEntity;
import util.DBConnector;

public class FindAllRecipeDAO {
	public List<RecipeEntity> FindAllRecipe(String mailId){
		String sql = "SELECT dish, ing_1, ing_2, ing_3, ing_4, ing_5, ing_6, ing_7, ing_8, ing_9, ing_10, cooking_time "
				+ "FROM recipe "
				+ "WHERE mail_id = ? "
				+ "ORDER BY id DESC";
		List<RecipeEntity> recipeList = new ArrayList<RecipeEntity>();
		Connection conn = null;

		try{
			DBConnector db = new DBConnector();
			conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, mailId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				String dish = rs.getString("dish");
				String ing01 = rs.getString("ing_1");
				String ing02 = rs.getString("ing_2");
				String ing03 = rs.getString("ing_3");
				String ing04 = rs.getString("ing_4");
				String ing05 = rs.getString("ing_5");
				String ing06 = rs.getString("ing_6");
				String ing07 = rs.getString("ing_7");
				String ing08 = rs.getString("ing_8");
				String ing09 = rs.getString("ing_9");
				String ing10 = rs.getString("ing_10");
				int cookingTime = Integer.parseInt(rs.getString("cooking_time"));
				RecipeEntity recipe = new RecipeEntity(dish, ing01, ing02, ing03, ing04, ing05, ing06, ing07, ing08, ing09, ing10, cookingTime);
				recipeList.add(recipe);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//test
			System.out.println(recipeList);
		//test
		return recipeList;
	}

}
