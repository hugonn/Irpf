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

}
