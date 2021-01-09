package com.hfq.eshop.client;

import com.hfq.eshop.commom.entity.Msg;
import com.hfq.eshop.user.action.UserAction;
import unit.JSONUtil;

import java.util.Scanner;

/**
 * 用户操作界面
 * 所有和用户操作相关的内容，都放在这个类
 */
public class UserClient extends Client{
    /**
     * 用户操作界面
     * 1.使用控制台提示用户输入用户名，密码
     * 2.向服务器发送请求，并接收返回消息字符串
     * 使用setter方法把数据传递给Action
     * 调用Action的登录功能
     * 3.解析消息字符串，提示用户信息
     * 4.页面跳转，使用字符串常量作为跳转标记
     * 成功返回上一次操作的页面
     * 失败返回登录界面
     * @return
     */
    public String showLogin(){
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        //2
        UserAction userAction = new UserAction();
        userAction.setUsername(username);
        userAction.setPassword(password);
        String result = userAction.login();
        //3
        Msg msg = JSONUtil.JSON2Entity(result, Msg.class);
        if (msg.getType().equals(Msg.SUCCESS)){
            System.out.println(msg.getMsg());
            return HISTORY;
        }else{
            System.out.println(msg.getMsg());
            return LOGIN;
        }
    }
}
