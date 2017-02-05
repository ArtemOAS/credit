package com.dao;

import com.entity.CreditEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BankDao {
    void addBank(CreditEntity creditEntity);
    void deleteBank(CreditEntity creditEntity);
    CreditEntity getBank(CreditEntity creditEntity);
    void updateBank(CreditEntity creditEntity);
    List<CreditEntity> getAll();
    long getCountBank(String sum, String period);
    ResponseEntity<?> getBank(String sum, String period);

}
