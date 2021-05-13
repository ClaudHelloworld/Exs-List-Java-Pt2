package br.fatec.repeticao;

import java.util.Scanner;

/*
 *33. URI 2378 – Elevador
 */

public class RepeticaoEx33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    char saida = 'N';
	    int n, c, s, e, i, qtde = 0;
	    n = in.nextInt();
	    c = in.nextInt();
	    for (i = 1; i <= n; i++) {
	        s = in.nextInt();
	        e = in.nextInt();
	        qtde += (e - s);
	        if (qtde > c) {
	            saida = 'S';
	        }
	    }
	    System.out.println(saida);
		in.close();
	}

}
