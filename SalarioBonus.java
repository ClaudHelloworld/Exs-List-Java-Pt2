

import java.util.Scanner;

class SalarioBonus {

	public static void main(String[] args) {
		String nome;
		double salfix, totalv, valort;
		/*
		 * Salfix = Salario Fixo Totalv = Total de venda Valort = O valor total dos 15%
		 * de comissão
		 */
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		salfix = sc.nextDouble();
		totalv = sc.nextDouble();
		valort = ((0.15 * totalv) + salfix);
		System.out.printf("TOTAL = R$ %.2f\n", valort);
		sc.close();
	}

}
