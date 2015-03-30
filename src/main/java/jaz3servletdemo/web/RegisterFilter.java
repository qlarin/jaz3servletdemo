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

@WebFilter("RegisterServlet")
public class RegisterFilter implements Filter {

    
    public RegisterFilter() {
        
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String user = request.getParameter("username");
		try {
			if(user!=null && !user.equals("") && !Register.checkRegistered(user)){
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("/registerError.jsp");
				dispatcher.forward(request, response);
			}
		} catch (Exception e) {
			chain.doFilter(request, response);
			e.printStackTrace();
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
