/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.service;

import com.fash.LendingPlatform.payload.LendingRequestPayload;



/**
 *
 * @author ofasina
 */
public interface LendingPlatformService {

    boolean checkRequestHeaderValidity(String authorization);

    String loanOffer(LendingRequestPayload requestPayload);
    
    String loanOfferApplication(LendingRequestPayload requestPayload);

}
