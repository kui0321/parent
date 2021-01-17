package com.bjsxt.wsk.service;

import com.bjsxt.wsk.pojo.Users;

import java.util.List;

public interface UsersService {
    void addUsers(Users users);
    List<Users> findUsers();
    Users findUserById(Integer userid);
    void modifyUsers(Users users);
    void dropUsersById(Integer userid);
}
