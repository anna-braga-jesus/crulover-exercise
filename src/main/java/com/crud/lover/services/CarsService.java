package com.crud.lover.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.lover.dto.CarsDTO;
import com.crud.lover.models.CarsModel;
import com.crud.lover.repository.CarsRepository;

@Service
public class CarsService {

    @Autowired
    private CarsRepository repository;

    public List<CarsModel> findAll(){
        return repository.findAll();
    }

    public Optional<CarsModel> findById(Long id){
        return repository.findById(id);
    }

    public void create(CarsModel data ){
    repository.save(data);

    }
    public void update(Long id, CarsDTO data){
        repository.findById(id).map(c -> {
            c.setModelo(data.modelo());
            c.setFabricante(data.fabricante());
            c.setDataFabricacao(data.dataFabricacao());
            c.setValor(data.valor());
            c.setAnoModelo(data.anoModelo());
            return repository.save(c);
        });
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
