package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);

		        
		        int tamanioArray;
		        do {
		            System.out.print("Ingrese el tamaño del array (entre 5 y 10): ");
		            tamanioArray = sc.nextInt();
		        } while (tamanioArray < 5 || tamanioArray > 10);
		       

		      
		        String[] nombres = new String[tamanioArray];

		        for (int i = 0; i < nombres.length; i++) {
		            System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
		            nombres[i] = sc.nextLine();
		        }

		        System.out.println("\nNombres desde el primer índice:");
		        for (int i = 0; i < nombres.length; i++) {
		            System.out.print(nombres[i] + " ");
		        }

		        System.out.println("\nNombres desde la última posición:");
		        for (int i = nombres.length - 1; i >= 0; i--) {
		            System.out.print(nombres[i] + " ");
		        }
		    
		

	}

}
