package com.ay.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ay.bean.UserBean;

public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession hs = req.getSession();
		hs.setMaxInactiveInterval(25000);

		UserBean ub = (UserBean) req.getAttribute("ubean");

		hs.setAttribute("ubean", ub);

		RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
		rd.include(req, res);
	}

}
