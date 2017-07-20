package com.airport.model.web;


import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.validator.constraints.NotBlank;
public class Credentials implements Serializable{
	
	
	private static final long serialVersionUID = -2292485353776518099L;
	
	@NotBlank(message = "global.error-blank")
	private String username;
	
	@JsonIgnore
	@NotBlank(message = "global.error-blank")
	private String password;
	
	@NotBlank(message = "global.error-blank")
	private String captcha;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

}
