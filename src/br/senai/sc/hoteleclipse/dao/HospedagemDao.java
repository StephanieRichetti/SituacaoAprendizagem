package br.senai.sc.hoteleclipse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.hoteleclipse.entity.Hospedagem;
import br.senai.sc.hoteleclipse.entity.Reserva;
import br.senai.sc.hoteleclipse.util.Util;

public class HospedagemDao {
	
	private EntityManager entityManager;

	public HospedagemDao() {
		entityManager = Util.getEntityManager();
	}

	public HospedagemDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Hospedagem> listar() {
		Query query = entityManager.createQuery("From Hospedagem", Hospedagem.class);
		return query.getResultList();
	}

	public void salvar(Hospedagem hospedagem) {
		entityManager.merge(hospedagem);
	}

	public Hospedagem buscarPorId(Long id) {
		return entityManager.find(Hospedagem.class, id);
	}

	public void excluir(Long id) {
		Hospedagem hospedagem = entityManager.getReference(Hospedagem.class, id);
		entityManager.remove(hospedagem);
	}

}


