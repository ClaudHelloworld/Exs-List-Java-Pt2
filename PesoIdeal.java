package br.fatec.decisao;

import java.util.Scanner;

/*
  15. Segundo uma tabela médica, o peso ideal está relacionado com a altura e o sexo. Fazer um
  programa que receba a altura em metros e o sexo de uma pessoa, calcule e imprima o seu
  peso ideal, utilizando as seguintes fórmulas:
  • Para homens: (72.7 * altura) – 58
  • Para mulheres: (62.1 * altura) – 44.7
 */


public class PesoIdeal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float altura, pesoIdeal;
		
		
		System.out.print("Informe sua altura em metros: ");
		altura = in.nextFloat();
		in.nextLine();
		System.out.print("Informe seu sexo (M/F): ");
		
		/*
		String sexo = in.nextLine();
		if (sexo.equalsIgnoreCase("m")) {
			pesoIdeal = (72.7f * altura) - 58;
		}
		else {
			pesoIdeal = (62.1f * altura) - 44.7f;
		}
		*/	
		
		char sexo = in.nextLine().charAt(0);
		/*
		if (sexo == 'M' || sexo == 'm') {
			pesoIdeal = (72.7f * altura) - 58;
		}
		else {
			pesoIdeal = (62.1f * altura) - 44.7f;
		}
		*/
		
		pesoIdeal = (sexo == 'M' || sexo == 'm' 
				    ? (72.7f * altura) - 58 
				    : (62.1f * altura) - 44.7f);
		
		in.close();
		System.out.printf("Seu peso ideal e' %.1f Kg\n", pesoIdeal);
	}

}
