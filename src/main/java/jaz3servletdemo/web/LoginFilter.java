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

import jaz3servletdemo.repo.impl.Login;

@WebFilter("LoginServlet")
public class LoginFilter implements Filter {

    public LoginFilter() {
        
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
			try {
				if(Login.checkPassword(name, pwd)){
					chain.doFilter(request, response);
				}
			} catch (Exception e) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("loginError.jsp");
				dispatcher.forward(request, response);
				e.printStackTrace();
			}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
