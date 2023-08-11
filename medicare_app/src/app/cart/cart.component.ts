// cart.component.ts
import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';
import { Medicine } from '../models/medicine.model';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
})
export class CartComponent implements OnInit {
  cart: Medicine[] = [];

  constructor(private cartService: CartService) {}

  ngOnInit(): void {
    this.cart = this.cartService.getCart();
  }

  // Additional methods to manage cart, such as adding/removing items
}

// cart.component.html
<ul>
  <li *ngFor="let item of cart">
    {{ item.name }} - {{ item.price }}
    <button (click)="removeFromCart(item)">Remove</button>
  </li>
</ul>
