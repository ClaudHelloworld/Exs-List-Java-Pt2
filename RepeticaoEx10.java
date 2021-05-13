package br.fatec.repeticao;

import java.util.Scanner;

public class RepeticaoEx10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.print("Digite um número: ");
		num = entrada.nextInt();

		System.out.print(num + " primeiros numeros impares em ordem decrescente:");
		for (int i = 2 * num - 1; i > 0; i -= 2) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		entrada.close();
	}

}
