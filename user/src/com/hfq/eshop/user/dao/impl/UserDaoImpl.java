package com.hfq.eshop.user.dao.impl;

import com.hfq.eshop.commom.dao.impl.BaseDaoImpl;
import com.hfq.eshop.user.dao.UserDao;
import com.hfq.eshop.user.entity.User;

import java.util.List;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    /**
     * 调用IDataAccess获取数据并返回
     * 1.创建IDataAccess子类TXTDataAccess的对象
     *      IDataAccess dataAccess = new TXTDataAccess();
     * 2.调用该对象的方法获取所有用户数据并返回
     *      List<User> userList = dataAccess.getList(User.class);
     * @return  返回用户对象列表
     * @throws Exception
     */
    @Override
    public List<User> genEntityList() throws Exception {
        //return dataAccess.getList(User.class);
        return null;
    }

    @Override
    public List<User> getEntityList() { return null; }


}
