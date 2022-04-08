package com.example.shoppingCart.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "basket")
@AllArgsConstructor
@Data
@NoArgsConstructor


public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;

    @Embedded
    public productinfo attributes;
//    @Column(name = "product_id")
//    public String product_id;
//
//    @Column(name = "quantity")
//    public Integer quantity;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getProduct_id() {
//        return product_id;
//    }
//
//    public void setProduct_id(String product_id) {
//        this.product_id = product_id;
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "BasketPojo{" +
//                "id='" + id + '\'' +
//                ", product_id='" + product_id + '\'' +
//                ", quantity=" + quantity +
//                '}';
//    }
}
