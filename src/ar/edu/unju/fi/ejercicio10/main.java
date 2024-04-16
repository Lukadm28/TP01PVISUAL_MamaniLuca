package ar.edu.unju.fi.ejercicio10;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);

		        for (int i = 1; i <= 3; i++) {
		            System.out.println("\nIngrese los datos para la pizza " + i + ":");
		            System.out.print("Diámetro (10, 20, 30, 40): ");
		            int diametro = scanner.nextInt();
		            System.out.print("¿Lleva ingredientes especiales? (true/false): ");
		            boolean ingredientesEspeciales = scanner.nextBoolean();
		            scanner.nextLine(); 

		            Pizza pizza = new Pizza();
		            pizza.setDiametro(diametro);
		            pizza.setIngredientesEspeciales(ingredientesEspeciales);
		            pizza.calcularPrecio();
		            pizza.calcularArea();

		            System.out.println("\n** Pizza " + i + " **");
		            System.out.println("Diámetro = " + pizza.getDiametro());
		            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
		            if (ingredientesEspeciales) {
		                System.out.println("Precio Pizza (con ingredientes especiales) = " + pizza.getPrecio() + "$");
		            } else {
		                System.out.println("Precio Pizza (sin ingredientes especiales) = " + pizza.getPrecio() + "$");
		            }
		            System.out.println("Área de la pizza = " + pizza.getArea());
		        }
		    }
		}

		                
		        
		    
		

	


