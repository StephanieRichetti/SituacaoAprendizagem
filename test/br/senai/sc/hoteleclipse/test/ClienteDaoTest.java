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
		Cliente cliente = getDao().salvar(c);
		close();
		return cliente;
	}
	
	@Test
	public void testGravaCliente(){
		assertNotNull(gravaCliente());
	}

	// @Test
	// public void ClienteDao() throws SQLException, Exception {
	// begin();
	// gravaCliente();
	// close();
	//
	// // Carregamento do estado atual do banco de dados.
	// IDataSet dataBase = getConnection().createDataSet();
	// ITable tabelaAtual = dataBase.getTable("cliente");
	//
	// // Carregamento do arquivo de controle (cliente.xml)
	// IDataSet dataBaseXML = new FlatXmlDataSetBuilder()
	// .build(new FileInputStream(new File("control/cliente.xml")));
	// ITable tabelaControle = dataBaseXML.getTable("cliente");
	//
	// Assertion.assertEquals(tabelaControle, tabelaAtual);
	//
	// }
}
