package com.chinglee.ssm.serviceImpl;

import com.chinglee.ssm.mapper.UserMapper;
import com.chinglee.ssm.pojo.User;
import com.chinglee.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/11/13 0013.
 */
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }



}
