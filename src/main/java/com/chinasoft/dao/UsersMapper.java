package com.chinasoft.dao;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.entity.Users;

public interface UsersMapper {
    public Users selectUsersByNameAndPwd(@Param("username") String username,@Param("password") String password);
}