package br.fatec.vetores;

import java.util.Scanner;

/*
 * 1)Escreva um programa em Java que dado um vetor de inteiros com n
 * elementos, imprima os elementos desse vetor em ordem inversa.
 */

public class OrdemInversa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int n = in.nextInt();
		int[] vetor = new int[n];
		System.out.println("Informe os " + n + " elementos do vetor:");
		for (int i = 0; i < n; i++) {
			vetor[i] = in.nextInt();
		}
		System.out.println("Vetor em ordem inversa:");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		in.close();
	}

}
