package com.crud.lover.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crud.lover.dto.CarsDTO;
import com.crud.lover.models.CarsModel;
import com.crud.lover.services.CarsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/crudlover/cars")
public class CarsController {
    
        @Autowired
        private CarsService service;

         @GetMapping
         public List<CarsModel> getAll(){
             return service.findAll();
         }
    
         @GetMapping("/{id}")
         public Optional<CarsModel> getById(@PathVariable Long id ){
             return service.findById(id);
         }
    
         @PostMapping
         @ResponseStatus(value = HttpStatus.CREATED)
         public void create(@RequestBody @Valid CarsDTO req){
             service.create(new CarsModel(req));
         }
    
         @DeleteMapping("/{id}")
         @ResponseStatus(value = HttpStatus.NO_CONTENT)
         public void remove(@PathVariable Long id ){
             service.deleteById( id);
         }
    
         @PutMapping("/{id}")
         public void update(@PathVariable Long id, @RequestBody @Valid CarsDTO req){
             service.update(id, req);
         }


}
