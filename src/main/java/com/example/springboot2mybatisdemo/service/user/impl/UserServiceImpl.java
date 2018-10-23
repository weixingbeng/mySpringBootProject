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

    private UserServiceImpl selfService;
    @Override
    public PageInfo<UserDomainVO> findAllUser(int pageNum, int pageSize) throws InstantiationException, IllegalAccessException {
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomainVO> userDomains = userDao.selectUsers();
        for(int i=1;i<3;i++){
            for (int j =1;j<4;j++){
                try {
                    if (i != (j | 1)) {
                        System.out.println(i + "-------------" + j);
                    }
                }catch (Exception e){
                    System.out.println(e.toString());
                }
            }
        }
        int a[] = {1,2,3,4,5,6,7,8};
       System.out.println(a.length);
        PageInfo result = new PageInfo(userDomains);
        return result;

    }

    @Override
    public int findSconedNumber(Class aClass) {
        return 0;
    }


}
