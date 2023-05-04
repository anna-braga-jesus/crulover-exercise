package com.crud.lover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.lover.models.CarsModel;

@Repository
public interface CarsRepository extends JpaRepository<CarsModel, Long> {
    
}
