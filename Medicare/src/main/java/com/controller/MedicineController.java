package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.Medicine;
import com.service.MedicineService;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }

    @GetMapping("/{id}")
    public Medicine getMedicineById(@PathVariable Long id) {
        return medicineService.getMedicineById(id)
                .orElseThrow(() -> new IllegalArgumentException("Medicine not found"));
    }

    @PostMapping
    public Medicine saveMedicine(@RequestBody Medicine medicine) {
        return medicineService.saveMedicine(medicine);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicine(@PathVariable Long id) {
        medicineService.deleteMedicine(id);
    }

    
}
