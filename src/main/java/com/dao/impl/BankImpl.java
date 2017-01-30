package com.dao.impl;

import com.dao.Bank;
import com.dto.Credit;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository("bankRepository")
public class BankImpl implements Bank {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void addBank(Credit credit) {
        entityManager.persist(credit);
    }

    @Override
    @Transactional
    public void deleteBank(Credit credit) {
        entityManager.remove(getBank(credit));
    }

    @Override
    @Transactional
    public Credit getBank(Credit credit) {
        return entityManager.find(Credit.class, credit);
    }

    @Override
    @Transactional
    public void updateBank(Credit credit) {
        entityManager.merge(credit);
    }

    @Override
    @Transactional
    public List<Credit> getAll() {
        TypedQuery<Credit> namedQuery = entityManager.createNamedQuery("Customer.getdAll", Credit.class);
        return namedQuery.getResultList();
    }

    @Override
    @Transactional
    public long getCountBank(String sum, String period) {
        TypedQuery<Long> query = entityManager.createQuery(
                "SELECT COUNT(c) FROM Credit c where c.sumCredit = ?1 and c.periodCredit = ?2", Long.class);
        query.setParameter(1, sum);
        query.setParameter(2, period);

        return query.getSingleResult();
    }

    @Override
    public ResponseEntity<?> getBank(String sum, String period) {
        return null;
    }
}
