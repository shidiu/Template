package com.wcc.bootjdbc.service.impl;

import com.wcc.bootjdbc.mapper.UserMapper;
import com.wcc.bootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @Author：wcc
 * @Description：
 * @Date：Create in: 2018/10/11--9:50
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper um;
    @Override
    public String getname(HashMap<String, String> map) {
        return um.getname(map);
    }
}
