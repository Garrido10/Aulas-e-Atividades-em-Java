package br.com.generation.collection;

import java.util.ArrayList;

public class Collections {


	public static void main(String[] args) {
		
		//Declarando varáveis
		String aula1 = "Bloco 1 - Java"; // 0
		String aula2 = "\nBloco 2 - Java"; // 1
		String aula3 = "\nBloco 3 - Java"; // 2
		String aula4 = "\nBloco 4 - Java"; // 3
		
		
		//Criando o ArrayList
			ArrayList<String> aulas = new ArrayList<>();
		
		//Adicionando minhas variáveis ao meu ArrayList
			aulas.add(aula1);
			aulas.add(aula2);
			aulas.add(aula3);
			aulas.add(aula4);
		
		//Imprimindo o meu ArrayList
	//	  System.out.println(aulas);
		
		//Removendo posições da impressão
		//     aulas.remove(1);
		//	System.out.println(aulas);
			
		//For each ==> For evoluído
		
			for(String i: aulas) {
				System.out.println("Aulas: " + i);
			}
		
		
	}

}
