package ej6;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Número: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.println("Que número buscas?");
		int numero_busc = entrada.nextInt();
		
		int contador = 0;
		
		for(int i : numeros) if(numero_busc == numeros[i]) ++contador;
		
		System.out.println("Numero " + numero_busc + " está " + contador + " veces");
		
		entrada.close();
	}

}
