package ar.edu.unju.fi.ejercicio12;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import ar.edu.unju.fi.ejercicio12.model.*;
public class main {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el nombre de la persona: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
	        String fechaStr = scanner.nextLine();
	        String[] fechaSplit = fechaStr.split("/");
	        int day = Integer.parseInt(fechaSplit[0]);
	        int month = Integer.parseInt(fechaSplit[1]) - 1; // Restamos 1 porque Enero es 0
	        int year = Integer.parseInt(fechaSplit[2]);
	        Calendar fechaNacimiento = new GregorianCalendar(year, month, day);

	        Persona persona = new Persona(nombre, fechaNacimiento);

	        System.out.println("Nombre: " + persona.getNombre());
	        System.out.println("Fecha de nacimiento: " + fechaStr);
	        System.out.println("Edad: " + persona.calcularEdad() + " años");
	        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
	        System.out.println("Estación: " + persona.obtenerEstacion());
	    }
	}
