package br.fatec.repeticao;

import java.util.Scanner;

public class RepeticaoEx05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira um numero: ");
			number = sc.nextInt();
			System.out.println(number + " ao quadrado: " + Math.round(Math.pow(number, 2)));
		}
		sc.close();
	}
}
