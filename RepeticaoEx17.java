package br.fatec.repeticao;

import java.util.Scanner;

/*
 * 17. Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Escreva
 * um programa em Java que dada a massa inicial, em gramas, de um material radioativo,
 * determine o tempo necessário para que essa massa se torne menor do que 0,5 grama. O tempo
 * deve ser calculado em horas minutos e segundos.
 */
public class RepeticaoEx17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double massa;
		int tempo = 0, horas, minutos, segundos;
		
		System.out.println("Informe a massa do material radioativo: ");
		massa = in.nextDouble();
		while (massa >= 0.5) {
			massa /= 2;
			tempo += 50;
		}
		
		horas = tempo / 3600;
		minutos = (tempo % 3600) / 60;
		segundos = (tempo % 3600) % 60;
		System.out.printf("Massa do material apos %d hora(s), %d minuto(s) e %d segundo(s): %.2f\n",
				           horas, minutos, segundos, massa);
		in.close();
	}

}
