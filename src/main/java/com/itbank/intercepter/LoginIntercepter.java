package com.itbank.intercepter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.itbank.member.MemberDTO;

public class LoginIntercepter extends HandlerInterceptorAdapter {

@Override
public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
		throws Exception {

}
@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	HttpSession session = request.getSession();
	MemberDTO login = (MemberDTO)session.getAttribute("login");
	
//	String autoid = request.getParameter("auto");
//	String saveid = request.getParameter("saveid");
//	
//	Cookie save = new Cookie("save", login.getUserid());
//	Cookie auto = new Cookie("JESSESSIONID", session.getId());
	
	if(login != null) {
//		if(autoid != null) {
//			save.setMaxAge(60 * 60 * 24);
//			save.setPath("/");
//			response.addCookie(save);
//				
//		}
//		if(saveid != null) {
//			auto.setMaxAge(7200);
//			auto.setPath("/day08_1");
//			response.addCookie(auto);	
//		}
//		
		return true;
	}
	
	response.sendRedirect("/login");
	
	
	return false;
	
	}
	
	
}
