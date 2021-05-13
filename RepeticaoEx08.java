package br.fatec.repeticao;

import java.util.Scanner;

public class RepeticaoEx08 {
	public static void main(String args[]) {
		int base, expoente;
		int result = 1;
		Scanner in = new Scanner(System.in);

		System.out.print("Digite a base e o expoente de uma potenciacao: ");
		base = in.nextInt();
		expoente = in.nextInt();

		for (int i = 1; i <= expoente; i++) {
			result *= base;
		}
		System.out.println(result);
		in.close();
	}
}
