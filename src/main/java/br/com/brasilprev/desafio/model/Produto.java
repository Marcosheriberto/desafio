package br.com.brasilprev.desafio.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@OneToOne
	private Categoria idCategoria;
	
	private String produto;
	
	private BigDecimal preco;
	
	private int quantidade;
	
	private String descricao;
	
	private String foto;
	
}
