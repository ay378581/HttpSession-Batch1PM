package com.ay.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

import com.ay.bean.UserBean;
import com.ay.dao.UserLoginDAO;

public class UserLoginFilter extends HttpFilter {
       
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
	
		UserBean ub = new UserBean();
		ub.setUname(req.getParameter("uname"));
		ub.setPword(req.getParameter("pword"));
		
		ub = new UserLoginDAO().checkLogin(ub);
		if(ub == null)
		{
			req.setAttribute("msg", "Invalid Username/Password");
			req.getRequestDispatcher("Login.jsp").include(req, resp);
		}
		else {
			req.setAttribute("ubean", ub);
		}
		
		chain.doFilter(req, resp);
	}


}
