package com.example.shoppingCart.Models;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    public Product() {
        super();
    }

    public Product(Integer id, Integer product_id, Integer quantity, String product_name, String product_desc) {
        this.id = id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.product_name = product_name;
        this.product_desc = product_desc;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "product_id")
    public Integer product_id;
    @Column(name = "quantity")
    public Integer quantity;
    @Column(name = "product_name")
    public String product_name;
    @Column(name = "product_desc")
    public String product_desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    @Override
    public String toString() {
        return "ProductPojo{" +
                "id=" + id +
                ", product_id=" + product_id +
                ", quantity=" + quantity +
                ", product_name='" + product_name + '\'' +
                ", product_desc='" + product_desc + '\'' +
                '}';
    }
}
