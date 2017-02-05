package com.dao.impl;

import com.dao.BankDao;
import com.entity.CreditEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository("bankRepository")
public class BankDaoImpl implements BankDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addBank(CreditEntity creditEntity) {
        entityManager.persist(creditEntity);
    }

    @Override
    public void deleteBank(CreditEntity creditEntity) {
        entityManager.remove(getBank(creditEntity));
    }

    @Override
    public CreditEntity getBank(CreditEntity creditEntity) {
        return entityManager.find(CreditEntity.class, creditEntity);
    }

    @Override
    public void updateBank(CreditEntity creditEntity) {
        entityManager.merge(creditEntity);
    }

    @Override
    public List<CreditEntity> getAll() {
        TypedQuery<CreditEntity> namedQuery = entityManager.createNamedQuery("Customer.getdAll", CreditEntity.class);
        return namedQuery.getResultList();
    }

    @Override
    public long getCountBank(String sum, String period) {
        TypedQuery<Long> query = entityManager.createQuery(
                "SELECT COUNT(c) FROM CreditEntity c where c.sumCredit = ?1 and c.periodCredit = ?2", Long.class);
        query.setParameter(1, sum);
        query.setParameter(2, period);

        return query.getSingleResult();
    }

    @Override
    public ResponseEntity<?> getBank(String sum, String period) {
        return null;
    }
}
