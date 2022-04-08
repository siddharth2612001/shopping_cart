package com.example.shoppingCart.repo;

import com.example.shoppingCart.Models.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket,Integer> {
}
