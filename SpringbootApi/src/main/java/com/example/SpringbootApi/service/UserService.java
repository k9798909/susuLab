package com.example.SpringbootApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringbootApi.dao.UserDataDao;
import com.example.SpringbootApi.domain.UserData;
import com.example.SpringbootApi.resDto.UserDataDto;

@Service
public class UserService {
	
	@Autowired
	private UserDataDao userDataDao;
	
	public UserDataDto selectUserDataByUserAccountAndUserPassword(String userAccount,String userPassword) {
		UserData userData = userDataDao.findByUserAccountAndUserPassword(userAccount,userPassword);
		
		return  UserDataDto.builder()
				.userId(userData.getUserId())
				.userAccount(userData.getUserAccount())
				.userPassword(userData.getUserPassword())
				.userName(userData.getUserName())
				.userIdno(userData.getUserIdno())
				.build();
				
	}
}
