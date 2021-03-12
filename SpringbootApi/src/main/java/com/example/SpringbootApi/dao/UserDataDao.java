package com.example.SpringbootApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringbootApi.domain.UserData;

public interface UserDataDao extends JpaRepository<UserData, String> {

	UserData findByUserAccountAndUserPassword(String userAccount,String userPassword);

}
