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
	private Date sa�da;

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

	public Date getSa�da() {
		return sa�da;
	}

	public void setSa�da(Date sa�da) {
		this.sa�da = sa�da;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
