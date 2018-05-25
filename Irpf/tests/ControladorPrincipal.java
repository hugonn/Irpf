import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import controller.ControladorPrincipal;
import model.ListaPessoaImposto;
import model.Pessoa;

class ControladorPrincipalTest {
	private ControladorPrincipal cp;
	private ListaPessoaImposto arrayPessoa;
	
	/*
	 * Responsável por calcular o imposto completo.
	 * Em seguida adiciona a pessoa a lista de impostos
	 */
	@Test
	public void calculaCadastraImpostoCompletoTest() {
		this.cp = new ControladorPrincipal();
		Pessoa p = new Pessoa("Bruno", "00000000000", 123456, 1111111, 66, 4);
		float esperado = (float)12222.230625; // 44444.475; // 987655;
		this.arrayPessoa = this.cp.calculaCadastraImpostoCompleto(p, null);
		assertEquals(esperado, p.getValorImposto());
	}
	
	@Test
	public void calculaCadastraImpostoSimplesTest() {
		this.cp = new ControladorPrincipal();
		Pessoa p = new Pessoa("Bruno", "00000000000", 123456, 1111111);
		float esperado = (float)258024.86875; // 44444.475; // 987655;
		this.arrayPessoa = this.cp.calculaCadastraImpostoSimples(p, null);
		assertEquals(esperado, p.getValorImposto());
	}
	
	@Test
	public void criaPessoaSimplesTest() {
		Pessoa p = this.cp.criaPessoaSimples("Mora", "22222222222", (float)11111, (float)111111);
		assertNotNull(p);
	}
	
	@Test 
	public void criaPessoaCompletaTest() {
		Pessoa p = this.cp.criaPessoaCompleta("Mora", "22222222222", (float)11111, (float)111111, 33, 3);
		assertNotNull(p);
	}
	
	@Test
	public void listarPessoaImpostoTest() {
		ListaPessoaImposto lpi = new ListaPessoaImposto();
		Pessoa p = this.cp.criaPessoaCompleta("Mora", "22222222222", (float)11111, (float)111111, 33, 3);
		Pessoa p1 =  this.cp.criaPessoaCompleta("Moro", "22222222222", (float)11111, (float)111111, 33, 3);
		Pessoa p2 =  this.cp.criaPessoaCompleta("More", "22222222222", (float)11111, (float)111111, 33, 3);
		lpi.addPessoa(p);
		lpi.addPessoa(p1);
		lpi.addPessoa(p2);
		String lista = this.cp.listarPessoaImposto(lpi);
		assertNotNull(lista);
	}
}
