package com.gradletdd.gradletdd.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import com.gradletdd.gradletdd.entities.Filme;
import com.gradletdd.gradletdd.entities.Locacao;
import com.gradletdd.gradletdd.entities.Usuario;
import com.gradletdd.gradletdd.exceptions.FilmeSemEstoqueException;
import com.gradletdd.gradletdd.exceptions.LocadoraException;
import com.gradletdd.gradletdd.repositories.LocacaoRepository;


/**
 * LocacaoService
 */
public class LocacaoService {

    private LocacaoRepository repository;

    public Locacao alugarFilme(Usuario usuario, List<Filme> filmes) throws LocadoraException, FilmeSemEstoqueException {
        
        if (usuario == null) {
            throw new LocadoraException("Usuário vázio");
        }

        if (filmes == null || filmes.isEmpty()) {
            throw new LocadoraException("Filme vazio");
        }

        for (Filme f: filmes) {
            if (f.getEstoque() == 0) {
                throw new FilmeSemEstoqueException();
            }
        }

        Locacao locacao = new Locacao();
        locacao.setFilmes(filmes);
        locacao.setUsuario(usuario);
        locacao.setDataLocacao(LocalDate.now());

        Double valorTotal = 0d;
        for (int i = 0; i < filmes.size(); i++) {
            Filme f = filmes.get(i);
            Double valorFilme = f.getPrecoLocacao();
            switch(i) {
                case 2: 
                    valorFilme *= 0.75;
                    break;
                case 3:
                    valorFilme *= 0.5;
                    break;
                case 4:
                    valorFilme *= 0.25;
                    break;
                case 5:
                    valorFilme = 0d;
                    break;
            }
            valorTotal += valorFilme;
        }
        locacao.setValor(valorTotal);

        LocalDate dataEntrega = LocalDate.now().plusDays(1);
        if (dataEntrega.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            dataEntrega = dataEntrega.plusDays(1);
        }
        locacao.setDataRetorno(dataEntrega);
        repository.salvar(locacao);
        return locacao;
    }

    public void setLocacaoRepository(LocacaoRepository repository) {
        this.repository = repository;
    }
    
}