package br.senai.sc.hoteleclipse.mb;

import java.sql.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;

import br.senai.sc.hoteleclipse.dao.VendaIngressoDao;
import br.senai.sc.hoteleclipse.entity.Hospedagem;
import br.senai.sc.hoteleclipse.entity.VendaIngresso;

@ManagedBean
public class VendaIngressoMb {

	
	private VendaIngresso vendaIngresso;
	private VendaIngressoDao dao;
	private EntityManager entityManager;
	private List<VendaIngresso> listaVendaIngresso;
	private Long id;	
	private String nomeCliente;
	private Date dataEvento;
	private String setor;
	public VendaIngresso getVendaIngresso() {
		return vendaIngresso;
	}
	public void setVendaIngresso(VendaIngresso vendaIngresso) {
		this.vendaIngresso = vendaIngresso;
	}
	public VendaIngressoDao getDao() {
		return dao;
	}
	public void setDao(VendaIngressoDao dao) {
		this.dao = dao;
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	public List<VendaIngresso> getListaVendaIngresso() {
		return listaVendaIngresso;
	}
	public void setListaVendaIngresso(List<VendaIngresso> listaVendaIngresso) {
		this.listaVendaIngresso = listaVendaIngresso;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public String salvar() {
		entityManager.merge(vendaIngresso);
		return "listagemVendaIngresso";
	}

	public String editar(Long ID) {
		vendaIngresso = entityManager.find(VendaIngresso.class, ID);
		return "formcadVendaIngresso";
	}

	public String excluir(Long ID) {
		VendaIngresso vendaIngresso = entityManager.getReference(VendaIngresso.class, ID);
		entityManager.remove(vendaIngresso);
		listaVendaIngresso = null;
		return "listagemVendaIngresso";
		
	}
		

}
