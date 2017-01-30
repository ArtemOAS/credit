package com;

import com.dao.Bank;
import com.dto.Credit;
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
            Bank bank = applicationContext.getBean(Bank.class);
            bank.getBank(new Credit("10", "10", "bank"));
        }
    }


}
