package com.gradletdd.gradletdd.builders;

import java.time.LocalDate;
import java.util.Arrays;

import com.gradletdd.gradletdd.entities.Filme;
import com.gradletdd.gradletdd.entities.Locacao;
import com.gradletdd.gradletdd.entities.Usuario;

import static com.gradletdd.gradletdd.builders.FilmeBuilder.umFilme;
import static com.gradletdd.gradletdd.builders.UsuarioBuilder.umUsuario;

/**
 * LocacaoBuilder
 */
public class LocacaoBuilder {

    private Locacao elemento;
    
    private LocacaoBuilder() {}

    public static LocacaoBuilder umLocacao() {
        LocacaoBuilder builder = new LocacaoBuilder();
        inicializarDadosPadroes(builder);
        return builder;
    }

    public static void inicializarDadosPadroes(LocacaoBuilder builder) {
        builder.elemento = new Locacao();
        Locacao elemento = builder.elemento;
        elemento.setUsuario(umUsuario().agora());
        elemento.setFilmes(Arrays.asList(umFilme().agora()));
        elemento.setDataLocacao(LocalDate.now());
        elemento.setDataRetorno(LocalDate.now().plusDays(1));
        elemento.setValor(4.0);
    }

    public LocacaoBuilder comUsuario(Usuario param) {
        elemento.setUsuario(param);
        return this;
    }

    public LocacaoBuilder comUsuario(Filme ...params) {
        elemento.setFilmes(Arrays.asList(params));
        return this;
    }

    public LocacaoBuilder comDataLocacao(LocalDate param) {
        elemento.setDataLocacao(param);
        return this;
    }

    public LocacaoBuilder comDataRetorno(LocalDate param) {
        elemento.setDataRetorno(param);
        return this;
    }

    public LocacaoBuilder comValor(Double param) {
        elemento.setValor(param);
        return this;
    }

    public Locacao agora() {
        return elemento;
    }



    
    
}