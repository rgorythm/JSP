package com.com.InterceptorEx;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
									//얘를상속받아야해
public class InterceptorEx extends HandlerInterceptorAdapter{
	// 쉬프트 알트 v 4개메소드있음
	@Override
					//preHandle  컨트롤러 가기전에 실행되는메소드 리턴값이 참이면 컨트롤러로 거짓이면 컨트롤러로안가
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		return super.preHandle(request, response, handler);
	}
	
	@Override
					//postHandle 컨트롤러가 호출되고 화면이 보이기직전에 실행되는메소드
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
	@Override
					//컨트롤러가 처리를 다끝낸후에 실행되는메소드
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
					//얘는뭐야  servlet3.0 후 비동기요청?시에 postHandle afterCompletion 은실행되지않고 얘가실행된대
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
}
//dispatcherServlet에 실행설정해야됨
