package com.boot.jx.session.bc;

import org.springframework.boot.web.servlet.server.Session;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HeaderHttpSessionStrategy implements HttpSessionStrategy {

	@Override
	public void onNewSession(Session session, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onInvalidateSession(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getRequestedSessionId(HttpServletRequest request) {
		return null;
	}

	public void setHeaderName(String string) {
		// TODO Auto-generated method stub
	}

}
