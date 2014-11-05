package br.senai.sc.hoteleclipse.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.hoteleclipse.entity.Hospedagem;
import br.senai.sc.hoteleclipse.entity.VendaIngresso;
import br.senai.sc.hoteleclipse.util.Util;


	public class VendaIngressoDao {
		
		private EntityManager entityManager;

		public VendaIngressoDao() {
			entityManager = Util.getEntityManager();
		}

		public VendaIngressoDao(EntityManager entityManager) {
			this.entityManager = entityManager;
		}

		public List<VendaIngresso> listar() {
			Query query = entityManager.createQuery("From VendaIngresso", VendaIngresso.class);
			return query.getResultList();
		}

		public void salvar(VendaIngresso vendaIngresso) {
			entityManager.merge(vendaIngresso);
		}

		public VendaIngresso buscarPorId(Long id) {
			return entityManager.find(VendaIngresso.class, id);
		}

		public void excluir(Long id) {
			VendaIngresso vendaIngresso = entityManager.getReference(VendaIngresso.class, id);
			entityManager.remove(vendaIngresso);
		}

	}


