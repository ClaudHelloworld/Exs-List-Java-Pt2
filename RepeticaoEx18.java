package br.fatec.repeticao;

import java.util.Random;
import java.util.Scanner;

/*
 * 18. Escreva um programa para calcular a raiz quadrada de um número real x, de acordo com o
 * seguinte algoritmo:
 * i) Comece com um palpite chamado p (p não é um dado de entrada, deve ser gerado pelo
 * programa);
 * ii) Se a diferença entre p*p e x for menor que 0.0001, pare e diga que p é a resposta;
 * iii) Caso contrário, gere um novo palpite calculando a média de p e x/p;
 * iv) Usando o novo palpite, repita o processo a partir do passo ii).
 */
public class RepeticaoEx18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double x, p;
		
		System.out.print("Informe o valor cuja raiz quadrada voce quer determinar: ");
		x = in.nextDouble();
		// p = x / 2;
		p = new Random().nextInt(100);
		while (Math.abs(p * p - x) >= 0.0001) {
			p = (p + x /p) / 2;
		}
		
		System.out.printf("Raiz quadrada de %.2f = %.2f\n", x, p);
		in.close();
	}

}
