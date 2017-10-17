package cn.wj.demo2;

import org.junit.Test;

/**
 * Created by WJ on 2017/10/18.
 */
public class Demo1 {

    @Test
    public void run1(){
        BookDaoImpl bookDao = new BookDaoImpl();
        bookDao.save();
        bookDao.update();
        System.out.println("---------------------------------");
        // 使用CGLIB方式生成代理对象
        BookDaoImpl proxy = MyCglibUtils.getProxy();
        proxy.save();
        proxy.update();
    }
}
