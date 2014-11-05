package br.senai.sc.hoteleclipse.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


	@Entity

	public class VendaIngresso {
	@Id
	private Integer idVendaIngresso;
	@Column
	private String nomeCliente;
	@Column
	private Date dataEvento ;	
	private String setor;
	
	public Integer getIdVendaIngresso() {
		return idVendaIngresso;
	}
	public void setIdVendaIngresso(Integer idVendaIngresso) {
		this.idVendaIngresso = idVendaIngresso;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Date getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	private String modalidade;
	
	

	


}
