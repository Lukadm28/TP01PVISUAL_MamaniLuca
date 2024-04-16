package ar.edu.unju.fi.ejercicio06.main;
import ar.edu.unju.fi.ejercicio06.model.*;
import java.time.LocalDate;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        // Objeto creado con el constructor por defecto
		        Persona persona1 = new Persona();
		        System.out.println("Datos de la persona creada con constructor por defecto:");
		        persona1.mostrarDatos();

		        // Objeto creado con el constructor parametrizado
		        System.out.println("\nIngrese los datos para crear una nueva persona:");
		        System.out.print("DNI: ");
		        String dni = scanner.nextLine();
		        System.out.print("Nombre: ");
		        String nombre = scanner.nextLine();
		        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
		        String fechaStr = scanner.nextLine();
		        LocalDate fechaNacimiento = LocalDate.parse(fechaStr);
		        System.out.print("Provincia: ");
		        String provincia = scanner.nextLine();

		        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
		        System.out.println("\nDatos de la persona creada con constructor parametrizado:");
		        persona2.mostrarDatos();

		        // Objeto creado con el constructor que inicializa dni, nombre y fecha de nacimiento
		        System.out.println("\nIngrese los datos para crear otra persona:");
		        System.out.print("DNI: ");
		        dni = scanner.nextLine();
		        System.out.print("Nombre: ");
		        nombre = scanner.nextLine();
		        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
		        fechaStr = scanner.nextLine();
		        fechaNacimiento = LocalDate.parse(fechaStr);

		        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
		        System.out.println("\nDatos de la persona creada con constructor que inicializa dni, nombre y fecha de nacimiento:");
		        persona3.mostrarDatos();
		    }
		}

