package com.dao.impl;

import com.dao.CustomerDataBase;
import com.entity.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class CustomerDataBaseImpl implements CustomerDataBase {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(Customer customer) {
        entityManager.remove(getCustomer(customer));
    }

    @Override
    @Transactional
    public Customer getCustomer(Customer customer) {
        return entityManager.find(Customer.class, customer);
    }

    @Override
    @Transactional
    public void updateCustomer(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
    @Transactional
    public List<Customer> getAll() {
        TypedQuery<Customer> namedQuery = entityManager.createNamedQuery("Customer.getdAll", Customer.class);
        return namedQuery.getResultList();
    }

    @Override
    public int getCountBank(String sum, String period) {
        Query query = entityManager.createQuery(
                "SELECT id FROM Customer where sumCredit = ?1 and periodCredit = ?2");
        query.setParameter(1, sum);
        query.setParameter(2, period);

        return  query.getResultList().size();
    }
}
