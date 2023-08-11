// medicine-list.component.ts
import { Component, OnInit } from '@angular/core';
import { MedicineService } from '../medicine.service';
import { Medicine } from '../models/medicine.model';

@Component({
  selector: 'app-medicine-list',
  templateUrl: './medicine-list.component.html',
})
export class MedicineListComponent implements OnInit {
  medicines: Medicine[] = [];

  constructor(private medicineService: MedicineService) {}

  ngOnInit(): void {
    this.medicineService.getAllMedicines().subscribe((data: Medicine[]) => {
      this.medicines = data;
    });
  }
}

// medicine-list.component.html
<ul>
  <li *ngFor="let medicine of medicines">
    {{ medicine.name }} - {{ medicine.price }}
  </li>
</ul>
