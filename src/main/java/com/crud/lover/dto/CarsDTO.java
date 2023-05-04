package com.crud.lover.dto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record CarsDTO(

    @NotNull @Size(min = 2, max = 15)
    String modelo,

    @NotNull
    String fabricante,

    @NotNull
    String dataFabricacao,

    @NotNull @Positive
    String valor,

    @NotNull
    int anoModelo) {
    
    }