package com.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
   
}
