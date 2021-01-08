package com.hfq.eshop.commom.entity;

/**
 * 实体类
 * 所有模块实体类的公共父类
 * 作用是封装数据
 */
public class Entity {
    private String id;          //数据的唯一标识
    private String createTime;  //数据的创建时间
    private String deleteTime;  //数据的删除时间
    private String isDel = "1";       //数据的删除状态 0已删除 1正常 1默认

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }
}
