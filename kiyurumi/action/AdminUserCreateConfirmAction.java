package com.internousdev.kiyurumi.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kiyurumi.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


public class AdminUserCreateConfirmAction extends ActionSupport implements SessionAware{

	private Map<String ,Object>session;
	private int id;
	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String email;
	private int status;

	private List<String> familyNameErrorMessageList = new ArrayList<String>();
	private List<String> firstNameErrorMessageList = new ArrayList<String>();
	private List<String> familyNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> firstNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> emailErrorMessageList = new ArrayList<String>();
	private List<String> userIdErrorMessageList = new ArrayList<String>();
	private List<String> passwordErrorMessageList = new ArrayList<String>();
	private List<String> loginIdCheckMessageList = new ArrayList<String>();

	public String execute(){
		String result = ERROR;
		InputChecker inputChecker = new InputChecker();

		session.put("password", password);
		session.put("familyName", familyName);
		session.put("firstName",firstName );
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("sex", sex);
		session.put("email",email);
		session.put("status" ,status );
		session.put("userId", userId);

		familyNameErrorMessageList=inputChecker.doCheck("姓", familyName,1,16, true,true,true, false,false,false,false );
		firstNameErrorMessageList=inputChecker.doCheck("名", firstName,1 ,16 , true,true,true, false,false,false,false );
		familyNameKanaErrorMessageList=inputChecker.doCheck("姓ふりがな", familyNameKana,1 ,16 ,false ,false ,true ,false ,true ,false ,true );
		firstNameKanaErrorMessageList=inputChecker.doCheck("名ふりがな", firstNameKana, 1, 16, false, false, true, false, true, false,true );
		emailErrorMessageList=inputChecker.doCheck("メールアドレス", email, 14, 32, true, false, false, true,true, false, false );
		userIdErrorMessageList=inputChecker.doCheck("ユーザID", userId, 1, 8, true, false, false, true, false, false, false);
		passwordErrorMessageList=inputChecker.doCheck("パスワード", password, 1, 16,true, false, false, true, false, false, false);
		loginIdCheckMessageList=inputChecker.doLoginIdCheck(userId);


		if(familyNameErrorMessageList.size()==0
				&& firstNameErrorMessageList.size()==0
				&& familyNameKanaErrorMessageList.size()==0
				&& firstNameKanaErrorMessageList.size()==0
				&& emailErrorMessageList.size()==0
				&& userIdErrorMessageList.size()==0
				&& passwordErrorMessageList.size()==0
				&& loginIdCheckMessageList.size()==0
				){
			result = SUCCESS;
		}else{
			session.put("familyNameErrorMessageList", familyNameErrorMessageList);
			session.put("firstNameErrorMessageList",firstNameErrorMessageList);
			session.put("familyNameKanaErrorMessageList", familyNameKanaErrorMessageList);
			session.put("firstNameKanaErrorMessageList", firstNameKanaErrorMessageList);
			session.put("emailErrorMessageList", emailErrorMessageList);
			session.put("userIdErrorMessageList", userIdErrorMessageList);
			session.put("passwordErrorMessageList", passwordErrorMessageList);
			session.put("loginIdCheckMessageList", loginIdCheckMessageList);
			result = ERROR;
		}
	return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}


	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<String> getFamilyNameErrorMessageList() {
		return familyNameErrorMessageList;
	}

	public void setFamilyNameErrorMessageList(List<String> familyNameErrorMessageList) {
		this.familyNameErrorMessageList = familyNameErrorMessageList;
	}

	public List<String> getFirstNameErrorMessageList() {
		return firstNameErrorMessageList;
	}

	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList) {
		this.firstNameErrorMessageList = firstNameErrorMessageList;
	}

	public List<String> getFamilyNameKanaErrorMessageList() {
		return familyNameKanaErrorMessageList;
	}

	public void setFamilyNameKanaErrorMessageList(List<String> familyNameKanaErrorMessageList) {
		this.familyNameKanaErrorMessageList = familyNameKanaErrorMessageList;
	}

	public List<String> getFirstNameKanaErrorMessageList() {
		return firstNameKanaErrorMessageList;
	}

	public void setFirstNameKanaErrorMessageList(List<String> firstNameKanaErrorMessageList) {
		this.firstNameKanaErrorMessageList = firstNameKanaErrorMessageList;
	}

	public List<String> getEmailErrorMessageList() {
		return emailErrorMessageList;
	}

	public void setEmailErrorMessageList(List<String> emailErrorMessageList) {
		this.emailErrorMessageList = emailErrorMessageList;
	}


	public List<String> getUserIdErrorMessageList() {
		return userIdErrorMessageList;
	}


	public void setUserIdErrorMessageList(List<String> userIdErrorMessageList) {
		this.userIdErrorMessageList = userIdErrorMessageList;
	}


	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	public List<String> getLoginIdCheckMessageList() {
		return loginIdCheckMessageList;
	}


	public void setLoginIdCheckMessageList(List<String> loginIdCheckMessageList) {
		this.loginIdCheckMessageList = loginIdCheckMessageList;
	}

}