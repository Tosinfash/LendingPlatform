/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fash.LendingPlatform.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.Data;

/**
 *
 * @author ofasina
 */
@Data
public class LendingRequestPayload {

    @NotNull(message = "Field - \"Mobile number\" can not be null.")
    @NotEmpty(message = "Field - \"Mobile number\" can not be empty.")
    @NotBlank(message = "Field - \"Mobile number\" can not be blank.")
    @Pattern(regexp = "^(234[7-9]{1}[0-1]{1}[1-9]{1}[0-9]{7})|([0]{1}?[7-9]{1}?[0-1]{1}?[0-9]{8})|([0]{2}?[7-9]{1}?[0-1]{1}?[0-9]{8})$")
    private String mobileNumber;

    @NotNull(message = "Field - \"productType\" can not be null.")
    @NotEmpty(message = "Field - \"productType\" can not be empty.")
    @NotBlank(message = "Field - \"productType\" can not be blank.")
    private String productType;

    @NotNull(message = "Field - \"loanAmount\" can not be null.")
    @NotEmpty(message = "Field - \"loanAmount\" can not be empty.")
    @NotBlank(message = "Field - \"loanAmount\" can not be blank.")
    @Pattern(regexp = "^([0-9]{1,3},([0-9]{3},)*[0-9]{3}|[0-9]+)(\\.[0-9][0-9])?$")
    private String loanAmount;

    @NotNull(message = "Field - \"interestRate\" can not be null.")
    @NotEmpty(message = "Field - \"interestRate\" can not be empty.")
    @NotBlank(message = "Field - \"interestRate\" can not be blank.")
    private String interestRate;

    @NotNull(message = "Field - \"tenure\" can not be null.")
    @NotEmpty(message = "Field - \"tenure\" can not be empty.")
    @NotBlank(message = "Field - \"tenure\" can not be blank.")
    @Pattern(regexp = "[0-9]{2}")
    private String tenure;

}
