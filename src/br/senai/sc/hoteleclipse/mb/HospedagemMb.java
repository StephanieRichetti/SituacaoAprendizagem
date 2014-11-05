package br.senai.sc.hoteleclipse.mb;

import java.sql.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;

import br.senai.sc.hoteleclipse.dao.HospedagemDao;
import br.senai.sc.hoteleclipse.entity.Hospedagem;
import br.senai.sc.hoteleclipse.entity.Reserva;



@ManagedBean
public class HospedagemMb {

	
	private Hospedagem hospedagem;
	private HospedagemDao dao;
	private EntityManager entityManager;
	private List<Hospedagem> listaHospedagem;
	private Long id;	
	private String nome;
	private Date entrada;
	private Date saida;
	private Integer categoriaQuartos;
	private Integer quantidadePessoas;
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
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	public List<Hospedagem> getListaHospedagem() {
		return listaHospedagem;
	}
	public void setListaHospedagem(List<Hospedagem> listaHospedagem) {
		this.listaHospedagem = listaHospedagem;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Date getSaida() {
		return saida;
	}
	public void setSaida(Date saida) {
		this.saida = saida;
	}
	public Integer getCategoriaQuartos() {
		return categoriaQuartos;
	}
	public void setCategoriaQuartos(Integer categoriaQuartos) {
		this.categoriaQuartos = categoriaQuartos;
	}
	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}
	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public String salvar() {
		entityManager.merge(hospedagem);
		return "listagemHospedagem";
	}

	public String editar(Long ID) {
		hospedagem = entityManager.find(Hospedagem.class, ID);
		return "formcadHospedagem";
	}

	public String excluir(Long ID) {
		Hospedagem hospedagem = entityManager.getReference(Hospedagem.class, ID);
		entityManager.remove(hospedagem);
		listaHospedagem = null;
		return "listagemHospedagem";
	}
}
