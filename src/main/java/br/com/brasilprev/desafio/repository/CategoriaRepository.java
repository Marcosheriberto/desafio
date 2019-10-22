package br.com.brasilprev.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brasilprev.desafio.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria ,Long>{

}
