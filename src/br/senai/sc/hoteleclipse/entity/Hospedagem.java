package br.senai.sc.hoteleclipse.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospedagem {

	@Id
	private Integer id;
	@Column
	private String nomeCliente;
	private String categoriaQuartos;
	@Column
	private Integer quantidadePessoas;
	private Date entrada;
	private Date saída;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return saída;
	}

	public void setSaída(Date saída) {
		this.saída = saída;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
