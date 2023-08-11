package com.model;



import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartDetail> cartDetails;

    public Cart() {
        cartDetails = new ArrayList<>();
    }

    public List<CartDetail> getCartDetails() {
        return cartDetails;
    }

    public void setCartDetails(List<CartDetail> cartDetails) {
        this.cartDetails = cartDetails;
    }

    public void addItem(CartDetail cartDetail) {
        this.cartDetails.add(cartDetail);
    }

    public void removeItem(CartDetail cartDetail) {
        this.cartDetails.remove(cartDetail);
    }

}

