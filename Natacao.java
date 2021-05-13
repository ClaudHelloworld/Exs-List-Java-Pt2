package br.fatec.decisao;

import java.util.Scanner;

/*
 * 16. A confederação brasileira de natação promoverá eliminatórias para o próximo mundial.
 * Desenvolva um programa que receba a idade de um nadador e imprima a sua categoria
 * segundo a tabela a seguir:
 * Categoria    Idade
 * Infantil A   5 – 7 anos
 * Infantil B   8 – 10 anos
 * Juvenil A    11 – 13 anos
 * Juvenil B    14 – 17 anos
 * Adulto       Maiores de 17 anos
 */

public class Natacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		
		System.out.print("Informe a idade do nadador: ");
		idade = in.nextInt();
		
		if (idade < 5) {
			System.out.println("Nao tem idade para competir");
		}
		else if (idade <= 7) {
			System.out.println("Categoria Infantil A");
		}
		else if (idade <= 10) {
			System.out.println("Categoria Infantil B");
		}
		else if (idade <= 13) {
			System.out.println("Categoria Juvenil A");
		}
		else if (idade <= 17) {
			System.out.println("Categoria Juvenil B");
		}
		else {
			System.out.println("Categoria Adulto");
		}
		in.close();
	}

}
