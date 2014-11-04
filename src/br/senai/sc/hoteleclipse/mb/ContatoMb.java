package br.senai.sc.hoteleclipse.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import br.senai.sc.hoteleclipse.dao.ContatoDao;
import br.senai.sc.hoteleclipse.entity.Contato;



@ManagedBean
public class ContatoMb {

	private Contato contato;
	private ContatoDao dao;
	private EntityManager entityManager;
	private List<Contato> listaContato;
	private String nome;
	private String email;
	private String mensagem;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	

	public String salvar() {
		entityManager.merge(contato);
		return "listagemContato";
	}

	public String editar(Long ID) {
		contato = entityManager.find(Contato.class, ID);
		return "formcadContato";
	}

	public String excluir(Long ID) {
		Contato contato = entityManager.getReference(Contato.class, ID);
		entityManager.remove(contato);
		listaContato = null;
		return "listagemContato";
	}

}
