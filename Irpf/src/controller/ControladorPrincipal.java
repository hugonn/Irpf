package controller;

import java.util.ArrayList;

import model.ListaPessoaImposto;
import model.Pessoa;

public class ControladorPrincipal {

		public ControladorPrincipal() {}
		
		public ListaPessoaImposto calculaCadastraImpostoCompleto(Pessoa p, ListaPessoaImposto lstP) {
			float baseCalculo = p.getTotRend() - p.getContPrevSoc();
			float imposto=0;
			
			if(p.getIdade()<65) {
				
				if(p.getNumDep()<3)
					baseCalculo-= baseCalculo*(2/100);
				else if(p.getNumDep() < 5)
					baseCalculo-= baseCalculo*(3.5/100);
				else
					baseCalculo-= baseCalculo*(5/100);
			
			}else {
				
				if(p.getNumDep()<3)
					baseCalculo-= baseCalculo*(3/100);
				else if(p.getNumDep() < 5)
					baseCalculo-= baseCalculo*(4.5/100);
				else
					baseCalculo-= baseCalculo*(6/100);
			}
			
			
		    if(baseCalculo < 24000) {
				imposto= (baseCalculo*(15/100));
			}else
				imposto= (float)(baseCalculo*(27.5/100));
			
			p.setValorImposto(imposto);
			lstP.addPessoa(p);
			
			return lstP;
			
		}
		
		public ListaPessoaImposto calculaCadastraImpostoSimples(Pessoa p,ListaPessoaImposto lstP) {
			float baseCalculo = p.getTotRend() - p.getContPrevSoc();
			float imposto;
			
			baseCalculo -=  (baseCalculo * (5/100));
			
			if(baseCalculo < 24000) {
				imposto= (baseCalculo*(15/100));
			}else
				imposto= (float)(baseCalculo*(27.5/100));
			
			p.setValorImposto(imposto);
			
			lstP.addPessoa(p);
			
			return lstP;
		}
		
		public Pessoa criaPessoaSimples(String nome, String cpf, float contPrevSoc, float totRend) {
			
			return new Pessoa(nome,cpf,contPrevSoc,totRend);
		}
		
		public Pessoa criaPessoaCompleta(String nome, String cpf, float contPrevSoc, float totRend, int idade, int numDep) {
			
			return new Pessoa(nome,cpf,contPrevSoc,totRend, idade, numDep);
		}
		
		public String listarPessoaImposto(ListaPessoaImposto lstPesImp) {
			
			return lstPesImp.getPessoasImposto();
			
		}
		
		
}
