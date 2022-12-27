package com.demo.currencyconversionservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.Transient;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private String environment;
    private BigDecimal totalCalculatedAmount;

//    @Transient
//    public BigDecimal getTotalCalculatedAmount(){
//        return BigDecimal.valueOf(this.quantity).multiply(this.conversionMultiple);
//    }

}
