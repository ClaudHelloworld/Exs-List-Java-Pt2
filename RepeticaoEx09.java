package br.fatec.repeticao;

import java.util.Random;

public class RepeticaoEx09 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int maior_dia = 0;
		int vendas, maior_venda = 0;

		for (int i = 1; i <= 31; i++) {
			vendas = aleatorio.nextInt(200);
			System.out.printf("Dia: %02d/03/2021: %d discos vendidos\n", i, vendas);
			if (maior_venda < vendas) {
				maior_venda = vendas;
				maior_dia = i;
			}
		}
		System.out.printf("O dia com a maior venda foi: %02d/03/2021\n", maior_dia);
		System.out.printf("A quantidade de discos vendidos foi: %d\n", maior_venda);

	}

}
