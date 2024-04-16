package ar.edu.unju.fi.ejercicio08;
import ar.edu.unju.fi.ejercicio08.model.*;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar al usuario que ingrese el valor de n
		        System.out.println("Ingrese el valor de n: ");
		        int n = scanner.nextInt();

		        // Crear un objeto de la clase CalculadoraEspecial
		        CalculadoraEspecial calculadora = new CalculadoraEspecial();
		        calculadora.setN(n);

		        // Invocar los métodos y mostrar los resultados por consola
		        System.out.println("El resultado de la sumatoria es: " + calculadora.calcularSumatoria());
		        System.out.println("El resultado de la productoria es: " + calculadora.calcularProductoria());
		    }
		}

	


