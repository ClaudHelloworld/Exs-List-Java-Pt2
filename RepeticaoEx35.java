package br.fatec.repeticao;

import java.util.Scanner;

/*
 * 35. URI 2782 – Escadinha
 */

public class RepeticaoEx35 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n, i, x, ant, dif = 0, cont = 1;
	    n = in.nextInt();    
	    ant = in.nextInt();
	    if (n > 1) {
	        x = in.nextInt();
	        dif = x - ant;
	        ant = x;
	        for (i = 3; i <= n; i++) {
	            x = in.nextInt();
	            if ((x - ant) != dif) {
	                dif = x - ant;
	                cont++;
	            }            
	            ant = x;
	        }
	    }
	    System.out.println(cont);
		in.close();
	}

}
