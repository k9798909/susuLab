package com.example.SpringbootApi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "userdata")
@Entity
public class UserData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2569646482994670867L;
	@Id
	@Column(name = "userid")
	private String userId;
	@Column(name = "useraccount")
	private String userAccount;
	@Column(name = "userpassword")
	private String userPassword;
	@Column(name = "username")
	private String userName;
	@Column(name = "useridno")
	private String userIdno;

}
