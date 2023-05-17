package com.boot.jx.session.bc;

import org.springframework.boot.web.servlet.server.Session;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieHttpSessionStrategy implements HttpSessionStrategy {

	@Override
	public String getRequestedSessionId(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onNewSession(Session session, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onInvalidateSession(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	public void setCookieSerializer(DefaultCookieSerializer serializer) {
		// TODO Auto-generated method stub
	}

}
