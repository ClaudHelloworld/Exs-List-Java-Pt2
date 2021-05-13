package br.fatec.decisao;

import java.util.Scanner;

/*
 * 17. Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas
 * começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um vendedor de
 * um plano de saúde apresentou a tabela a seguir. Desenvolva um programa que dada a idade
 * de uma pessoa, imprima o valor que ela deverá pagar.
 * • Até 10 anos: R$ 150,00
 * • Acima de 10 até 18 anos: R$ 250,00
 * • Acima de 18 até 24 anos: R$ 300,00
 * • Acima de 24 até 50 anos: R$ 500,00
 * • Acima de 50 até 65 anos: R$ 750,00
 * • Maior que 65 anos: R$ 900,00
 */

public class PlanoDeSaude {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade;
		double valor;
		
		System.out.print("Informe sua idade: ");
		idade = in.nextInt();
		
		if (idade <= 10) {
			valor = 150.0;
		}
		else if (idade <= 18) {
			valor = 250.0;
		}
		else if (idade <= 24) {
			valor = 300.0;
		}
		else if (idade <= 50) {
			valor = 500.0;
		}
		else if (idade <= 65) {
			valor = 750.0;
		}
		else {
			valor = 900.0;
		}
		
		System.out.printf("Valor do seu plano de saude: R$ %.2f\n", valor);
		in.close();
	}

}
