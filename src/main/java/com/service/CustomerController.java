package com.service;

import com.dao.CustomerDataBase;
import com.dao.impl.CustomerDataBaseImpl;
import com.entity.Data;
import com.entity.tags.Customer;
import com.utils.FillerEntity;
import com.utils.JaxbUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(method = RequestMethod.GET, value = "/resource/")
    public List<String> greetingForm(String data) {
        return new ArrayList<>();
    }

}
