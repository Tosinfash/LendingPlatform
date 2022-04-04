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
@Table(name = "loan_product")
@Data
public class LoanProduct implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "product_type")
    private String productType;
    @Column(name = "max_limit")
    private String maxLimit;
    @Column(name = "interest_percentage")
    private String interestPercentage;
    @Column(name = "tenure")
    private String tenure;
}
