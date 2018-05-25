import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Pessoa;

class PessoaTest {

	private Pessoa p;
	
	@Test
	public void getValorImpostoTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442);
		int esperado = 10000;
		p.setValorImposto(10000);
		float valor = p.getValorImposto();
		assertEquals(experado, valor);
	}
	
	@Test
	public void setValorImpostoTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442);
		int esperado = 10000;
		p.setValorImposto(10000);
		float valor = p.getValorImposto();
		assertEquals(experado, valor);
		
	}
	
	@Test
	public void getNomeTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442);
		String esperado = "Nome";
		assertTrue(this.p.getNome().equals(esperado));
	}
	
	@Test
	public void setNomeTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442);
		String esperado = "Água";
		p.setNome("Água");
		assertTrue(this.p.getNome().equals(esperado));
	}
	
	@Test
	public void getCpfTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442);
		String esperado = "cpf";
		assertTrue(this.p.getCpf().equals(esperado));
	}
	
	@Test
	public void setCpfTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442);
		String esperado = "99999999999";
		p.setCpf("99999999999");
		assertTrue(this.p.getCpf().equals(esperado));
	}
	
	@Test
	public void getIdadeTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442, 22, 3);
		int esperado = 22;
		assertTrue(this.p.getIdade(), esperado);
	}
	
	@Test
	public void setIdadeTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442, 33, 2);
		int esperado = 33;
		p.setIdade(33);
		assertTrue(this.p.getIdade(), esperado);
	}
	
	@Test
	public void getNumDepTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442, 22, 3);
		int esperado = 3;
		assertTrue(this.p.getNumDep(), esperado);
	}
	
	@Test
	public void setNumDepTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442, 33, 2);
		int esperado = 3;
		p.setNumDep(3);
		assertTrue(this.p.getNumDep(), esperado);
	}
	
	@Test
	public void getContPrevSocTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442, 22, 3);
		int esperado = 32333;
		assertTrue(this.p.getContPrevSoc(), esperado);
	}
	
	@Test
	public void setContPrevSocTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442, 33, 2);
		int esperado = 399999;
		p.setContaPrevSoc(399999);
		assertTrue(this.p.getContaPrevSoc(), esperado);
	}
	
	@Test
	public void getTotRendTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442, 22, 3);
		int esperado = 4444442;
		assertTrue(this.p.getTotRend(), esperado);
	}
	
	@Test
	public void setTotRendTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442, 33, 2);
		int esperado = 666666666666;
		p.setTotRend(666666666666);
		assertTrue(this.p.getTotRend(), esperado);
	}
}
