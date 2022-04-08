package com.example.shoppingCart.Models;

import javax.persistence.*;

@Entity
@Table(name = "basket")
public class Basket {

    public Basket() {
        super();
    }

    public Basket(String id, String product_id, Integer quantity) {
        this.id = id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;

    @Column(name = "product_id")
    public String product_id;

    @Column(name = "quantity")
    public Integer quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BasketPojo{" +
                "id='" + id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
