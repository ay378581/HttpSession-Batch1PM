package com.ay.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
		rd.include(req, resp);
	}

}
