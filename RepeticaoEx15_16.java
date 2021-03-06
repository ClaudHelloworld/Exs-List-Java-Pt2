package br.fatec.repeticao;

/*
 * 15. Desenvolva um programa em Java que dado p inteiro, verificar se p é primo.
 *
 * 16. Desenvolva um programa em Java que dado um inteiro positivo n, imprima todos os números
 * primos menores ou iguais a n.
 * 
 */
import java.util.Scanner;

public class RepeticaoEx15_16 {

	public static void main(String[] args) {
		if (args.length > 0) {
			//Scanner in = new Scanner(System.in);
			int n, i;
			//System.out.print("Informe um numero inteiro: ");
			n = Integer.valueOf(args[0]);
			double raiz;
			
			System.out.println("Numeros primos menores ou iguais a " + n);
			for (int p = 2; p <= n; p++) {
				// determinar se p é primo
				if (p == 2) {
					System.out.print(p + " ");
				}				
				else if (p % 2 != 0){
					raiz = Math.sqrt(p);
					for (i = 3; i <= raiz; i += 2) {
						if (p % i == 0) {
							break;
						}
					}
					if (i > raiz) {
						System.out.print(p + " ");				
					}
				}
			}
			System.out.println();
			//in.close();
		}
		else {
			System.out.println("Erro: sintaxe errada!");
		}
	}

}
