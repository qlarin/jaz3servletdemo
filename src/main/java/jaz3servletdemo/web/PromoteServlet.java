package jaz3servletdemo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jaz3servletdemo.repo.impl.Promote;

public class PromoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PromoteServlet() {
        super();
        
    }


	protected synchronized void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Promote.change(request.getParameter("username"));
		response.sendRedirect("privilegeChanged.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
