package com.ecommerce.shoply.data.dto;

import com.ecommerce.shoply.data.model.Currency;
import lombok.Data;


@Data
public class ProductUpdateForm {
    private String name;
    private Double price;
    private Currency currency;
    private String details;
}
