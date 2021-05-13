/*
 * 2. Escreva um programa em Java que dadas as notas de duas provas de um aluno, determine e im-
 * prima a média aritmética dessas provas.
 */

package br.fatec.tiposprimitivos;

import java.util.Scanner;

public class MediaDasNotas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float nota1, nota2, media;
		
		System.out.print("Digite as notas das 2 provas: ");
		nota1 = in.nextFloat();
		nota2 = in.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		System.out.printf("Media: %.1f\n", media);
		
		in.close();
	}

}
