package com.example.SpringbootApi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringbootApi.reqDto.LoginDto;
import com.example.SpringbootApi.resDto.UserDataDto;
import com.example.SpringbootApi.service.UserService;

@RestController
public class UserDataController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userdata")
	public UserDataDto userData(@RequestParam(value = "loginDto") String userid) {
		System.out.println(userid);
		return userService.selectUserDataByUserAccountAndUserPassword("123456","123456");
	}
	

}
