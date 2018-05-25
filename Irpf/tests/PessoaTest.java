import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Pessoa;

class PessoaTest {

	private Pessoa p;
	
	@Test
	public void getValorImpostoTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442);
		int experado = 10000;
		p.setValorImposto(10000);
		float valor = p.getValorImposto();
		assertEquals(experado, valor);
	}
	
	@Test
	public void setValorImpostoTest() {
		this.p = new Pessoa("Nome", "cpf", 32333, 4444442);
		int experado = 10000;
		p.setValorImposto(10000);
		float valor = p.getValorImposto();
		assertEquals(experado, valor);
		
	}
	
	@Test
	public void getNomeTest() {
		
	}
	
	@Test
	public void setNomeTest() {
		
	}
	
	@Test
	public void getCpfTest() {
		
	}
	
	@Test
	public void setCpfTest() {
		
	}
	
	@Test
	public void getIdadeTest() {
		
	}
	
	@Test
	public void setIdadeTest() {
		
	}
	
	@Test
	public void getNumDepTest() {
		
	}
	
	@Test
	public void setNumDepTest() {
		
	}
	
	@Test
	public void getContPrevSocTest() {
		
	}
	
	@Test
	public void setContPrevSocTest() {
		
	}
	
	@Test
	public void getTotRendTest() {
		
	}
	
	@Test
	public void setTotRendTest() {
		
	}
}
