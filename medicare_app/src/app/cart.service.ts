// cart.service.ts
import { Injectable } from '@angular/core';
import { Medicine } from './models/medicine.model';

@Injectable({
  providedIn: 'root',
})
export class CartService {
  private cart: Medicine[] = [];

  addToCart(medicine: Medicine): void {
    this.cart.push(medicine);
  }

  removeFromCart(medicine: Medicine): void {
    const index = this.cart.indexOf(medicine);
    if (index > -1) {
      this.cart.splice(index, 1);
    }
  }

  getCart(): Medicine[] {
    return this.cart;
  }

  // Other cart-related logic
}
