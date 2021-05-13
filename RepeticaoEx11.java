package br.fatec.repeticao;

import java.util.Scanner;

/*
 * 11. Escreva um programa que dados dois números inteiros positivos, X e Y, determinar o quociente
 * da divisão inteira entre X e Y sem utilizar o operador de divisão (/).
 */
public class RepeticaoEx11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, quociente = 0;
		System.out.print("Informe o dividendo e o divisor: ");
		x = in.nextInt();
		y = in.nextInt();
		
		
		while (x >= y) { 
			x -= y; // x = x - y;			
			quociente++;
		}
		
		System.out.println("Quociente inteiro da divisao: " + quociente);
		in.close();
	}

}
