package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SellerDao;
import model.Seller;

/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SellerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Seller u = new Seller();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			SellerDao.createSeller(u);
			response.sendRedirect("seller-login.jsp");
		} else if (action.equalsIgnoreCase("login")) {
			Seller u = new Seller();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = SellerDao.checkEmail(email);
			if (flag == true) {
				Seller u1 = SellerDao.loginUser(u);
				if (u1 != null) {
					HttpSession session = request.getSession();
					session.setAttribute("user", u1);
					request.getRequestDispatcher("seller-home.jsp").forward(request, response);
				} else {
					request.setAttribute("msg", "password is wrong");
					request.getRequestDispatcher("seller-login.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "user not found");
				request.getRequestDispatcher("seller-login.jsp").forward(request, response);
			}
		}

		else if (action.equalsIgnoreCase("update")) {
			Seller u = new Seller();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			SellerDao.updateSeller(u);
			HttpSession session = request.getSession();
			session.setAttribute("user", u);
			request.getRequestDispatcher("seller-profile.jsp").forward(request, response);
		}

		else if (action.equalsIgnoreCase("changepass")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");

			boolean flag = SellerDao.checkOldPassword(id, op);
			if (flag == true) {
				if (np.equals(cnp)) {
					SellerDao.updatePassword(id, np);
					response.sendRedirect("seller-home.jsp");
				} else {
					request.setAttribute("msg", "New password and Confirm New Password not matched");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
				}
			}

			else {
				request.setAttribute("msg", "Old password not matched");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
			}

		}
	}

}
