package com.spring.micro.project.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	private String username;
	private String password;

//	{
//	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0YW5pYSIsImV4cCI6MTU4MzA5Mjc3OCwiaWF0IjoxNTgyNDg3OTc4fQ._itvzvLMk5rJH47We-8r4VFGLNtgIRAWyVOKgI78HBYktX1bjmHyMZj_LFz19Ej13UvKyFWGB_33CxKE8pfYMw"
//	}

	
	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
