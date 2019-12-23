package com.gradletdd.gradletdd.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Usuario
 */
@Data @NoArgsConstructor
public class Usuario {
    private String nome;


    public Usuario(String nome) {
        this.nome = nome;
    }

}