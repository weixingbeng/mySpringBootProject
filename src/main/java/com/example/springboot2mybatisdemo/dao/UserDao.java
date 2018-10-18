package com.example.springboot2mybatisdemo.dao;

import com.example.springboot2mybatisdemo.model.UserDomainVO;

import java.util.List;

public interface UserDao {
    int insert(UserDomainVO record);
    List<UserDomainVO> selectUsers();

}
