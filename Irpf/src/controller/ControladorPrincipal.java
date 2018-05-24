package controller;

import model.Pessoa;

public class ControladorPrincipal {

		public ControladorPrincipal() {}
		
		public float calculaImpostoCompleto(Pessoa p) {
			
			return 0;
		}
		
		public float calculaImpostoSimples(Pessoa p) {
			
			return 0;
		}
		
		public Pessoa criaPessoaSimples(String nome, String cpf, float contPrevSoc, float totRend) {
			
			return new Pessoa(nome,cpf,contPrevSoc,totRend);
		}
		
		public Pessoa criaPessoaCompleta(String nome, String cpf, float contPrevSoc, float totRend, int idade, int numDep) {
			
			return new Pessoa(nome,cpf,contPrevSoc,totRend, idade, numDep);
		}
		
		
}
