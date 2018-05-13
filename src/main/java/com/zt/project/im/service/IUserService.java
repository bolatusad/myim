package com.zt.project.im.service;

import com.zt.project.im.bean.User;

import java.util.List;

/**
 * @Author：ZhangTao
 * @Description:
 * @Date: Created in 13:12 2018/3/26
 */
public interface IUserService {
    List<User> getUserInfo();

    void insert(User user);

    /**
     * 添加用户信息
     * @param user
     */
    void addUser(User user);

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    User getUser(String username);
}

