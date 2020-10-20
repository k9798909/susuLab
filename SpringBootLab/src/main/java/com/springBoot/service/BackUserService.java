package com.springBoot.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springBoot.dto.BackUserDto;
import com.springBoot.dto.LoginDto;
import com.springBoot.entity.BackUser;
import com.springBoot.mapper.BackUserMapper;

@Service
public class BackUserService {

	@Autowired
	BackUserMapper backUserMapper;

	public List<BackUser> ListAll() {
		return backUserMapper.listAll().size() != 0 ? backUserMapper.listAll() : null;
	}

	public LoginDto userLogin(LoginDto dto) {
		BackUser entity = new BackUser();
		BeanUtils.copyProperties(dto, entity);
		LoginDto returnDto = new LoginDto();
		
		List<BackUser> userList = backUserMapper.findByAccount(entity.getAccount());
		entity = userList.size()!=0?userList.get(0):null;
		
		if (entity!=null && entity.getAccount().equals(dto.getAccount()) && 
entity.getPassword().equals(dto.getPassword())) {
			BeanUtils.copyProperties(entity, returnDto);
			returnDto.setLogin(true);
			returnDto.setMsg("歡迎登入");
		} else
			returnDto.setMsg("帳號或密碼錯誤");

		return returnDto;

	}
	
	public BackUserDto userData(String account) {
		List<BackUser> userList = backUserMapper.findByAccount(account);
		BackUser entity = userList.size()!=0?userList.get(0):null;
		BackUserDto returnDto = new BackUserDto();
		if(entity!=null)
			BeanUtils.copyProperties(entity, returnDto);
		return returnDto;
	}

}
