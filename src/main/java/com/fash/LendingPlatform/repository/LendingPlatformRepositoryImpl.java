/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.repository;

import com.fash.LendingPlatform.model.LoanCustomer;
import com.fash.LendingPlatform.model.LoanProduct;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ofasina
 */
@Repository
@Transactional
public class LendingPlatformRepositoryImpl implements LendingPlatformRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public LoanCustomer getCustomerQualification(String mobileNumber) {
        TypedQuery<LoanCustomer> query = em.createQuery("SELECT t FROM LoanCustomer t WHERE t.mobileNumber = :mobileNumber", LoanCustomer.class)
                .setParameter("mobileNumber", mobileNumber);
        List<LoanCustomer> record = query.getResultList();
        if (record.isEmpty()) {
            return null;
        }
        return record.get(0);
    }

    @Override
    public List<LoanProduct> getLoanList() {
        TypedQuery<LoanProduct> query = em.createQuery("SELECT t FROM LoanProduct t", LoanProduct.class);
        List<LoanProduct> record = query.getResultList();
        if (record.isEmpty()) {
            return null;
        }
        return record;
    }

}
