package com.hfq.eshop.client;

/**
 * 客户端顶层父类
 * 处理公共的用户操作
 */
public class Client {
    /** 全局的用户操作 代表登录功能*/
    public static final String LOGIN = "L";
    /** 全局的用户操作 代表返回上一次操作记录功能*/
    public static final String HISTORY = "I";
    /** 全局的用户操作 代表返回首页功能*/
    public static final String INDEX = "I";

    public static void main(String[] args) {
        Client c = new Client();
        c.start();
    }

    public void start(){
        UserClient userClient = new UserClient();
        String result = userClient.showLogin();

        if(result.equals(INDEX)){
            System.out.println("这是首页");
        }else if(result.equals(HISTORY)){
            System.out.println("这是历史界面");
        }else if(result.equals(LOGIN)){
            System.out.println("这是登录界面");
        }else {
            System.out.println("出错了");
        }
    }

}
