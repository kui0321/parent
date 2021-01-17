package com.bjsxt.wsk.service.impl;

import com.bjsxt.wsk.mapper.UsersMapper;
import com.bjsxt.wsk.pojo.Users;
import com.bjsxt.wsk.pojo.UsersExample;
import com.bjsxt.wsk.service.UsersService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    /**
     * 用户添加业务
     * @param users
     */
    @Override
    @Transactional
    public void addUsers(Users users) {
        this.usersMapper.insert(users);
    }

    @Override
    public List<Users> findUsers() {
        UsersExample example = new UsersExample();

        return this.usersMapper.selectByExample(example);
    }

    @Override
    public Users findUserById(Integer userid) {

        return this.usersMapper.selectByPrimaryKey(userid);
    }

    @Override
    @Transactional
    public void modifyUsers(Users users) {
        this.usersMapper.updateByPrimaryKey(users);
    }

    @Override
    @Transactional
    public void dropUsersById(Integer userid) {
        this.usersMapper.deleteByPrimaryKey(userid);
    }
}
