package com.service;

import com.dao.BankDao;
import com.entity.CreditEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("bankService")
@Transactional
public class BankService implements BankDao {

    @Qualifier("bankRepository")
    @Autowired
    private BankDao bank;

    @Override
    public void addBank(CreditEntity creditEntity) {

    }

    @Override
    public void deleteBank(CreditEntity creditEntity) {

    }

    @Override
    public CreditEntity getBank(CreditEntity creditEntity) {
        return null;
    }

    @Override
    public void updateBank(CreditEntity creditEntity) {

    }

    @Override
    public List<CreditEntity> getAll() {
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
