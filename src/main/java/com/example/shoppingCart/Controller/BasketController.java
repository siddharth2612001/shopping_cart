package com.example.shoppingCart.Controller;

import com.example.shoppingCart.Common.ApiResponse;
import com.example.shoppingCart.repo.BasketRepository;
import com.example.shoppingCart.repo.ProductRepository;
import com.example.shoppingCart.Models.Basket;
import com.example.shoppingCart.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.shoppingCart.Service.*;


import java.util.HashMap;
import java.util.List;

//@RequestMapping("/basket")
@RestController
public class BasketController {

    @Autowired
    Shoppingcartservice shoppingcartservice;

    @Autowired
    BasketRepository basketRepository;

    @Autowired
    ProductRepository productRepository;

    HashMap<String,List<Product>> map;

    @GetMapping("/products")
    public ResponseEntity<Object> getProducts(){

        List<Product> result = shoppingcartservice.showAllProducts();

       // ResponseEntity res =  new ResponseEntity<ApiResponse>(new ApiResponse(true, "product has been added",map), HttpStatus.CREATED);
        return ApiResponse.generateResponse("Successfully added data!", HttpStatus.OK, result);
    }

    @GetMapping("/basket")
    public ResponseEntity<Object> getCartItems() {
        List<Basket> result = shoppingcartservice.showBasket();

        return ApiResponse.generateResponse("success", HttpStatus.OK, result);
    }
}
