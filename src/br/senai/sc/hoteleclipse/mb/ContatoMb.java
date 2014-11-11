package br.senai.sc.hoteleclipse.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import br.senai.sc.hoteleclipse.dao.ContatoDao;
import br.senai.sc.hoteleclipse.entity.Contato;



@ManagedBean
public class ContatoMb {
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
	
	public void enviar(){
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Mensagem: " + mensagem);
	
	}
}


