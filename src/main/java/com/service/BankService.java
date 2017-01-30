package com.service;

import com.dao.Bank;
import com.dto.Credit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bankService")
public class BankService implements Bank {

    @Qualifier("bankRepository")
    @Autowired
    private Bank bank;

    @Override
    public void addBank(Credit credit) {

    }

    @Override
    public void deleteBank(Credit credit) {

    }

    @Override
    public Credit getBank(Credit credit) {
        return null;
    }

    @Override
    public void updateBank(Credit credit) {

    }

    @Override
    public List<Credit> getAll() {
        return null;
    }

    @Override
    public long getCountBank(String sum, String period) {
        return 0;
    }

    @Override
    public ResponseEntity<?> getBank(String sum, String period) {
        long result = bank.getCountBank(sum, period);

        if(sum!=null && period!=null){
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }
}
