package ej10_precios;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero de artículos: ");
		int numero_articulos = entrada.nextInt();

		double precios[] = new double[numero_articulos];
		
		int debajo_30 = 0;

		double precio_maximo = Integer.MIN_VALUE, 
				precio_minimo = Integer.MAX_VALUE,
				suma = 0;

		for(int i = 0; i < numero_articulos; i++) {
			System.out.print("Precio de artículo " + (i + 1) + ": ");
			double precio = entrada.nextDouble();
			precios[i] = precio;
			suma += precio;
			if(precio > precio_maximo) precio_maximo = precio;
			if(precio < precio_minimo) precio_minimo = precio;
			if(precio < 30) debajo_30++;
		}

		System.out.println("Precio medio: " + (suma / numero_articulos));
		System.out.println("Precio maximo: " + precio_maximo);
		System.out.println("Precio minimo: " + precio_minimo);
		System.out.println("Debajo de 30: " + debajo_30);

		entrada.close();
	}

}
