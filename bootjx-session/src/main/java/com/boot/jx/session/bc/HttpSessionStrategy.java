package com.boot.jx.session.bc;

import org.springframework.boot.web.servlet.server.Session;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface HttpSessionStrategy {

	String getRequestedSessionId(HttpServletRequest request);

	void onNewSession(Session session, HttpServletRequest request, HttpServletResponse response);

	void onInvalidateSession(HttpServletRequest request, HttpServletResponse response);

}
