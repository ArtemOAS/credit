package com.service;

import com.dao.CustomerDataBase;
import com.entity.Customer;
import com.entity.DataCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@PropertySource("classpath:application.properties")
@PropertySource(value = "file:${prop.file}", ignoreResourceNotFound = true)
@Controller
public class CustomerController {

    @Autowired
    CustomerDataBase customerDataBase;

    @RequestMapping(value = "/")
    public String test() {
        return "index";
    }

    @RequestMapping(value = "/resource/", method = RequestMethod.POST)
    public ResponseEntity<?> greetingForm(@RequestBody DataCustomer dataCustomer) {

        int result = customerDataBase.getCountBank(dataCustomer.getSumCreditClient(), dataCustomer.getPeriodCreditClient());

        if(!dataCustomer.getSumCreditClient().equals(null) && !dataCustomer.getPeriodCreditClient().equals(null)){
            return new ResponseEntity<Integer>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<Integer>(result, HttpStatus.BAD_REQUEST);
        }
    }

}
