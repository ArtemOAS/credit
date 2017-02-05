package com;

import com.dao.BankDao;
import com.entity.CreditEntity;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.annotations.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestHibernate {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);


    @Test
    public void test(){
        for (int i = 0; i<15; i++){
            BankDao bankDao = applicationContext.getBean(BankDao.class);
            bankDao.getBank(new CreditEntity("10", "10", "bankDao"));
        }
    }


}
