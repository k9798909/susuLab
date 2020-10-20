package com.springBoot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springBoot.dto.BackUserDto;
import com.springBoot.dto.LoginDto;
import com.springBoot.entity.BackUser;
import com.springBoot.service.BackUserService;

@RequestMapping("backUser/")
@RestController
public class BackUserController {
	
	@Autowired
	BackUserService userService;
	
	@GetMapping
	public List<BackUser> listAll(){
		return userService.ListAll(); 
	}
	
	@PostMapping("login")
	public LoginDto login(@RequestBody LoginDto dto){
		return userService.userLogin(dto); 
	}
	
	@PostMapping("userData")
	public BackUserDto userData(@RequestBody String account){
		return userService.userData(account); 
	}
	
}
