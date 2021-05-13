package br.fatec.decisao;

import java.util.Scanner;

/*
 * 13. Desenvolva um programa para determinar a média final e a situação (Aprovado, Reprovado
 * ou Exame) de um aluno em uma disciplina. São dadas as notas de três provas, o número de
 * aulas ministradas e o número de faltas do aluno. Sabe-se que a média final é a média
 * aritmética dessas três provas e que a média para aprovação é 7, menor do que 3 para
 * reprovação e as demais em exame. Entretanto, o aluno estará reprovado se tiver faltado a
 * mais do que 25% das aulas.
 */
public class MediaFinal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double prova1, prova2, prova3, media, percFaltas;
		int numAulas, numFaltas;
		
		System.out.print("Informe as notas das 3 provas do aluno: ");
		prova1 = in.nextDouble();
		prova2 = in.nextDouble();
		prova3 = in.nextDouble();
		
		System.out.print("Informe o numero de aulas ministradas: ");
		numAulas = in.nextInt();
		System.out.print("Informe o numero de faltas do aluno: ");
		numFaltas = in.nextInt();
		
		media = (prova1 + prova2 + prova3) / 3;
		System.out.printf("Media final: %.1f\n", media);
		
		percFaltas = (numFaltas * 100.0) / numAulas;
		
		if (percFaltas > 25) {
			System.out.println("Reprovado por falta");
		}
		else if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if (media >= 3) {
			System.out.println("Exame");			
		}
		else {
			System.out.println("Reprovado");
		}
		in.close();
	}

}
