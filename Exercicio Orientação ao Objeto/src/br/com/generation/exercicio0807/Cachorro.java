package br.com.generation.exercicio0807;

public class Cachorro extends Animal {
	
	//Atributos
	
	private String cor; 
	private int AnoNasceu;
	
	void somCachorro() {
		System.out.println("Au au au");
	}
	
	 
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoNasceu() {
		return AnoNasceu;
	}
	public void setAnoNasceu(int anoNasceu) {
		AnoNasceu = anoNasceu;
	} 

}
