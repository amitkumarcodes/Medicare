package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Cart;
import com.model.CartDetail;
import com.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public Cart getCart() {
        return cartService.getCart();
    }

    @PostMapping
    public void addItem(@RequestBody CartDetail cartDetail) {
        cartService.addItem(cartDetail);
    }

    @DeleteMapping
    public void removeItem(@RequestBody CartDetail cartDetail) {
        cartService.removeItem(cartDetail);
    }

 
}
