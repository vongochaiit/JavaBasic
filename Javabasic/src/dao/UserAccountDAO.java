package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;



import beans.UserAccount;

public class UserAccountDAO extends Connect{


	public boolean checkLogin(String userName, String password) {
		Connection connection = super.connect();
		
		String sql=	String.format("SELECT userName FROM USERACCOUNT WHERE userName = '%s' AND password = '%s'", userName, password);
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
public boolean registerAccount(UserAccount userAccount) throws SQLException{
	String sql = "INSERT INTO USERACCOUNT VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
	try {
        // connnect to database 'testdb'
        Connection conn = super.connect();
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        //xu ly userId
        Statement stmt2 = conn.createStatement();
        ResultSet rs2= stmt2.executeQuery("SELECT COUNT(userId) AS c FROM dbo.USERACCOUNT");
        String userId="U";
        int temp=0;
        while (rs2.next()) {
//        		System.out.println(rs2.getInt(1)); 
        		temp = rs2.getInt(1) + 1;
            }
        if(temp > 999){
        	userId += String.valueOf(temp);
        }else if(temp > 99){
        			userId = userId +"0"+String.valueOf(temp);
        		}else if(temp > 9){
        			userId = userId +"00"+String.valueOf(temp);
        			  }else {
        				  userId = userId +"000"+String.valueOf(temp);
        			  }
        

        //check duplicate username
        if(userAccount.getUserName() == "") return false;
        ResultSet rs3= stmt2.executeQuery("SELECT COUNT(userId) as c FROM USERACCOUNT WHERE userName = '"+userAccount.getUserName()+"';");
        int temp2=0;
        while (rs3.next()) {       		
        		temp2 = rs3.getInt(1);
        		System.out.println(rs3.getInt(1)); 
            }System.out.println(temp2);
        if(temp2>0) return false;
        stmt.setString(1,userId);
        stmt.setString(2, userAccount.getUserName());
        stmt.setString(3, userAccount.getPassword());
        stmt.setString(4, userAccount.getFirstName());
        stmt.setString(5,userAccount.getLastName());
        stmt.setString(6, userAccount.getDateOfBirth());
        stmt.setString(7, userAccount.getPhoneNumber());
        stmt.setString(8, " ");
        stmt.setInt(9,0);
        
        // xu ly mac dinh
        stmt.setInt(10, 0);
        LocalDateTime now = LocalDateTime.now();
//        System.out.println("đã vào");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String createdDate = formatter.format(now);
        stmt.setString(11, createdDate);
        stmt.setString(12, "Customer");
        stmt.setString(13, createdDate);
        stmt.setString(14, "Customer");

        //select all
        // get data from table 'student'
        stmt.executeUpdate();

        // close connection
        conn.close();
        return true;
    } catch (SQLException ex) {
    	System.out.println("errro");
        ex.printStackTrace();
        return false;
    } 



	}
public boolean createUserAccount(UserAccount userAccount) throws SQLException{
	String sql = "INSERT INTO USERACCOUNT VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 
	try {
        // connnect to database 'testdb'
        Connection conn = super.connect();
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        //xu ly userId
        Statement stmt2 = conn.createStatement();
        ResultSet rs2= stmt2.executeQuery("SELECT COUNT(userId) AS c FROM dbo.USERACCOUNT");
        String userId="U";
        int temp=0;
        while (rs2.next()) {
//        		System.out.println(rs2.getInt(1)); 
        		temp = rs2.getInt(1) + 1;
            }
        if(temp > 999){
        	userId += String.valueOf(temp);
        }else if(temp > 99){
        			userId = userId +"0"+String.valueOf(temp);
        		}else if(temp > 9){
        			userId = userId +"00"+String.valueOf(temp);
        			  }else {
        				  userId = userId +"000"+String.valueOf(temp);
        			  }
        

        //check duplicate username
        if(userAccount.getUserName() == "") return false;
        ResultSet rs3= stmt2.executeQuery("SELECT COUNT(userId) as c FROM USERACCOUNT WHERE userName = '"+userAccount.getUserName()+"';");
        int temp2=0;
        while (rs3.next()) {       		
        		temp2 = rs3.getInt(1);
        		//.out.println(rs3.getInt(1)); 
            }//System.out.println(temp2);
        if(temp2>0) return false;
        stmt.setString(1,userId);
        stmt.setString(2, userAccount.getUserName());
        stmt.setString(3, userAccount.getPassword());
        stmt.setString(4, userAccount.getFirstName());
        stmt.setString(5,userAccount.getLastName());
        stmt.setString(6, userAccount.getDateOfBirth());
        stmt.setString(7, userAccount.getPhoneNumber());
        stmt.setString(8, " ");
        stmt.setInt(9, userAccount.getPoint());
        
        // xu ly mac dinh
        stmt.setInt(10, 0);
        LocalDateTime now = LocalDateTime.now();
//        System.out.println("đã vào");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String createdDate = formatter.format(now);
        stmt.setString(11, createdDate);
        stmt.setString(12, "Customer");
        stmt.setString(13, createdDate);
        stmt.setString(14, "Customer");

        //select all
        // get data from table 'student'
        stmt.executeUpdate();

        // close connection
        conn.close();
        return true;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    } 



	}
public List<UserAccount> userAccountList() throws SQLException{
	List<UserAccount> A = new ArrayList<UserAccount>();
	Connection connection = super.connect();
	Statement st = connection.createStatement();
	String sql=	String.format("SELECT userId,userName,firstName,lastName,dateOfBirth,phoneNumber,point FROM USERACCOUNT WHERE isDeleted = 'false'");
	ResultSet rs = st.executeQuery(sql);
	while(rs.next()){
		UserAccount ua = new UserAccount();
		ua.setUserId(rs.getString(1));
		ua.setUserName(rs.getString(2));
		ua.setFirstName(rs.getString(3)+" "+rs.getString(4));
		ua.setLastName(rs.getString(4));
		ua.setDateOfBirth(rs.getString(5));
		ua.setPhoneNumber(rs.getString(6));
		ua.setPoint(rs.getInt(7));
		
		A.add(ua);
	}
	return A;
}
//Delete Account
public boolean deleteUserAccount(String id) throws SQLException{
	Connection connection = super.connect();
	Statement st = connection.createStatement();
	String sql = String.format("UPDATE USERACCOUNT SET isDeleted = 'True' WHERE userId='"+id+"'");
	int rs = st.executeUpdate(sql);
	if (rs == 1) {
		return true;
	}else return false;
}
public boolean editUserAccount(UserAccount userAccount, String id) throws SQLException{
	Connection connection = super.connect();
	Statement st = connection.createStatement();
	String sql=	String.format("UPDATE USERACCOUNT SET password='%s',firstName='%s',lastName='%s',dateOfBirth='%s',phoneNumber='%s',point='%s' WHERE userId='"+id+"'",userAccount.getPassword(),userAccount.getFirstName(),userAccount.getLastName(),userAccount.getDateOfBirth(),userAccount.getPhoneNumber(),userAccount.getPoint()); 
	int rs = st.executeUpdate(sql);
	if(rs == 1){
		return true;
	}else return false;
}
public UserAccount getInforUserAccount(String id) throws SQLException{
	UserAccount user = new UserAccount();
	Connection connection = super.connect();
	Statement st = connection.createStatement();
	String sql = String.format("SELECT userId,userName,password,firstName,lastName,dateOfBirth,phoneNumber,point FROM USERACCOUNT WHERE isDeleted = 'false' AND userId='"+id+"'");
	ResultSet rs = st.executeQuery(sql);
	while(rs.next()){
		user.setUserId(rs.getString(1));
		user.setUserName(rs.getString(2));
		user.setPassword("hack cdmm");
		user.setFirstName(rs.getString(4));
		user.setLastName(rs.getString(5));
		user.setDateOfBirth(rs.getString(6));
		user.setPhoneNumber(rs.getString(7));
		user.setPoint(rs.getInt(8));	
	}
	return user;
}

}
