/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.payload;

import java.util.List;
import lombok.Data;

/**
 *
 * @author ofasina
 */
@Data
public class LendingResponsePayload {

    private String responseCode;
    private String responseMessage;
    private List<LoanOfferPayload> loanOffers;

}
