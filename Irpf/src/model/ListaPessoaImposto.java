package model;

import java.util.ArrayList;

public class ListaPessoaImposto {
	ArrayList<Pessoa> lstP;
	
	public ListaPessoaImposto(){
		lstP = new ArrayList<Pessoa>();
	}
	
	public void addPessoa(Pessoa p) {
		lstP.add(p);
	}
	
	public String getPessoasImposto() {
		String lst ="";
		
		if(lstP.isEmpty())
			lst = "Não há nenhuma pessoa cadastrada";
		else {
			for(Pessoa p: lstP) {
				lst+= " Nome:  "+ p.getNome() + " - Imposto: "+ p.getValorImposto() +"\n";
			}
			
		}
		
		return lst;
	}

}
