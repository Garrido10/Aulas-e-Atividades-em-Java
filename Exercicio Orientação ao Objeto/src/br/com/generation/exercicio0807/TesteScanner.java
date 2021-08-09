package br.com.generation.exercicio0807;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
			
		Cachorro dog1 = new Cachorro();
		Cavalo poney1 = new Cavalo();
		Preguica preg1 = new Preguica();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do cachorro: ");
		dog1.setNome(leia.next());
		System.out.print("Digite a idade do cachorro: ");
		dog1.setIdade(leia.nextInt());
		System.out.print("Tipo de Animal: ");
		dog1.setTipo(leia.next());
		System.out.print("Cor do cachorro: ");
		dog1.setCor(leia.next());
		System.out.print("Ano em que nasceu: ");
		dog1.setAnoNasceu(leia.nextInt());
		
			System.out.println("\n==== Dados do Dog 1 ====");
			
			System.out.println("\nNome: " + dog1.getNome());
			System.out.println("Idade: " + dog1.getIdade());
			System.out.println("Tipo: " + dog1.getTipo());
			System.out.println("Cor: " + dog1.getCor());
			System.out.println("Ano em que nasceu: " + dog1.getAnoNasceu());
			
			leia.close();
	}

}
