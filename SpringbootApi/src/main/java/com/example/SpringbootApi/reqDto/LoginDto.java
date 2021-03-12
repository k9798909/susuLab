package com.example.SpringbootApi.reqDto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LoginDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -994218033454216524L;
	private String userAccount;
	private String userPassword;

}
