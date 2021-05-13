

import java.util.Scanner;

class Salario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int hours = scanner.nextInt();
		double value = scanner.nextDouble();
		
		double salary = hours * value;
		
		System.out.printf("NUMBER = %d\n", number);
		System.out.printf("SALARY = U$ %.2f\n", salary);
		scanner.close();
	}
}
