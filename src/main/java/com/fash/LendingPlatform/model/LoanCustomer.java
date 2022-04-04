/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author ofasina
 */
@Entity
@Table(name = "loan_cuatomer")
@Data
public class LoanCustomer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "wallet_number")
    private String walletNumber;
    @Column(name = "qualified_loan_amount")
    private String qualifiedLoanAmount;

}
