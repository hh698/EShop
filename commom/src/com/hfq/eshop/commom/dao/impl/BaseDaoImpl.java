package com.hfq.eshop.commom.dao.impl;

import com.hfq.eshop.commom.dao.BaseDao;
import com.hfq.eshop.commom.dao.IDataAccess;

public class BaseDaoImpl implements BaseDao {
    //1.创建IDataAccess子类TXTDataAccess的对象
        protected IDataAccess dataAccess = new TXTDataAccess();

}
