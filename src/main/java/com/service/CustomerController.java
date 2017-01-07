package com.service;

import com.dao.CustomerDataBase;
import com.dao.impl.CustomerDataBaseImpl;
import com.entity.Data;
import com.entity.DataCustomer;
import com.entity.tags.Customer;
import com.utils.FillerEntity;
import com.utils.JaxbUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@PropertySource("classpath:application.properties")
@PropertySource(value = "file:${prop.file}", ignoreResourceNotFound = true)
@Controller
public class CustomerController {

    @RequestMapping(value = "/")
    public String test() {
        return "index";
    }

    @RequestMapping(value = "/resource/", method = RequestMethod.POST)
    public ResponseEntity<?> greetingForm(@RequestBody DataCustomer dataCustomer) {
        // check the submitted username and password
        if(dataCustomer.getUsername().equals("nayan") && dataCustomer.getPassword().equals("pass")){
            return new ResponseEntity<>(null, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}
