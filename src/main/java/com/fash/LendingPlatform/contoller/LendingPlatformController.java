/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.contoller;

import com.fash.LendingPlatform.exception.AuthorizationCredentialException;
import com.fash.LendingPlatform.exception.IncompleteParameterException;
import com.fash.LendingPlatform.payload.LendingRequestPayload;
import com.fash.LendingPlatform.service.LendingPlatformService;
import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ofasina
 */
@RestController
public class LendingPlatformController {

    @Autowired
    MessageSource messageSource;
    @Autowired
    Gson gson;
    @Autowired
    Environment env;
    @Autowired
    LendingPlatformService lendingPaltformService;

    @PostMapping(value = {"/loan/offer-list"}, consumes = {"application/json"}, produces = {"application/json"})
    @ResponseBody

    public String loanOfferRequest(@RequestHeader(value = "Authorization") String authorization, @Valid @RequestBody LendingRequestPayload requestPayload, HttpServletRequest request, HttpServletResponse response) throws AuthorizationCredentialException, IncompleteParameterException,
            Exception {

        //Check the request header
        Boolean requestHeaderValid = lendingPaltformService.checkRequestHeaderValidity(authorization);
        if (!requestHeaderValid) {
            throw new AuthorizationCredentialException();
        }

        String result = lendingPaltformService.loanOffer(requestPayload);
        return result;
    }

    @PostMapping(value = {"/loan-offer/apply"}, consumes = {"application/json"}, produces = {"application/json"})
    @ResponseBody
    public String loanOfferApplication(@RequestHeader("Authorization") String authorization, @Valid @RequestBody LendingRequestPayload requestBody, HttpServletRequest request, HttpServletResponse response) throws AuthorizationCredentialException, IncompleteParameterException {
         //Check the request header
        Boolean requestHeaderValid = lendingPaltformService.checkRequestHeaderValidity(authorization);
        if (!requestHeaderValid) {
            throw new AuthorizationCredentialException();
        }
        return lendingPaltformService.loanOfferApplication(requestBody);
    }

}
