package com.hfq.eshop.user.dao;

import com.hfq.eshop.commom.dao.BaseDao;
import com.hfq.eshop.user.entity.User;

import java.util.List;

public interface UserDao extends BaseDao {
    List<User> genEntityList() throws Exception;

    List<User> getEntityList();
}
