// medicine.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Medicine } from './models/medicine.model';

@Injectable({
  providedIn: 'root',
})
export class MedicineService {
  private apiUrl = 'http://localhost:8080/api/medicines';

  constructor(private http: HttpClient) {}

  getAllMedicines(): Observable<Medicine[]> {
    return this.http.get<Medicine[]>(this.apiUrl);
  }

  
}
