package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);

		        int tamanoArray;
		        do {
		            System.out.print("Ingrese el tamaño del array (entre 3 y 10): ");
		            tamanoArray = sc.nextInt();
		        } while (tamanoArray < 3 || tamanoArray > 10);

		        int[] numeros = new int[tamanoArray];

		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Ingrese un número entero para la posición " + i + ": ");
		            numeros[i] = sc.nextInt();
		        }

		        int suma = 0;
		        System.out.println("\nValores del array:");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print(numeros[i] + " ");
		            suma += numeros[i];
		        }

		        System.out.println("\nSuma total: " + suma);
		    }
}

	


