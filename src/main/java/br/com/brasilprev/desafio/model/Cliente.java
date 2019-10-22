package br.com.brasilprev.desafio.model;

import java.io.Serializable;

import javax.persistence.Column;
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
@Table(name = "Clientes")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	 @Column(name= "NOME")
	 private String nome;
	
    @Column(name= "E_MAIL")
    private String email;

	
    @Column(name= "SENHA")
    private String senha;
	
    @Column(name= "RUA")
    private String rua;
    
    @Column(name= "CIDADE")
    private String cidade;
    
    @Column(name= "BAIRRO")
    private String bairro;
    
    @Column(name= "CEP")
    private String cep;
    
    @Column(name= "ESTADO")
    private String estado;
}
