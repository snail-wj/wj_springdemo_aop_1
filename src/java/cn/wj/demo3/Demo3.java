package cn.wj.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by WJ on 2017/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo3 {

    @Resource(name = "customerDao")
    private CustomerDaoImpl customerDao;

    @Test
    public void run1(){
        customerDao.save();
        customerDao.update();
    }
}
