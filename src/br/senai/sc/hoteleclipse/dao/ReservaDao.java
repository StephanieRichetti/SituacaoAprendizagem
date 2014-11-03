package br.senai.sc.hoteleclipse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.hoteleclipse.entity.Reserva;
import br.senai.sc.hoteleclipse.util.Util;

public class ReservaDao {

	private EntityManager entityManager;

	public ReservaDao() {
		entityManager = Util.getEntityManager();
	}

	public ReservaDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Reserva> listar() {
		Query query = entityManager.createQuery("From Reserva", Reserva.class);
		return query.getResultList();
	}

	public void salvar(Reserva cliente) {
		entityManager.merge(cliente);
	}

	public Reserva buscarPorId(Long id) {
		return entityManager.find(Reserva.class, id);
	}

	public void excluir(Long id) {
		Reserva cliente = entityManager.getReference(Reserva.class, id);
		entityManager.remove(cliente);
	}

}
