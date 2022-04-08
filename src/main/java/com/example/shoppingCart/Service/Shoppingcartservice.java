package com.example.shoppingCart.Service;

import com.example.shoppingCart.Models.Basket;
import com.example.shoppingCart.Models.Product;
import com.example.shoppingCart.repo.BasketRepository;
import com.example.shoppingCart.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shoppingcartservice {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    BasketRepository basketRepository;

//    public void createBasket() {
//
//    }

    public Basket addProductToBasket(Basket basket) {
        return basketRepository.save(basket);
    }

//    public void removeProduct() {
//
//    }

//    public void UpdateProductInBasket() {
//
//    }

    public List<Product> showAllProducts() {
        return productRepository.findAll();
    }
}