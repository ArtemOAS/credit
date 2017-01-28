package com.dao.impl;

import com.dao.CustomerDataBase;
import com.dto.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
    @Transactional
    public long getCountBank(String sum, String period) {
        TypedQuery<Long> query = entityManager.createQuery(
                "SELECT COUNT(c) FROM Customer c where c.sumCredit = ?1 and c.periodCredit = ?2", Long.class);
        query.setParameter(1, sum);
        query.setParameter(2, period);

        return query.getSingleResult();
    }
}
