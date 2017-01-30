package com.dao;

import com.dto.Credit;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface Bank {
    void addBank(Credit credit);
    void deleteBank(Credit credit);
    Credit getBank(Credit credit);
    void updateBank(Credit credit);
    List<Credit> getAll();
    long getCountBank(String sum, String period);
    ResponseEntity<?> getBank(String sum, String period);

}
