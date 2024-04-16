package ar.edu.unju.fi.ejercicio05;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Por favor, ingrese un número entero entre 1 y 9: ");
		        int numero = scanner.nextInt();

		        if (numero < 1 || numero > 9) {
		            System.out.println("El número ingresado está fuera del rango permitido.");
		        } else {
		            System.out.println("Tabla de multiplicar del " + numero + ":");

		            for (int i = 1; i <= 10; i++) {
		                System.out.println(numero + " x " + i + " = " + (numero * i));
		            }
		        }
		    }
		}

		        
		    
	



