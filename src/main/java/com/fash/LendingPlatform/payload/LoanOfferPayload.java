/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.payload;

import lombok.Data;

/**
 *
 * @author ofasina
 */
@Data
public class LoanOfferPayload {
    
    private String loanAmount;
    private String loanType;
    private String tenure;
    private String interestRate;
    
}
