package com.hfq.eshop.commom.dao.impl;

import com.hfq.eshop.commom.dao.BaseDao;
import com.hfq.eshop.commom.dao.IDataAccess;

import java.util.List;

public class TXTDataAccess implements IDataAccess {
    /**
     * 获取数据列表
     * 1.根据实体类的字节码文件对象获取类名
     * 2.根据类名获取用户数据文件名
     * 3.合成数据文件路径
     * 4.使用文件操作工具类读取文件中的字符串数据
     * 5.将字符串数据装换成List<User>对象并返回
     * @param clazz
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> List<T> getList(Class<T> clazz) throws Exception{
        return  null;
    }
}
