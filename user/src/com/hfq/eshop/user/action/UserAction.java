package com.hfq.eshop.user.action;

import com.hfq.eshop.commom.action.BaseAction;
import com.hfq.eshop.commom.entity.Msg;
import com.hfq.eshop.user.entity.User;
import com.hfq.eshop.user.service.UerService;
import com.hfq.eshop.user.service.impl.UserServiceImpl;
import unit.JSONUtil;

/**
 * 用户控制器类
 * 处理所有用户的后台操作，并返回JSON格式的字符串消息
 */
public class UserAction extends BaseAction {
    private String username;//用户名
    private String password;//密码

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户登录功能
     * 1.封装数据到User对象
     * 2.调用UserService处理逻辑
     * User login（User user） throws Exception；
     * 3.异常处理
     * 4.根据服务层返回结果生成消息
     * 消息实体类Msg
     * 5.记录日志（待开发）
     * 6.相应消息到客户端
     * @return
     */
    public String login(){
//        System.out.println("username:"+username);
//        System.out.println("password:"+password);
        //1
        Msg msg = new Msg();
        try{
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            //2
            UerService uerService = new UserServiceImpl();
            user = uerService.login(user);

            //4
            if (user != null){
                msg.setType(Msg.SUCCESS);
                msg.setMsg("登陆成功");
            }else {
                msg.setType(Msg.FAIL);
                msg.setMsg("登陆失败，用户名或密码不正确");
            }
            return JSONUtil.entity2JSON(msg);
        }catch (Exception e){
            e.printStackTrace();
            msg.setType(Msg.FAIL);
            msg.setMsg("服务器异常");
            return JSONUtil.entity2JSON(msg);
        }
    }
}
