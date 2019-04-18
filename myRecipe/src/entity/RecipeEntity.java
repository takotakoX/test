package entity;

public class RecipeEntity {

	private String dish;
	private String ing01;
	private String ing02;
	private String ing03;
	private String ing04;
	private String ing05;
	private String ing06;
	private String ing07;
	private String ing08;
	private String ing09;
	private String ing10;
	private int cookingTime;
	private String mail;
	private boolean dupeFlg = true;

	public RecipeEntity(String dish, String ing01, String ing02, String ing03, String ing04, String ing05,
			String ing06, String ing07, String ing08, String ing09, String ing10, int cookingTime, String mail){
		this.dish = dish;
		this.ing01 = ing01;
		this.ing02 = ing02;
		this.ing03 = ing03;
		this.ing04 = ing04;
		this.ing05 = ing05;
		this.ing06 = ing06;
		this.ing07 = ing07;
		this.ing08 = ing08;
		this.ing09 = ing09;
		this.ing10 = ing10;
		this.cookingTime = cookingTime;
		this.mail = mail;
	}

//	main.jspにレシピ一覧を表示するためのコンストラクタ
	public RecipeEntity(String dish, String ing01, String ing02, String ing03, String ing04, String ing05,
			String ing06, String ing07, String ing08, String ing09, String ing10, int cookingTime){
		this.dish = dish;
		this.ing01 = ing01;
		this.ing02 = ing02;
		this.ing03 = ing03;
		this.ing04 = ing04;
		this.ing05 = ing05;
		this.ing06 = ing06;
		this.ing07 = ing07;
		this.ing08 = ing08;
		this.ing09 = ing09;
		this.ing10 = ing10;
		this.cookingTime = cookingTime;
	}

	public String getDish(){
		return this.dish;
	}
	public void setDish(String dish){
		this.dish = dish;
	}
	public String getIng01(){
		return this.ing01;
	}
	public void setIng01(String ing01){
		this.ing01 = ing01;
	}
	public String getIng02(){
		return this.ing02;
	}
	public void setIng02(String ing02){
		this.ing02 = ing02;
	}
	public String getIng03(){
		return this.ing03;
	}
	public void setIng03(String ing03){
		this.ing03 = ing03;
	}
	public String getIng04(){
		return this.ing04;
	}
	public void setIng04(String ing04){
		this.ing04 = ing04;
	}
	public String getIng05(){
		return this.ing05;
	}
	public void setIng05(String ing05){
		this.ing05 = ing05;
	}
	public String getIng06(){
		return this.ing06;
	}
	public void setIng06(String ing06){
		this.ing06 = ing06;
	}
	public String getIng07(){
		return this.ing07;
	}
	public void setIng07(String ing07){
		this.ing07 = ing07;
	}
	public String getIng08(){
		return this.ing08;
	}
	public void setIng08(String ing08){
		this.ing08 = ing08;
	}
	public String getIng09(){
		return this.ing09;
	}
	public void setIng09(String ing09){
		this.ing09 = ing09;
	}
	public String getIng10(){
		return this.ing10;
	}
	public void setIng10(String ing10){
		this.ing10 = ing10;
	}
	public int getCookingTime(){
		return this.cookingTime;
	}
	public void setCookingTime(int cookingTime){
		this.cookingTime = cookingTime;
	}
	public String getMail(){
		return this.mail;
	}
	public void setMail(String mail){
		this.mail = mail;
	}
//	注意！
	public boolean isDupeFlg(){
		return this.dupeFlg;
	}
	public void setDupeFlg(boolean dupeFlg){
		this.dupeFlg = dupeFlg;
	}
}
