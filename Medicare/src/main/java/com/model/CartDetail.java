package com.model;



public class CartDetail {
    private Medicine medicine;
    private int quantity;

    public CartDetail(Medicine medicine, int quantity) {
        this.medicine = medicine;
        this.quantity = quantity;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
