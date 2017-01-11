package com;

import com.dao.CustomerDataBase;
import com.entity.Customer;
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
            CustomerDataBase customerDataBase = applicationContext.getBean(CustomerDataBase.class);
            customerDataBase.getCustomer(new Customer("10", "10", "bank"));
        }
    }
}
