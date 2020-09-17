package servlet.useraccount;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UserAccount;
import bo.UserAccountBO;

/**
 * Servlet implementation class CreateUserAccount
 */
@WebServlet("/Management/UserAccount/Create")
public class CreateUserAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUserAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("Notification", "");
		RequestDispatcher rd= request.getServletContext().getRequestDispatcher("/WEB-INF/views/Admin/UserAccount/Create.jsp");
		rd.forward(request, response);		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		UserAccount  userAccount = new UserAccount();
		userAccount.setUserName(request.getParameter("userName2"));
		userAccount.setPassword(request.getParameter("password"));
		userAccount.setFirstName(request.getParameter("firstName"));
		userAccount.setLastName(request.getParameter("lastName"));
		userAccount.setPoint(Integer.parseInt(request.getParameter("point")));
		userAccount.setDateOfBirth((String)request.getParameter("dateOfBirth"));
		userAccount.setPhoneNumber(request.getParameter("phoneNumber"));
		
		//note lai sau validation
		UserAccountBO userAccountBO = new UserAccountBO();

		try {
			if(userAccountBO.createUserAccount(userAccount)){
				request.setAttribute("Notification", "Create succeed!");
				response.sendRedirect(request.getContextPath()+"/Management/UserAccount");
			}else{
				request.setAttribute("userName2", request.getParameter("userName2"));
				request.setAttribute("firstName", request.getParameter("firstName"));
				request.setAttribute("lastName", request.getParameter("lastName"));
				request.setAttribute("dateOfBirth", request.getParameter("dateOfBirth"));
				request.setAttribute("phoneNumber", request.getParameter("phoneNumber"));
				request.setAttribute("point", request.getParameter("point"));
				request.setAttribute("Notification", "Create fail!");
				RequestDispatcher rd= request.getServletContext().getRequestDispatcher("/WEB-INF/views/Admin/UserAccount/Create.jsp");
				rd.forward(request, response);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
