package br.com.generation.heranca;

public class Pessoa {

	
	// Declaração de public - todas as classes tem acesso 
	// Private - somente essa classe tem acesso
	// Protect - somente essa classe e suas subclasses tem acesso
	// e sem nenhum deles, todas as classes dentro do pacote


	
		private String nome; 
		private String endereco; 
		private int idade;
		
	
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		} 
		
		
		
	
}
