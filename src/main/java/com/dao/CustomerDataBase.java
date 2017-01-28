package com.dao;

import com.entity.Customer;

import java.util.List;

public interface CustomerDataBase {
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Customer getCustomer(Customer customer);
    void updateCustomer(Customer customer);
    List<Customer> getAll();
    long getCountBank(String sum, String period);

}
