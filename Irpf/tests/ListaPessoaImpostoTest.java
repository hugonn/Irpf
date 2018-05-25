import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.ControladorPrincipal;
import model.ListaPessoaImposto;
import model.Pessoa;

class ListaPessoaImpostoTest {

	private ListaPessoaImposto lpi;
	
	@Test
	public void addPessoaTest() {
		this.lpi = new ListaPessoaImposto();
		Pessoa p = new Pessoa("Arthur", "88888888888", 222, 4444);
		lpi.addPessoa(p);
		String esperado = "N�o h� nenhuma pessoa cadastrada";
		assertFalse(esperado.equals(this.lpi.getPessoasImposto()));
	}
	
	@Test
	public void getPessoaImpostoTest() {
		this.lpi = new ListaPessoaImposto();
		Pessoa p = new Pessoa("Hugo", "88888888888", 222, 4444);
		ControladorPrincipal cp = new ControladorPrincipal();
		cp.calculaCadastraImpostoSimples(p, this.lpi);
		String esperado = " Nome:  "+ p.getNome() + " - Imposto: "+ p.getValorImposto() +"\n";
		assertTrue(esperado.equals(this.lpi.getPessoasImposto()));
	}
}
