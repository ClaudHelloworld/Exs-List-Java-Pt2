package br.fatec.decisao;

import java.util.Scanner;

/*
 * 14. Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da
 * compra for menor que R$ 20,00; caso contrário, o lucro será de 30%. Desenvolva um
 * programa que dado o valor do produto, imprimir o valor de venda.
 */
public class PrecoVenda {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valor, venda;
		System.out.print("Valor do produto: R$ ");
		valor = in.nextDouble();
		
		venda = valor + (valor < 20 ? valor * 0.45 : valor * 0.3);
		
		System.out.printf("Valor de venda: R$ %.2f\n", venda);
		in.close();
	}

}
