package br.fatec.repeticao;

import java.util.Scanner;

/*
 * 13. Desenvolva um programa em Java que dado n e dois números naturais i e j diferentes de 0,
 * imprimir em ordem crescente os n primeiros naturais que são múltiplos de i ou de j. Exemplo:
 * Para n = 6 , i = 2 e j = 3 a saída deverá ser: 0, 2, 3, 4, 6, 8.
 */
public class RepeticaoEx13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, j, num = 0, cont = 0;
		System.out.print("Informe o numero de termos da sequencia: ");
		n = in.nextInt();
		System.out.print("Informe 2 numeros naturais: ");
		i = in.nextInt();
		j = in.nextInt();
		System.out.printf("%d numeros naturais multiplos de %d ou %d:\n", n, i, j);
		while (cont < n) {
			if (num % i == 0 || num % j == 0) {
				System.out.print(num + " ");
				cont++;
			}
			num++;
		}
		System.out.println();
		in.close();
	}

}
