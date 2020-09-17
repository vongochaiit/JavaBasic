package servlet.useraccount;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UserAccount;
import bo.UserAccountBO;

/**
 * Servlet implementation class EditUserAccount
 */
@WebServlet("/Management/UserAccount/Edit")
public class EditUserAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserAccountBO userBO = new UserAccountBO();
		try {
			beans.UserAccount user = userBO.getInforUserAccount(request.getParameter("userId"));
			request.setAttribute("userId", request.getParameter("userId"));
			request.setAttribute("userName", user.getUserName());
			request.setAttribute("firstName", user.getFirstName());
			request.setAttribute("lastName", user.getLastName());
			request.setAttribute("dateOfBirth", user.getDateOfBirth());
			request.setAttribute("phoneNumber", user.getPhoneNumber());
			request.setAttribute("point", user.getPoint());
		
			request.getServletContext().getRequestDispatcher("/WEB-INF/views/Admin/UserAccount/Edit.jsp").forward(request, response);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		UserAccountBO userBO = new UserAccountBO();
		UserAccount user = new UserAccount();
		try {
			
			user.setUserId(request.getParameter("userId"));
			user.setUserName(request.getParameter("userName"));
			user.setFirstName(request.getParameter("firstName"));
			user.setLastName(request.getParameter("lastName"));
			user.setDateOfBirth(request.getParameter("dateOfBirth"));
			user.setPhoneNumber(request.getParameter("phoneNumber"));
			user.setPoint(Integer.parseInt( request.getParameter("point")));

			if(userBO.editUserAccount(user, request.getParameter("userId"))){
				response.sendRedirect(request.getContextPath()+"/Management/UserAccount");
			}else{
				request.setAttribute("Notification", "Update failed!");
				request.getServletContext().getRequestDispatcher("/WEB-INF/views/Admin/UserAccount/Edit.jsp").forward(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
