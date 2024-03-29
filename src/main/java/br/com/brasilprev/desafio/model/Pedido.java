package br.com.brasilprev.desafio.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "Pedidos")
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;
	
	private Date data;
	
	@OneToOne
	private Cliente idCliente;
	
	private String status;
	
	// Poderia ter feito um Enum de staus
	// private StatusEnum status;
	
	 private int sessao;
	 
	// Poderia ter feito um Objeto Sessao
	 // private Sessao sessao;
		 
	
	
	
	
	
	
	
	
}
