package br.fatec.vetores;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Informe o numero de elementos: ");
		int n = in.nextInt();
		int[] vetor = new int[n];
	    System.out.println("Informe os " + n + " numeros inteiros:");		
		for (int i = 0; i < n; i++) {
			vetor[i] = in.nextInt();
		}
		System.out.print("Numeros pares informados: ");
		for (int x : vetor) {
		    if (x % 2 == 0){
		        System.out.print(x + " ");
		    }
		}
		System.out.println();
		in.close();
	}

}
