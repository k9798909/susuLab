package com.springBoot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.springBoot.entity.BackUser;

@Mapper
public interface BackUserMapper {
	
	@Select("SELECT * FROM BACKUSER")
	public List<BackUser> listAll();
	
	@Select("SELECT * FROM BACKUSER WHERE ACCOUNT = #{account}")
	public List<BackUser> findByAccount(String account);
}
