package br.senai.sc.hoteleclipse.test;

import org.junit.Test;

import br.senai.sc.hoteleclipse.entity.Cliente;

public class ClienteDaoTest extends DBUnitTest {

	public ClienteDaoTest() {
		super();
	}

	private Cliente gravaCliente() {
		begin();
		Cliente c = new Cliente();
		c.setNome("Cliente_Teste_1");
		c.setCPF("1010101010");
		c.setEmail("stephanierc16@hotmail.com");
		c.setEndereco("Cipriano Nunes");
		c.setBairro("Rio Vermelho");
		c.setCidade("Florianopolis");
		c.setEstado("SC");
		c.setTelefone("(48)3236-0889");
		Cliente cliente = getDao().salvar(c);
		close();
		return cliente;
	}
	
	@Test
	public void testGravaCliente(){
		assertNotNull(gravaCliente());
	}
	
	private Cliente excluirCliente(){
		begin();
		Cliente excluirCadastro = new Cliente();
		excluirCadastro.setNome("Cliente_Teste_1");
		excluirCadastro.setCPF("1010101010");
		excluirCadastro.setEmail("stephanierc16@hotmail.com");
		excluirCadastro.setEndereco("Cipriano Nunes");
		excluirCadastro.setBairro("Rio Vermelho");
		excluirCadastro.setCidade("Florianopolis");
		excluirCadastro.setEstado("SC");
		excluirCadastro.setTelefone("(48)3236-0889");
	//	Cliente cliente = getDao().excluir(1L);
		close();
		return  null;// exlcuir;
	}

	@Test
	public void testExcluirCliente(){
		assertNotNull(excluirCliente());
	}
	
	private Cliente editarCliente(){
		begin();
		Cliente editarCadastro = new Cliente();
		editarCadastro.setNome("Cliente_Teste_1");
		editarCadastro.setCPF("1010101010");
		editarCadastro.setEmail("stephanierc16@hotmail.com");
		editarCadastro.setEndereco("Cipriano Nunes");
		editarCadastro.setBairro("Rio Vermelho");
		editarCadastro.setCidade("Florianopolis");
		editarCadastro.setEstado("SC");
		editarCadastro.setTelefone("(48)3236-0889");
	//	Cliente cliente = getDao().editar(editarCadastro);
		close();
		return null;// cliente;
	}
	
	@Test
	public void testEditarCliente(){
		assertNotNull(editarCliente());
	}
}
