package com.springBoot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class LoginDto {
	@JsonProperty("account")
	private String account;
	@JsonProperty("password")
	private String password;
	@JsonProperty("msg")
	private String msg;
	@JsonProperty("isLogin")
	private boolean isLogin;
}

