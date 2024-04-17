package ar.edu.unju.fi.ejercicio13;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);

		        int[] numeros = new int[8];

		
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Ingrese un número entero para la posición " + i + ": ");
		            numeros[i] = sc.nextInt();
		        }

		        System.out.println("\nValores del array:");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
		      }
   }
}




