package bo;

import entity.LoginEntity;
import entity.AccountEntity;
import dao.LoginUserAccountDAO;

public class LoginLogicBO {

	public boolean LoginLogic(LoginEntity loginEntity){
		LoginUserAccountDAO dao = new LoginUserAccountDAO();
		AccountEntity accountEntity = dao.UserLogin(loginEntity);
		return accountEntity != null;
	}
}
