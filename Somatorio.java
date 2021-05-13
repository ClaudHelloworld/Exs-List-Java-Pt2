/*
 * 1)Escreva um programa em Java que preencha uma matriz de inteiros n x m
 * com valores aleatório (use a classe Random), imprima esta matriz e calcule e
 * imprima o somatório dos elementos da matriz.
 */

import java.util.Random;
import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int n, m, soma = 0;
		System.out.print("Informe o numero de linhas e colunas da matriz: ");
		n = in.nextInt();
		m = in.nextInt();
		int[][] mat = new int[n][m];
		
		System.out.println("Matriz " + n + " x " + m + " gerada");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = rand.nextInt(n * m);
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				soma += mat[i][j];
			}
		}
		System.out.println("Somatorio dos elementos da matriz: " + soma);
		in.close();
	}

}
