package com.gradletdd.gradletdd.entities;

import lombok.Data;

/**
 * Filme
 */
@Data
public class Filme {

    private String nome;
    private Integer estoque;
    private Double precoLocacao;

    public Filme(String nome, Integer estoque, Double precoLocacao) {
        this.nome = nome;
        this.estoque = estoque;
        this.precoLocacao = precoLocacao;
    }             
    
}