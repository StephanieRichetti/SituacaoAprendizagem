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
	private List<VendaIngresso> listaVendaIngresso;

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

	public List<VendaIngresso> getListaVendaIngresso() {
		return listaVendaIngresso;
	}

	public void setListaVendaIngresso(List<VendaIngresso> listaVendaIngresso) {
		this.listaVendaIngresso = listaVendaIngresso;
	}

	public String salvar() {
		dao.salvar(vendaIngresso);
		return "listagemvendaIngresso";
	}

	public String editar(Long ID) {
		vendaIngresso = dao.buscarPorId(ID);
		return "formcadvendaIngresso";
	}

	public String excluir(Long ID) {
		vendaIngresso = dao.excluir(ID);
		return "listagemVendaIngresso";
	}

}
