package ej6;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cantidad = 10;
		int numeros[] = new int[cantidad];
		
		for(int i = 0; i < cantidad; i++) {
			System.out.print("N�mero: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.println("Que n�mero buscas?");
		int numero_busc = entrada.nextInt();
		
		int contador = 0;
		
		for(int i : numeros) if(numero_busc == numeros[i]) ++contador;
		
		System.out.println("Numero " + numero_busc + " est� " + contador + " veces");
		
		entrada.close();
	}

}
