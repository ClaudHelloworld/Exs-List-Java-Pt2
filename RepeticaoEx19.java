package br.fatec.repeticao;

import java.util.Scanner;

/*
 * 19. Desenvolva um programa em Java que dados dois números inteiros positivos, determinar o
 * máximo divisor comum entre eles usando o algoritmo de Euclides.
 */
public class RepeticaoEx19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, resto;
		
		System.out.print("Informe 2 numeros inteiros positivos: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		do {
			resto = num1 % num2;
			num1 = num2;
			num2 = resto;
		} while (resto != 0);
		
		System.out.println("MDC = " + num1);
		in.close();
	}

}


/*  
   num1  | num2 | resto
   --------------------
    15   |  24  |  15
    24   |  15  |   9
    15   |   9  |   6
     9   |   6  |   3
     6   |   3  |   0
     3   |   0  |
   
*/