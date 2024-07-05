package com.ay.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

import com.ay.bean.ProductBean;
import com.ay.bean.UserBean;
import com.ay.dao.UserRegisterDAO;

public class UserRegisterFilter extends HttpFilter {

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		UserBean ub = new UserBean();
		ub.setFname(req.getParameter("fname"));
		ub.setLname(req.getParameter("lname"));
		ub.setUname(req.getParameter("uname"));
		ub.setPword(req.getParameter("pword"));
		ub.setPid(req.getParameter("pid"));

		ProductBean pb = new ProductBean();
		pb.setId(req.getParameter("pid"));
		pb.setName(req.getParameter("pname"));
		pb.setPrice(Float.parseFloat(req.getParameter("price")));
		pb.setQty(Integer.parseInt(req.getParameter("qty")));

		int k = new UserRegisterDAO().registerUser(ub, pb);
		if(k > 0)
		{
			req.setAttribute("ubean", ub);
			req.setAttribute("pbean", pb);
			req.setAttribute("msg", "Register Successfully");
			
		}else {
			req.setAttribute("msg", "Invalid Inputs");
			req.getRequestDispatcher("index.jsp").forward(req, res);
		}
		chain.doFilter(req, res);
	}

}
