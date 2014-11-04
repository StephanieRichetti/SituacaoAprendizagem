package br.senai.sc.hoteleclipse.mb;

import java.sql.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import br.senai.sc.hoteleclipse.dao.ReservaDao;
import br.senai.sc.hoteleclipse.entity.Reserva;


@ManagedBean
public class ReservaMb {

	
	private Reserva reserva;
	private ReservaDao dao;
	private EntityManager entityManager;
	private List<Reserva> listaReserva;
	private Long id;	
	private String nomeCliente;
	private Date chegada;
	private Date saida;
	private Integer quartos;
	private Integer quantidadePessoas;
	private String observacao;
	

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public ReservaDao getDao() {
		return dao;
	}

	public void setDao(ReservaDao dao) {
		this.dao = dao;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Reserva> getListaReserva() {
		return listaReserva;
	}

	public void setListaReserva(List<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
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

	public Date getChegada() {
		return chegada;
	}

	public void setChegada(Date chegada) {
		this.chegada = chegada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Integer getQuartos() {
		return quartos;
	}

	public void setQuartos(Integer quartos) {
		this.quartos = quartos;
	}

	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String salvar() {
		entityManager.merge(reserva);
		return "listagemReserva";
	}

	public String editar(Long ID) {
		reserva = entityManager.find(Reserva.class, ID);
		return "formcadReserva";
	}

	public String excluir(Long ID) {
		Reserva reserva = entityManager.getReference(Reserva.class, ID);
		entityManager.remove(reserva);
		listaReserva = null;
		return "listagemReserva";
	}
}
