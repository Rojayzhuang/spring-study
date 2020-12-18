package com.rojay.service;

import com.rojay.dao.UserDao;
import com.rojay.dao.UserDaoImpl;

/**
 * @author Rojay
 * @version 1.0.0
 * @createTime 2020年12月18日  08:50:01
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    /**
     * 利用set动态实现值的注入
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
