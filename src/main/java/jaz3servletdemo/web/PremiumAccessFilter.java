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

import jaz3servletdemo.repo.impl.Register;

@WebFilter("premium.jsp") 
public class PremiumAccessFilter implements Filter {

   
    public PremiumAccessFilter() {
        
    }

	public void destroy() {
		
	}

	public synchronized void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession();
		String name = (String) session.getAttribute("nickname");
		if(Register.getRegistered(name).getTask().equals("Admin") || Register.getRegistered(name).getTask().equals("Premium User")){
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("premiumDenied.jsp");
			dispatcher.forward(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
