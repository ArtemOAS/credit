package com.controller;

import com.dao.Bank;
import com.dto.DataCredit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankController {

    @Qualifier("bankService")
    @Autowired
    private Bank bank;

    @RequestMapping(value = "/")
    public String main() {
        return "index";
    }

    @RequestMapping(value = "/resource/", method = RequestMethod.POST)
    public ResponseEntity<?> creditDataForm(@RequestBody DataCredit dataCredit) {
        return bank.getBank(dataCredit.getSumCreditClient(), dataCredit.getPeriodCreditClient());
    }

}
