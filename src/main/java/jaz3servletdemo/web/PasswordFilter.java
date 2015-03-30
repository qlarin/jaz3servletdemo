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

@WebFilter("RegisterServlet")
public class PasswordFilter implements Filter {

 
    public PasswordFilter() {
       
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String pwd = request.getParameter("password");
		String cpwd = request.getParameter("cpassword");
		if(pwd != null && !pwd.equals("") && pwd.equals(cpwd) && (pwd.hashCode() == cpwd.hashCode())){
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/registerError.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
