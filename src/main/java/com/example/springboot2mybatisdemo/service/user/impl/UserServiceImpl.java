package com.example.springboot2mybatisdemo.service.user.impl;


import com.example.springboot2mybatisdemo.dao.UserDao;
import com.example.springboot2mybatisdemo.model.UserDomainVO;
import com.example.springboot2mybatisdemo.service.user.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;//这里会报错，但是并不会影响
    @Override
    public PageInfo<UserDomainVO> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomainVO> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;

    }
}
