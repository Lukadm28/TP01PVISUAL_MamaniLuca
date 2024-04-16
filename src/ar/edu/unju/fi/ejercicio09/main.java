package ar.edu.unju.fi.ejercicio09;
import ar.edu.unju.fi.ejercicio09.model.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);

		     
		        for (int i = 1; i <= 3; i++) {
		            System.out.println("Ingrese los datos para el producto " + i + ":");
		            System.out.print("Nombre: ");
		            String nombre = scanner.nextLine();
		            System.out.print("Código: ");
		            String codigo = scanner.nextLine();
		            System.out.print("Precio: ");
		            double precio = scanner.nextDouble();
		            System.out.print("Descuento (%): ");
		            int descuento = scanner.nextInt();
		            scanner.nextLine(); 

		            
		            Producto producto = new Producto();
		            producto.setNombre(nombre);
		            producto.setCodigo(codigo);
		            producto.setPrecio(precio);
		            producto.setDescuento(descuento);

		           
		            System.out.println("\nDatos del producto " + i + ":");
		            System.out.println("Nombre: " + producto.getNombre());
		            System.out.println("Código: " + producto.getCodigo());
		            System.out.println("Precio: " + producto.getPrecio());
		            System.out.println("Descuento: " + producto.getDescuento() + "%");
		            System.out.println("Precio con descuento: " + producto.calcularDescuento() + "\n");
		        }
		    }
		}

	


