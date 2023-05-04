package com.crud.lover.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.crud.lover.dto.CarsDTO;

@Data
@Entity
@NoArgsConstructor
public class CarsModel {
    
    public CarsModel(CarsDTO req){
        this.modelo = req.modelo();
        this.fabricante = req.fabricante();
        this.dataFabricacao = req.dataFabricacao();
        this.valor = req.valor();
        this.anoModelo = req.anoModelo();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String modelo;

    @Column(length = 50, nullable = false)
    private String fabricante;

    @Column(length = 150, nullable = false)
    private String dataFabricacao;

    @Column(nullable = false)
    private String valor;

    @Column( nullable = false)
    private int anoModelo;

}


