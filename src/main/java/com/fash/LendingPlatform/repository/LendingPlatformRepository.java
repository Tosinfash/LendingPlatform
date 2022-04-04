/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.repository;

import com.fash.LendingPlatform.model.LoanCustomer;
import com.fash.LendingPlatform.model.LoanProduct;
import java.util.List;


/**
 *
 * @author ofasina
 */
public interface LendingPlatformRepository {
    
    LoanCustomer getCustomerQualification(String mobileNumber);
    
    List<LoanProduct> getLoanList();
    
}
