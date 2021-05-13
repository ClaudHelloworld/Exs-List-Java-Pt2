package br.fatec.repeticao;

import java.util.Scanner;

public class RepeticaoEx06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um conjunto de numeros inteiros (0 p/ terminar): ");
		int n = in.nextInt();
		while (n != 0) {
			System.out.println(n + " ao quadrado = " + (n * n));
			n = in.nextInt();
		}
		in.close();
	}

}
