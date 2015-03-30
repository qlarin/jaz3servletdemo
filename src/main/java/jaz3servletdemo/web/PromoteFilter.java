package jaz3servletdemo.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import jaz3servletdemo.repo.impl.Register;

@WebFilter("PromoteServlet")
public class PromoteFilter implements Filter {

    
    public PromoteFilter() {
        
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String user = request.getParameter("username");
		if(Register.getRegistered(user).getTask().equals("Common User") || Register.getRegistered(user).getTask().equals("Premium User")){
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("premError.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
