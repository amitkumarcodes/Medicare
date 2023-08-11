package com.service;


import org.springframework.stereotype.Service;

import com.model.Cart;
import com.model.CartDetail;

@Service
public class CartService {

    private Cart cart;

    public CartService() {
        this.cart = new Cart();
    }

    public void addItem(CartDetail cartDetail) {
        cart.addItem(cartDetail);
    }

    public void removeItem(CartDetail cartDetail) {
        cart.removeItem(cartDetail);
    }

    public Cart getCart() {
        return cart;
    }

  
}
