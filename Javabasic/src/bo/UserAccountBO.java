package bo;

import java.sql.SQLException;

import beans.UserAccount;
import dao.UserAccountDAO;
import java.util.List;

public class UserAccountBO {
	UserAccountDAO userAccountDAO = new UserAccountDAO();
	public boolean checkLogin(String userName, String password){
		return userAccountDAO.checkLogin(userName, password);
	}
	public boolean registerAccount(UserAccount userAccount) throws SQLException{
		return userAccountDAO.registerAccount(userAccount);
	}
	public boolean createUserAccount(UserAccount userAccount) throws SQLException{		
		return userAccountDAO.createUserAccount(userAccount);		
	}
	public List<UserAccount> userAccountList() throws SQLException{		
		return userAccountDAO.userAccountList();		
	}
	public boolean deleteUserAccount(String id) throws SQLException{
		return userAccountDAO.deleteUserAccount(id);
	}
	public boolean editUserAccount(UserAccount userAccount, String id) throws SQLException{
		return userAccountDAO.editUserAccount(userAccount, id);
	}
	public UserAccount getInforUserAccount(String id) throws SQLException{
		return userAccountDAO.getInforUserAccount(id);
	}
}
