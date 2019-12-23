package com.gradletdd.gradletdd.entities;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

/**
 * Locacao
 */
@Data
public class Locacao {

    private Usuario usuario;
    private List<Filme> filmes;
    private LocalDate dataLocacao;
    private LocalDate dataRetorno;
    private Double valor;
}