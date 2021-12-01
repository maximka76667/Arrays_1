package ej05_notas;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero de alumnos: ");
		int numero_alumnos = entrada.nextInt();

		double notas[] = new double[numero_alumnos];
		double suma = 0, 
				nota_maxima = Integer.MIN_VALUE, 
				nota_minima = Integer.MAX_VALUE;

		for(int i = 0; i < numero_alumnos; i++) {
			System.out.print("Nota de alumno " + (i + 1) + ": ");
			double nota = entrada.nextDouble();
			notas[i] = nota;
			suma += nota;
			if(nota > nota_maxima) nota_maxima = nota;
			if(nota < nota_minima) nota_minima = nota;
		}

		System.out.println("Nota media: " + (suma / numero_alumnos));
		System.out.println("Nota maxima: " + nota_maxima);
		System.out.println("Nota minima: " + nota_minima);

		entrada.close();
	}

}
