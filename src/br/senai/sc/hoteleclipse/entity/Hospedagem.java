package br.senai.sc.hoteleclipse.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Hospedagem {


@Id
private Integer id;
@Column
private String nome;
private String categoriaQuartos;
@Column
private Integer quantidadePessoas ;	
private Date entrada;
private Date saida;



public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
public String getCategoriaQuartos() {
	return categoriaQuartos;
}
public void setCategoriaQuartos(String categoriaQuartos) {
	this.categoriaQuartos = categoriaQuartos;
}
public Integer getQuantidadePessoas() {
	return quantidadePessoas;
}
public void setQuantidadePessoas(Integer quantidadePessoas) {
	this.quantidadePessoas = quantidadePessoas;
}

public Date getEntrada() {
	return entrada;
}
public void setEntrada(Date entrada) {
	this.entrada = entrada;
}
public Date getSaída() {
	return saida;
}
public void setSaída(Date saída) {
	this.saida = saída;
}




	

}
