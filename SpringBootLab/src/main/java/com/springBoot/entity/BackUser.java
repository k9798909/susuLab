package com.springBoot.entity;

import java.io.Serializable;
import java.time.LocalDate;


import lombok.Data;

@Data
public class BackUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2613390311402356551L;
	
	private String account;
	private String password;
	private String name;
	private LocalDate birthday;
	private String id;
}
