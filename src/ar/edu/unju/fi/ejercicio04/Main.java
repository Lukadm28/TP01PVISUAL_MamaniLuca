package ar.edu.unju.fi.ejercicio04;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Por favor, ingrese un número entero entre 0 y 10: ");
		        int numero = scanner.nextInt();

		        if (numero < 0 || numero > 10) {
		            System.out.println("El número ingresado está fuera del rango permitido.");
		        } else {
		            int factorial = 1;
		            int contador = 1;

		            while (contador <= numero) {
		                factorial *= contador;
		                contador++;
		            }

		            System.out.println("El factorial de " + numero + " es: " + factorial);
		        }
		    }
		}

	


