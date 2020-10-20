package com.springBoot.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BackUserDto {
	@JsonProperty("account")
	private String account;
	@JsonProperty("password")
	private String password;
	@JsonProperty("name")
	private String name;
	@JsonProperty("birthday")
	private LocalDate birthday;
	@JsonProperty("id")
	private String id;
}
