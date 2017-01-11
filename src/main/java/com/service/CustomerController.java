package com.service;

import com.dao.CustomerDataBase;
import com.entity.DataCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@PropertySource("classpath:application.properties")
@PropertySource(value = "file:${prop.file}", ignoreResourceNotFound = true)
@Controller
public class CustomerController {

    @Autowired
    CustomerDataBase customerDataBase;

    @RequestMapping(value = "/")
    public String main() {
        return "index";
    }

    @RequestMapping(value = "/resource/", method = RequestMethod.POST)
    public ResponseEntity<?> creditDataForm(@RequestBody DataCustomer dataCustomer) {

        int result = customerDataBase.getCountBank(dataCustomer.getSumCreditClient(), dataCustomer.getPeriodCreditClient());

        if(dataCustomer.getSumCreditClient()!=null && dataCustomer.getPeriodCreditClient()!=null){
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }

}
