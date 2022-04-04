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
public class QualifiedloanPayload {
     @NotNull(message = "Field - \"Mobile number\" can not be null.")
    @NotEmpty(message = "Field - \"Mobile number\" can not be empty.")
    @NotBlank(message = "Field - \"Mobile number\" can not be blank.")
    @Pattern(regexp = "^(234[7-9]{1}[0-1]{1}[1-9]{1}[0-9]{7})|([0]{1}?[7-9]{1}?[0-1]{1}?[0-9]{8})|([0]{2}?[7-9]{1}?[0-1]{1}?[0-9]{8})$")
    private String mobileNumber;
}
