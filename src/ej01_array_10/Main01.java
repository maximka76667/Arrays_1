package ej01_array_10;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		int cantidad = 10;
		int valores[] = new int[cantidad];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < cantidad; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			valores[i] = entrada.nextInt();
		}
		
		entrada.close();
		
		// Print
		for(int i = 0; i < valores.length; i++) System.out.println("Valor de array " + (i + 1) + ": " + valores[i]);
		
	}

}
