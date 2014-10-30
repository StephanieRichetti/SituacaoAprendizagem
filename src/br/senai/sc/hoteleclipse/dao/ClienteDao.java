package br.senai.sc.hoteleclipse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.hoteleclipse.entity.Cliente;
import br.senai.sc.hoteleclipse.util.Util;


public class ClienteDao {

	private EntityManager entityManager;

	public ClienteDao() {
		entityManager = Util.getEntityManager();
	}
	
	public ClienteDao(EntityManager entityManager) {
			this.entityManager = entityManager;
	}

	public List<Cliente> listar() {
		Query query = entityManager
				.createQuery("From Canal", Cliente.class);
		return query.getResultList();
	}

	public void salvar(Cliente cliente) {
		entityManager.merge(cliente);
	}

	public Cliente buscarPorId(Long id) {
		return entityManager.find(Cliente.class, id);
	}

	public void excluir(Long id) {
		Cliente cliente = entityManager.getReference(Cliente.class, id);
		entityManager.remove(cliente);
	}

}



	

