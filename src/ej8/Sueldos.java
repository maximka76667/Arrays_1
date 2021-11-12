package ej8;

import java.util.Scanner;

public class Sueldos {

	public static void main(String[] args) {
		
		int cantidad = 12; 
		double sueldos[] = new double[cantidad];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < cantidad; i++) {
			System.out.print("Sueldo " + (i + 1) + ": ");
			sueldos[i] = entrada.nextDouble();
		}
		
		int contador = 0;
		
		System.out.println("");
		
		// Aumentar y escribir
		for(int i = 0; i < cantidad; i++) {
			if(sueldos[i] < 800) {
				sueldos[i] += 100;
				++contador;
			}
			System.out.println("Sueldo " + (i + 1) + ": " + sueldos[i]);
		}
		
		System.out.println("Sueldos actualizados: " + contador);
		
		entrada.close();
	}

}
