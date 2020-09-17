package adminservlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.UserAccountBO;

/**
 * Servlet implementation class UserAccount
 */
@WebServlet("/Management/UserAccount")
public class UserAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserAccountBO uAB = new UserAccountBO();
		try {
			List<beans.UserAccount> list = uAB.userAccountList();
			request.setAttribute("list", list);
			RequestDispatcher rd= request.getServletContext().getRequestDispatcher("/WEB-INF/views/Admin/Home/UserAccount.jsp");
			rd.forward(request, response);	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql");
			e.printStackTrace();
		}
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
