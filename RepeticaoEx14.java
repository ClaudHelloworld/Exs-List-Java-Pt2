package br.fatec.repeticao;

import java.util.Scanner;

public class RepeticaoEx14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, t1 = 0;
		
		System.out.print("Informe um numero natural: ");
		n = in.nextInt();
		
		while (t1 * (t1 + 1) * (t1 + 2) < n) {
			t1++;
		}
		
		if (t1 * (t1 + 1) * (t1 + 2) == n) {
			System.out.println(n + " e' triangular");
		}
		else {
			System.out.println(n + " NAO e' triangular");
		}
		in.close();
	}

}
