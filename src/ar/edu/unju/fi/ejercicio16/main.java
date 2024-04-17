package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);
		        String[] nombres = new String[5];


		        for (int i = 0; i < nombres.length; i++) {
		            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
		            nombres[i] = sc.nextLine();
		        }

		        System.out.println("\nNombres almacenados:");
		        for (String nombre : nombres) {
		            System.out.print(nombre + " ");
		        }


		        System.out.println("\nTamaño del array: " + nombres.length);


		        byte indiceEliminar;
		        do {
		            System.out.print("Ingrese el índice del elemento a eliminar (entre 0 y " + (nombres.length - 1) + "): ");
		            indiceEliminar = sc.nextByte();
		        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);

		        
		        if (indiceEliminar < nombres.length - 1) {
		           
		            for (int i = indiceEliminar; i < nombres.length - 1; i++) {
		                nombres[i] = nombres[i + 1];
		            }
		        }


		        nombres[nombres.length - 1] = "";


		        System.out.println("\nNombres después de la eliminación:");
		        for (String nombre : nombres) {
		            System.out.print(nombre + " ");
		        }
		    }
		
}
