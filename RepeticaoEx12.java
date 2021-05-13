package br.fatec.repeticao;

public class RepeticaoEx12 {

	public static void main(String[] args) {
		int fat = 1;
		int num = 0;
		System.out.printf("Fatorial de %d é igual a %d\n", num, fat);

		for (num = 1; num <= 10; num++) {
			fat *= num;

			System.out.printf("Fatorial de %d é igual a %d\n", num, fat);
		}
	}

}
