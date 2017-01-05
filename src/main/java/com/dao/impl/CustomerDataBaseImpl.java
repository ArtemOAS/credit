package com.dao.impl;

import org.springframework.stereotype.Repository;

public class CustomerDataBaseImpl {

//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public Customer addCustomer(Customer customer) {
//        entityManager.getTransaction().begin();
//        Customer customerData = entityManager.merge(customer);
//        entityManager.getTransaction().commit();
//        return customerData;
//    }
//
//    @Override
//    public void deleteCustomer(Customer customer) {
//        entityManager.getTransaction().begin();
//        entityManager.remove(getCustomer(customer));
//        entityManager.getTransaction().commit();
//    }
//
//    @Override
//    public Customer getCustomer(Customer customer) {
//        return entityManager.find(Customer.class, customer);
//    }
//
//    @Override
//    public void updateCustomer(Customer customer) {
//        entityManager.getTransaction().begin();
//        entityManager.merge(customer);
//        entityManager.getTransaction().commit();
//    }
//
//    @Override
//    public List<Customer> getAll() {
//        TypedQuery<Customer> namedQuery = entityManager.createNamedQuery("Customer.getdAll", Customer.class);
//        return namedQuery.getResultList();
//    }
}
