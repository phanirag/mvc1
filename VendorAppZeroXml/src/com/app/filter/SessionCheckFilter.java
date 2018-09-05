package com.app.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCheckFilter implements Filter {

	List<String> nocheckUris=null;

	@Override
	public void init(FilterConfig fc) throws ServletException {
		String uris=fc.getInitParameter("NoCheckUris");
		StringTokenizer st=new StringTokenizer(uris, ",");
		nocheckUris=new ArrayList<String>();
		while(st.hasMoreTokens()){
			String s=st.nextToken();
			nocheckUris.add(s);
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		try {
			HttpServletRequest req=(HttpServletRequest)request;
			HttpServletResponse res=(HttpServletResponse)response;

			//clear cache -on logout at browser
			res.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //old browser 
			res.setHeader("Pragma","no-cache");	//new browser
			res.setDateHeader("Expires", 0); // on click logout

			//#1 read current request URI
			String reqUri=req.getRequestURI();
			//#2 check with above List exist or not?
			boolean isExist=nocheckUris.contains(reqUri);
			if(!isExist){
				//#3 if not exist == checking required

				HttpSession ses=req.getSession(false);
				if(ses==null || ses.getAttribute("userName") == null)
					res.sendRedirect(req.getContextPath()+"/mvc/showLogin");
			}
		
				
		} catch (Exception e) {
		}

		//continue same request
		chain.doFilter(request, response);
	}
	

	@Override
	public void destroy() {
		nocheckUris=null;
	}
}
