package br.senai.sc.hoteleclipse.mb;

import java.util.List;

import javax.annotation.ManagedBean;

import br.senai.sc.hoteleclipse.dao.HospedagemDao;
import br.senai.sc.hoteleclipse.entity.Hospedagem;


@ManagedBean
public class HospedagemMb {

	private Hospedagem hospedagem;
	private HospedagemDao dao;
	private List<Hospedagem> listaHospedagem;

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public HospedagemDao getDao() {
		return dao;
	}

	public void setDao(HospedagemDao dao) {
		this.dao = dao;
	}

	public List<Hospedagem> getListaHospedagem() {
		return listaHospedagem;
	}

	public void setListaHospedagem(List<Hospedagem> listaHospedagem) {
		this.listaHospedagem = listaHospedagem;
	}

	public String salvar() {
		dao.salvar(hospedagem);
		return "listagemhospedagem";
	}

	public String editar(Long ID) {
		hospedagem = dao.buscarPorId(ID);
		return "formcadhospedagem";
	}

	public String excluir(Long ID) {
		hospedagem = dao.excluir(ID);
		return "listagemhospedagema";
	}
}