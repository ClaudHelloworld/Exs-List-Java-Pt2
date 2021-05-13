package br.fatec.repeticao;

import java.util.Scanner;

/*
 * 34. URI 2386 – Telescópio
 */

public class RepeticaoEx34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int a, n, f, i, cont = 0;
	    a = in.nextInt();
	    n = in.nextInt();
	    for (i = 1; i <= n; i++) {
	        f = in.nextInt();
	        if (f * a >= 40000000) {
	            cont++;
	        }
	    }
	    System.out.println(cont);
		in.close();
	}

}
