package servlet;

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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("Notification", "");
		RequestDispatcher rd= request.getServletContext().getRequestDispatcher("/WEB-INF/views/Home/Register.jsp");
		rd.forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		UserAccount  userAccount = new UserAccount();
		userAccount.setUserName(request.getParameter("userName"));
		userAccount.setPassword(request.getParameter("password"));
		userAccount.setFirstName(request.getParameter("firstName"));
		userAccount.setLastName(request.getParameter("lastName"));
		userAccount.setDateOfBirth((String)request.getParameter("dateOfBirth"));
		userAccount.setPhoneNumber(request.getParameter("phoneNumber"));
		
		//note lai sau validation
		UserAccountBO userAccountBO = new UserAccountBO();

		try {
			if(userAccountBO.registerAccount(userAccount)){
				request.setAttribute("Notification", "Created successfully");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Home/Login.jsp");
				rd.forward(request, response);
			}else{
				request.setAttribute("userName", request.getParameter("userName"));
				request.setAttribute("firstName", request.getParameter("firstName"));
				request.setAttribute("lastName", request.getParameter("lastName"));
				request.setAttribute("dateOfBirth", request.getParameter("dateOfBirth"));
				request.setAttribute("phoneNumber", request.getParameter("phoneNumber"));
				request.setAttribute("Notification", "Create fail!");
				RequestDispatcher rd= request.getServletContext().getRequestDispatcher("/WEB-INF/views/Home/Register.jsp");
				rd.forward(request, response);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
