package br.fatec.strings;

import java.util.Scanner;

public class OrdemAlbetica {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1, str2;
		System.out.print("Informe a 1a. string: ");
		str1 = in.nextLine();
		System.out.print("Informe a 2a. string: ");
		str2 = in.nextLine();
		
		System.out.println("Strings em ordem alfabetica:");
		if (str1.compareToIgnoreCase(str2) < 0) {
			System.out.println(str1 + '\n' + str2);
		}
		else {
			System.out.println(str2 + '\n' + str1);
		}
		in.close();
	}

}
