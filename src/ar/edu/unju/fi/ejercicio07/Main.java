package ar.edu.unju.fi.ejercicio07;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio07.model.*;
public class Main {

	
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar al usuario que ingrese los datos para un nuevo empleado
		        System.out.println("Ingrese el nombre del empleado: ");
		        String nombre = scanner.nextLine();
		        System.out.println("Ingrese el legajo del empleado: ");
		        int legajo = scanner.nextInt();
		        System.out.println("Ingrese el salario del empleado: ");
		        double salario = scanner.nextDouble();

		        // Crear un objeto de la clase Empleado utilizando el constructor parametrizado
		        empleado empleado = new empleado(nombre, legajo, salario);

		        // Mostrar los datos del empleado
		        System.out.println("\nDatos del empleado:");
		        empleado.mostrarDatos();

		        // Dar un aumento al salario del empleado
		        empleado.darAumento();

		        // Mostrar los datos del empleado después del aumento
		        System.out.println("\nDatos del empleado después del aumento:");
		        empleado.mostrarDatos();
		    }
		}

	

	


