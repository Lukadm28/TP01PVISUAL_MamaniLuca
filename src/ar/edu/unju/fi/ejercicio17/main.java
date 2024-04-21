package ar.edu.unju.fi.ejercicio17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        ArrayList<jugador> jugadores = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);
		        int opcion = 0;

		        do {
		            System.out.println("Menú de opciones:");
		            System.out.println("1 – Alta de jugador");
		            System.out.println("2 – Mostrar los datos del jugador");
		            System.out.println("3 – Mostrar todos los jugadores ordenados por apellido");
		            System.out.println("4 – Modificar los datos de un jugador");
		            System.out.println("5 – Eliminar un jugador");
		            System.out.println("6 – Mostrar la cantidad total de jugadores");
		            System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		            System.out.println("8 – Salir");
		            System.out.print("Ingrese una opción: ");

		            try {
		                opcion = scanner.nextInt();
		                scanner.nextLine(); // Limpiar el buffer de entrada

		                switch (opcion) {
		               
		                    case 1:
		                        // Lógica para dar de alta un jugador
		                        System.out.println("Ingrese el nombre del jugador:");
		                        String nombre = scanner.nextLine();
		                        System.out.println("Ingrese el apellido del jugador:");
		                        String apellido = scanner.nextLine();
		                        System.out.println("Ingrese la fecha de nacimiento (en formato dd/mm/yyyy):");
		                        String fechaNacimiento = scanner.nextLine();
		                        System.out.println("Ingrese la nacionalidad:");
		                        String nacionalidad = scanner.nextLine();
		                        System.out.println("Ingrese la estatura:");
		                        double estatura = scanner.nextDouble();
		                        System.out.println("Ingrese el peso:");
		                        double peso = scanner.nextDouble();
		                        scanner.nextLine(); // Limpiar el buffer de entrada
		                        System.out.println("Ingrese la posición (delantero, medio, defensa, arquero):");
		                        String posicion = scanner.nextLine();

		                        jugador nuevoJugador = new jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
		                        jugadores.add(nuevoJugador);
		                        System.out.println("El jugador ha sido agregado correctamente.");
		                    
		                        break;
		                  
		                            case 2:
		                                // mostrar los datos de un jugador
		                                System.out.println("Ingrese el nombre del jugador:");
		                                String nombreBuscar = scanner.nextLine();
		                                System.out.println("Ingrese el apellido del jugador:");
		                                String apellidoBuscar = scanner.nextLine();
		                                for (jugador jugador : jugadores) {
		                                    if (jugador.getNombre().equals(nombreBuscar) && jugador.getApellido().equals(apellidoBuscar)) {
		                                        System.out.println("Nombre: " + jugador.getNombre());
		                                        System.out.println("Apellido: " + jugador.getApellido());
		                                        System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento());
		                                        System.out.println("Nacionalidad: " + jugador.getNacionalidad());
		                                        System.out.println("Estatura: " + jugador.getEstatura());
		                                        System.out.println("Peso: " + jugador.getPeso());
		                                        System.out.println("Posición: " + jugador.getPosicion());
		                                    
		                                        break;

		                            }
		                        }
		                        break;
		                  
		                    case 3:
		        // mostrar todos los jugadores ordenados por apellido
		                        Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareTo(j2.getApellido()));
		                        for (jugador jugador : jugadores) {
		                            System.out.println("Nombre: " + jugador.getNombre());
		                            System.out.println("Apellido: " + jugador.getApellido());
		                            System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento());
		                            System.out.println("Nacionalidad: " + jugador.getNacionalidad());
		                            System.out.println("Estatura: " + jugador.getEstatura());
		                            System.out.println("Peso: " + jugador.getPeso());
		                            System.out.println("Posición: " + jugador.getPosicion());
		                            System.out.println();      // Salto de línea para separar cada jugador
		                        }
		                        break;

		                  
		                    case 4:
		          //modificar los datos de un jugador
		                        System.out.println("Ingrese el nombre del jugador a modificar:");
		                        String nombreModificar = scanner.nextLine();
		                        System.out.println("Ingrese el apellido del jugador a modificar:");
		                        String apellidoModificar = scanner.nextLine();
		                        for (jugador jugador : jugadores) {
		                            if (jugador.getNombre().equals(nombreModificar) && jugador.getApellido().equals(apellidoModificar)) {
		                                System.out.println("Ingrese el nuevo nombre:");
		                                jugador.setNombre(scanner.nextLine());
		                                System.out.println("Ingrese el nuevo apellido:");
		                                jugador.setApellido(scanner.nextLine());
		                                System.out.println("Ingrese la nueva fecha de nacimiento (en formato dd/mm/yyyy):");
		                                jugador.setFechaNacimiento(scanner.nextLine());
		                                System.out.println("Ingrese la nueva nacionalidad:");
		                                jugador.setNacionalidad(scanner.nextLine());
		                                System.out.println("Ingrese la nueva estatura:");
		                                jugador.setEstatura(scanner.nextDouble());
		                                System.out.println("Ingrese el nuevo peso:");
		                                jugador.setPeso(scanner.nextDouble());
		                                scanner.nextLine(); // Limpiar el salto de línea
		                                System.out.println("Ingrese la nueva posición (delantero, medio, defensa, arquero):");
		                                jugador.setPosicion(scanner.nextLine());
		                                System.out.println("Los datos del jugador han sido actualizados.");
		                                break;
		                            
		                        
		                    

		                                    }
		                                }
		                                break;

		                      
		                    case 5:
		   //  eliminar un jugador
		                        System.out.println("Ingrese el nombre del jugador a eliminar:");
		                        String nombreEliminar = scanner.nextLine();
		                        System.out.println("Ingrese el apellido del jugador a eliminar:");
		                        String apellidoEliminar = scanner.nextLine();
		                        Iterator<jugador> iterator = jugadores.iterator();
		                        while (iterator.hasNext()) {
		                            jugador jugador = iterator.next();
		                            if (jugador.getNombre().equals(nombreEliminar) && jugador.getApellido().equals(apellidoEliminar)) {
		                                iterator.remove();
		                                System.out.println("El jugador ha sido eliminado.");
		                            }
		                        }
		                        break;
		                    case 6:
//  mostrar la cantidad total de jugadores
		                        System.out.println("La cantidad total de jugadores es: " + jugadores.size());
		                        break;
		                    case 7:
		          //  mostrar la cantidad de jugadores por nacionalidad
		                        System.out.println("Ingrese la nacionalidad:");
		                        String nacionalidadBuscar = scanner.nextLine();
		                        int contador = 0;
		                        for (jugador jugador : jugadores) {
		                            if (jugador.getNacionalidad().equals(nacionalidadBuscar)) {
		                                contador++;
		                            }
		                        }
		                        System.out.println("La cantidad de jugadores de la nacionalidad " + nacionalidadBuscar + " es: " + contador);
		                        break;
		                    case 8:
		                        System.out.println("Saliendo del programa...");
		                        break;
		                    default:
		                        System.out.println("Opción no válida. Por favor, ingrese una opción del 1 al 8.");
		                }
		            } catch (Exception e) {
		                System.out.println("Ha ocurrido un error. Por favor, ingrese una opción válida.");
		                scanner.next(); // Limpiar el buffer de entrada
		            }
		        } while (opcion != 8);
		    }
		}

	


