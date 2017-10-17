package cn.wj.demo1;

import org.junit.Test;

/**
 * Created by WJ on 2017/10/18.
 */
public class Demo1 {

    @Test
    public void run1(){
        // 目标对象
        UserDao userDao = new UserDaoImpl();
        UserDao proxy = MyProxyUtils.getProxy(userDao);
        //调用代理对象
        proxy.save();
        proxy.update();
    }
}
