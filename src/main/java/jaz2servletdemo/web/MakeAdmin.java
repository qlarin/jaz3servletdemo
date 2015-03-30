package jaz2servletdemo.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jaz2servletdemo.repo.impl.Promote;

public class MakeAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MakeAdmin() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Promote.makeAdmin(request.getParameter("username"));
		response.sendRedirect("privilegeChanged.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
