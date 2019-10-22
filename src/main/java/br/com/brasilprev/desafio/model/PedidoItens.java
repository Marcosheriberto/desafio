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
@Table(name = "PedidoItens")
public class PedidoItens {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItem;
	
	@OneToOne
	private Pedido iPedido;
	
	@OneToOne
	private Produto iProduto;
	
	private String produto;
	
	private int quantidade;
	
	private BigDecimal valor;
	
	private BigDecimal subtotal;
	
	public BigDecimal getSubtotal() {
		this.subtotal = new  BigDecimal(quantidade).multiply(valor);
		return subtotal;
	}

}
