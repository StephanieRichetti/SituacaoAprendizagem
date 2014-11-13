package br.senai.sc.hoteleclipse.mb;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import br.senai.sc.hoteleclipse.dao.VendaIngressoDao;
import br.senai.sc.hoteleclipse.entity.VendaIngresso;

@ManagedBean
public class VendaIngressoMb {
	
	private VendaIngresso vendaIngresso;
	private VendaIngressoDao vendaDao;
	private List<VendaIngresso> listaVendaIngresso;
	
	

	public VendaIngresso getVendaIngresso() {
		return vendaIngresso;
	}

	public void setVendaIngresso(VendaIngresso vendaIngresso) {
		this.vendaIngresso = vendaIngresso;
	}

	public VendaIngressoDao getVendaDao() {
		return vendaDao;
	}

	public void setVendaDao(VendaIngressoDao vendaDao) {
		this.vendaDao = vendaDao;
	}

	public void setListaVendaIngresso(List<VendaIngresso> listaVendaIngresso) {
		this.listaVendaIngresso = listaVendaIngresso;
	}

	@PostConstruct
	public void init(){
		vendaDao = new VendaIngressoDao();
		vendaIngresso = new VendaIngresso();
	}
	
	
	public List<VendaIngresso> getListaVendaIngresso() {
		if (listaVendaIngresso == null)
			listaVendaIngresso = vendaDao.listar();
		return listaVendaIngresso;
	}

	
	public String salvar() throws IOException {
		vendaDao.salvar(vendaIngresso);
		return "listagemVendaIngresso";
	}

	public String editar(String id){
		vendaIngresso = vendaDao.buscarPorId(Long.parseLong(id));
		return "formcadvendaIngresso";
	}
	
	public String excluir(String id){
		VendaIngresso vendaIngressoremovido = vendaDao.excluir(Long.parseLong(id));
		
		listaVendaIngresso = null;
		return "listagemVendaIngresso";
	}
}
