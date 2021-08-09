package br.com.generation.exercicio0807;

public class TestaTodos {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		Cavalo poney1 = new Cavalo();
		Preguica preg1 = new Preguica();
		
		
		
		dog1.setNome("Betoven");
		dog1.setTipo("Doméstico");
		dog1.setIdade(6);
		dog1.setCor("Preto");
		dog1.setAnoNasceu(2015);
		
		poney1.setNome("Tevez");
		poney1.setTipo("Doméstico");
		poney1.setIdade(10);
		poney1.setCor("Branco");
		poney1.setCidade("Ribeirão Preto");
		
		preg1.setNome("Muri");
		preg1.setTipo("Silvestre");
		preg1.setIdade(20);
		preg1.setCor("Marrom");
		preg1.setAnoNasceu(2001);
		preg1.setLocal("Amazônia");
		
		
		System.out.println("==== Dados do Cachorro ====");
		
		System.out.println("\nNome: " + dog1.getNome());
		System.out.println("Animal do tipo: " + dog1.getTipo());
		System.out.println("Idade: " + dog1.getIdade() + " anos");
		System.out.println("Cor: " + dog1.getCor());
		System.out.println("Nasceu em: " + dog1.getAnoNasceu());
		dog1.somCachorro();
		
		System.out.println("\n==== Dados do Cavalo ====");
		
		System.out.println("\nNome: " + poney1.getNome());
		System.out.println("Animal do tipo: " + poney1.getTipo());
		System.out.println("Idade: " + poney1.getIdade() + " anos");
		System.out.println("Cor: " + poney1.getCor());
		System.out.println("Cidade onde vive: " + poney1.getCidade());
		poney1.somCavalo();
		
		System.out.println("\n==== Dados do bicho Preguiça ====");
		
		System.out.println("\nNome: " + preg1.getNome());
		System.out.println("Animal do tipo: " + preg1.getTipo());
		System.out.println("Idade: " + preg1.getIdade() + " anos");
		System.out.println("Cor: " + preg1.getCor());
		System.out.println("Nasceu em: " + preg1.getAnoNasceu());
		System.out.println("Local onde vive: " + preg1.getLocal());
		preg1.somPreguica();
		
		

	}



}
