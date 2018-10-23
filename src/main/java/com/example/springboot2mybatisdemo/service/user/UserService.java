package com.example.springboot2mybatisdemo.service.user;

import com.example.springboot2mybatisdemo.model.UserDomainVO;
import com.github.pagehelper.PageInfo;

public interface UserService<T> {
    PageInfo<UserDomainVO> findAllUser(int pageNum, int pageSize) throws InstantiationException, IllegalAccessException;
    int  findSconedNumber(Class<T> tClass);
}
