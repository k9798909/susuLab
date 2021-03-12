package com.example.SpringbootApi.resDto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class UserDataDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6883967084720292925L;
	private String userId;
	private String userAccount;
	private String userPassword;
	private String userName;
	private String userIdno;
}
