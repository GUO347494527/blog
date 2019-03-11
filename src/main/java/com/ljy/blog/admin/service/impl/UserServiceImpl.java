package com.ljy.blog.admin.service.impl;

import com.ljy.blog.admin.domain.User;
import com.ljy.blog.admin.domain.UserExample;
import com.ljy.blog.admin.mapper.UserMapper;
import com.ljy.blog.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserByLoginName(String loginName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andLoginNameEqualTo(loginName);
        return userMapper.selectByExample(userExample).get(0);
    }
}
