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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jaz3servletdemo.repo.impl.Login;

@WebFilter({"logForm.jsp", "regForm.jsp"})
public class UserAccessFilter implements Filter {

    public UserAccessFilter() {
        
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String nickname = (String) session.getAttribute("nickname");
			try {
				if(Login.checkLoged(nickname)){
					RequestDispatcher dispatcher = request.getRequestDispatcher("userProfile.jsp");
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
