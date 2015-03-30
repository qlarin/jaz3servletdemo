package jaz2servletdemo.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jaz2servletdemo.repo.impl.Login;

@WebFilter({"userProfile.jsp","service.jsp"})
public class ProfileFilter implements Filter {

  
    public ProfileFilter() {
       
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpSession session = ((HttpServletRequest) request).getSession();
		String nickname = (String) session.getAttribute("nickname");
			try {
				if(Login.checkLoged(nickname)){
					chain.doFilter(request, response);
				}
			} catch (Exception e) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("accessDenied.jsp");
				dispatcher.forward(request, response);
				e.printStackTrace();
			}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
