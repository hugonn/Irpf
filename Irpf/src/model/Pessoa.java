package model;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private int numDep;
	private float contPrevSoc;
	private float totRend; 
	
	public Pessoa(String nome, String cpf, float contPrevSoc, float totRend) {
		this.nome = nome;
		this.cpf = cpf;
		this.contPrevSoc = contPrevSoc;
		this.totRend = totRend;
	}
	
	public Pessoa(String nome, String cpf, float contPrevSoc, float totRend, int idade,int numDep) {
		this(nome,cpf,contPrevSoc,totRend);
		this.idade = idade;
		this.numDep = numDep;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumDep() {
		return numDep;
	}

	public void setNumDep(int numDep) {
		this.numDep = numDep;
	}

	public float getContPrevSoc() {
		return contPrevSoc;
	}

	public void setContPrevSoc(float contPrevSoc) {
		this.contPrevSoc = contPrevSoc;
	}

	public float getTotRend() {
		return totRend;
	}

	public void setTotRend(float totRend) {
		this.totRend = totRend;
	}
	
}
