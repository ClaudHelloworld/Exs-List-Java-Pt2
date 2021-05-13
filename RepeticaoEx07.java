package br.fatec.repeticao;

import java.util.Scanner;

public class RepeticaoEx07 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o limite superior do intervalo: ");
		n = in.nextInt();
		for (int i = 2; i < n; i += 2) {
			System.out.println(i);
		}
		in.close();
	}
}
