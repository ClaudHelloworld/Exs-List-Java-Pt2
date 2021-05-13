package br.fatec.decisao;

import java.util.Scanner;

/*
 * 8. Desenvolva um programa que dados três números inteiros, informe quantos são negativos.
 */
public class Negativos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, cont = 0;
		System.out.print("Informe 3 numeros inteiros: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		if (num1 < 0) {
			cont++;
		}
		if (num2 < 0) {
			cont++;
		}
		if (num3 < 0) {
			cont++;
		}
		System.out.println("Voce informou " + cont + " numero(s) negativo(s)");
		in.close();
	}

}
