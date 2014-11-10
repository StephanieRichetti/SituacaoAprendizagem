package br.senai.sc.hoteleclipse.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.senai.sc.hoteleclipse.dao.ClienteDao;
import br.senai.sc.hoteleclipse.entity.Cliente;
import br.senai.sc.hoteleclipse.util.Util;

public class Main {
	
	public static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("hoteleclipsesa_pu");
	
	public static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static ClienteDao dao = new ClienteDao();
	
	public static Cliente cliente = new Cliente();
	
	public static void main(String[] args) {
				
		entityManager.getTransaction().begin();
		entityManager.getTransaction().commit();
		atualizarCliente();
		listarClientes();
		excluirCliente(0);
		entityManager.close();
		entityManagerFactory.close();
	}

	private static void excluirCliente(long id) {
		Cliente cliente = entityManager.getReference(Cliente.class, id);
		entityManager.remove(cliente);
	}

	private static List <Cliente> listarClientes() {
		Query query = entityManager.createQuery("From Cliente", Cliente.class);
		return query.getResultList();
		
	}

	private static void atualizarCliente() {
		entityManager.merge(cliente);
		
	}


}