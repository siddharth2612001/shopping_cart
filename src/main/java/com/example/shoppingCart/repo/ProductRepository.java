package com.example.shoppingCart.repo;

import com.example.shoppingCart.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
