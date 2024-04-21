package ar.edu.unju.fi.ejercicio17.model;
import java.time.LocalDate;
import java.time.Period;

public class jugador {
	


	    private String nombre;
	    private String apellido;
	    private String fechaNacimiento;
	    private String nacionalidad;
	    private double estatura;
	    private double peso;
	    private String posicion;

	    public jugador(String nombre, String apellido, String fechaNacimiento, String nacionalidad, double estatura, double peso, String posicion) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.fechaNacimiento = fechaNacimiento;
	        this.nacionalidad = nacionalidad;
	        this.estatura = estatura;
	        this.peso = peso;
	        this.posicion = posicion;
	    }

	    	    public int calcularEdad() {
	    	        // Obtener la fecha de nacimiento del jugador
	    	        String[] parts = this.fechaNacimiento.split("/");
	    	        int day = Integer.parseInt(parts[0]);
	    	        int month = Integer.parseInt(parts[1]);
	    	        int year = Integer.parseInt(parts[2]);

	    	        // Crear un objeto LocalDate con la fecha de nacimiento del jugador
	    	        LocalDate fechaNacimiento = LocalDate.of(year, month, day);

	    	        // Obtener la fecha actual
	    	        LocalDate fechaActual = LocalDate.now();

	    	        // Calcular la edad del jugador
	    	        Period periodo = Period.between(fechaNacimiento, fechaActual);
	    	        return periodo.getYears();
	    	    
	    	        
	    
  }
	    	    public String getNombre() {
	    	        return nombre;
	    	    }

	    	    public void setNombre(String nombre) {
	    	        this.nombre = nombre;
	    	    }

	    	    public String getApellido() {
	    	        return apellido;
	    	    }

	    	    public void setApellido(String apellido) {
	    	        this.apellido = apellido;
	    	    }

	    	    public String getFechaNacimiento() {
	    	        return fechaNacimiento;
	    	    }

	    	    public void setFechaNacimiento(String fechaNacimiento) {
	    	        this.fechaNacimiento = fechaNacimiento;
	    	    }

	    	    public String getNacionalidad() {
	    	        return nacionalidad;
	    	    }

	    	    public void setNacionalidad(String nacionalidad) {
	    	        this.nacionalidad = nacionalidad;
	    	    }

	    	    public double getEstatura() {
	    	        return estatura;
	    	    }

	    	    public void setEstatura(double estatura) {
	    	        this.estatura = estatura;
	    	    }

	    	    public double getPeso() {
	    	        return peso;
	    	    }

	    	    public void setPeso(double peso) {
	    	        this.peso = peso;
	    	    }

	    	    public String getPosicion() {
	    	        return posicion;
	    	    }

	    	    public void setPosicion(String posicion) {
	    	        this.posicion = posicion;
	    	    }
	    	}
	   

	


