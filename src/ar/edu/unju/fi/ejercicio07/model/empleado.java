package ar.edu.unju.fi.ejercicio07.model;

	public class empleado {
	    private String nombre;
	    private int legajo;
	    private double salario;

	    private static final double SALARIO_MINIMO = 210000.00;
	    private static final double AUMENTO_POR_MERITOS = 20000.00;

	    // Constructor parametrizado
	    public empleado(String nombre, int legajo, double salario) {
	        this.nombre = nombre;
	        this.legajo = legajo;
	        if (salario >= SALARIO_MINIMO) {
	            this.salario = salario;
	        } else {
	            this.salario = SALARIO_MINIMO;
	        }
	    }

	    // Métodos accesores
	    // (Getters y setters para nombre, legajo, salario)

	    // Método para mostrar los datos del empleado
	    public void mostrarDatos() {
	        System.out.println("Nombre del empleado: " + nombre);
	        System.out.println("Legajo: " + legajo);
	        System.out.printf("Salario $: %.2f%n", salario);
	    }

	    // Método para dar un aumento al salario del empleado
	    public void darAumento() {
	        salario += AUMENTO_POR_MERITOS;
	    }
	}



