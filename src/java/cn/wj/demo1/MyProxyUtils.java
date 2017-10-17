package cn.wj.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK的方式生成代理对象
 * Created by WJ on 2017/10/18
 */
public class MyProxyUtils {
    public static UserDao getProxy(final UserDao dao) {
        //使用Proxy类生成代理对象
        UserDao proxy = (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
            // 代理对象方法一执行，invoke方法就会输入一次
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if("save".equals(method.getName())){
                    System.out.println("正在保存中...");
                }
                // 让dao的save和update的正常执行
                return method.invoke(dao,args);
            }
        });
        //返回代理对象
        return proxy;
    }
}
