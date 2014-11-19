package br.senai.sc.hoteleclipse.mb;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.senai.sc.hoteleclipse.dao.VendaIngressoDao;
import br.senai.sc.hoteleclipse.entity.VendaIngresso;

@ManagedBean
public class VendaIngressoMb {
	
	private VendaIngresso vendaIngresso;
	private VendaIngressoDao vendaIngressoDao;
	private List<VendaIngresso> listaVendaIngresso;
	
	

	public VendaIngresso getVendaIngresso() {
		return vendaIngresso;
	}

	public void setVendaIngresso(VendaIngresso vendaIngresso) {
		this.vendaIngresso = vendaIngresso;
	}

	public VendaIngressoDao getVendaDao() {
		return vendaIngressoDao;
	}

	public void setVendaDao(VendaIngressoDao vendaDao) {
		this.vendaIngressoDao = vendaIngressoDao;
	}

	public void setListaVendaIngresso(List<VendaIngresso> listaVendaIngresso) {
		this.listaVendaIngresso = listaVendaIngresso;
	}

	@PostConstruct
	public void init(){
		vendaIngressoDao = new VendaIngressoDao();
		vendaIngresso = new VendaIngresso();
	}
	
	
	public List<VendaIngresso> getListaVendaIngresso() {
		if (listaVendaIngresso == null)
			listaVendaIngresso = vendaIngressoDao.listar();
		return listaVendaIngresso;
	}

	
	public String salvar() throws IOException {
		vendaIngressoDao.salvar(vendaIngresso);
		return "listagemVendaIngresso";
	}

	public String editar(String id){
		vendaIngresso = vendaIngressoDao.buscarPorId(Long.parseLong(id));
		return "formcadvendaIngresso";
	}
	
	public String excluir(String id){
		VendaIngresso vendaIngressoremovido = vendaIngressoDao.excluir(Long.parseLong(id));
		
		listaVendaIngresso = null;
		return "listagemVendaIngresso";
	}
}
