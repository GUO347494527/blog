package com.ljy.blog.admin.service;

import com.ljy.blog.admin.domain.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User getUserByLoginName(String loginName);
}
