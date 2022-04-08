package com.example.shoppingCart.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@Data
@NoArgsConstructor
public class productinfo {

    public Integer product_id;

    public Integer quantity;


}
