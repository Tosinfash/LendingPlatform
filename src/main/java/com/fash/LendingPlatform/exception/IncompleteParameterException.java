/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author bokon
 */
@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY, reason = "Required parameter not supplied")
public class IncompleteParameterException extends Exception{

    public IncompleteParameterException() {
    }

}
