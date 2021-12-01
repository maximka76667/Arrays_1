package ej02_10_naturales;

public class Main02 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			numeros[i] = i + 1;
		}
		
		// Print
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
