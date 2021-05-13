package br.fatec.decisao;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		float nota1, nota2;
		Scanner en = new Scanner(System.in);
		System.out.println("Informe a nota da primeira prova: ");
		nota1 = en.nextFloat();
		System.out.println("Informe a nota da segunda prova: ");
		nota2 = en.nextFloat();
		en.close();
		float media = (nota1 + nota2) / 2;
		if (media >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
