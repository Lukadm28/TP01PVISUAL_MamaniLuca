package ar.edu.unju.fi.ejercicio06.model;
import java.time.LocalDate;

public class Persona {



	    private String dni;
	    private String nombre;
	    private LocalDate fechaNacimiento;
	    private String provincia;

	    // Constructor por defecto
	    public Persona() {
	        this.dni = "44515244";
	        this.nombre = "Luca Demian";
	        this.fechaNacimiento = LocalDate.of(2002,10,28); 
	        this.provincia = "Jujuy";
	    }

	    // Constructor parametrizado
	    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.provincia = provincia;
	    }

	    // Constructor que inicializa solo los atributos dni, nombre y fecha de nacimiento
	    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.provincia = "Jujuy";
	    }

	
	    // (Getters y setters para dni, nombre, fechaNacimiento, provincia)

	 
	    public int calcularEdad() {
	        return LocalDate.now().getYear() - fechaNacimiento.getYear();
	    }

	    public boolean esMayorEdad() {
	        return calcularEdad() >= 18;
	    }

	    public void mostrarDatos() {
	        System.out.println("DNI: " + dni);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
	        System.out.println("Provincia: " + provincia);
	        System.out.println("Edad: " + calcularEdad());
	        if (esMayorEdad()) {
	            System.out.println("La persona es mayor de edad");
	        } else {
	            System.out.println("La persona no es mayor de edad");
	        }
	    }
	}

