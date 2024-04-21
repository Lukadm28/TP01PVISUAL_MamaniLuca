package ar.edu.unju.fi.ejercicio18;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.model.Pais;
import java.util.InputMismatchException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        ArrayList<Pais> paises = new ArrayList<>(); // Precargar con objetos de la clase Pais
		        ArrayList<DestinoTuristico> destinosTuristicos = new ArrayList<>();

		        // Menú de opciones
		        Scanner scanner = new Scanner(System.in);
		        int opcion = 0;
		        while (opcion != 9) {
		            System.out.println("Menú de opciones:");
		            System.out.println("1 – Alta de destino turístico");
		            System.out.println("2 – Mostrar todos los destinos turísticos");
		            System.out.println("3 – Modificar el país de un destino turístico");
		            System.out.println("4 – Limpiar el ArrayList de destinos turísticos");
		            System.out.println("5 – Eliminar un destino turístico");
		            System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
		            System.out.println("7 – Mostrar todos los países");
		            System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
		            System.out.println("9 – Salir");

		            System.out.print("Ingrese una opción: ");
		            opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1:
		                    try {
		                   
		                    

		                        Scanner input = new Scanner(System.in);

		                        System.out.println("Ingrese el código del destino turístico:" );
		                        int codigo = input.nextInt();
		                        input.nextLine();  // Limpiar el buffer

		                        System.out.println("Ingrese el nombre del destino turístico:");
		                        String nombre = input.nextLine();

		                        System.out.println("Ingrese el precio del destino turístico:");
		                        double precio = input.nextDouble();
		                        input.nextLine();  // Limpiar el buffer

		                        System.out.println("Ingrese el código del país al que pertenece el destino turístico:");
		                        int codigoPais = input.nextInt();
		                        paises.add(new Pais(1, nombre ));
		                    	paises.add(new Pais(2, nombre ));
		                    	paises.add(new Pais(3, nombre ));
		                    	paises.add(new Pais(4, nombre));

		                        // Buscar el país con el código ingresado en el ArrayList de países
		                        Pais paisAsociado = null;
		                        for (Pais pais : paises) {
		                            if (pais.getCodigo() == codigoPais) {
		                                paisAsociado = pais;
		                                break;
		                            }
		                        }

		                        if (paisAsociado != null) {
		                            System.out.println("Ingrese la cantidad de días:");
		                            int cantidadDias = input.nextInt();

		                            // Crear un nuevo objeto de la clase DestinoTuristico asociado al país encontrado
		                            DestinoTuristico nuevoDestino = new DestinoTuristico(codigo, nombre, precio, paisAsociado, cantidadDias);

		                            // Agregar el nuevo destino turístico al ArrayList de destinos turísticos
		                            destinosTuristicos.add(nuevoDestino);

		                            System.out.println("Destino turístico agregado correctamente.");
		                        } else {
		                            System.out.println("El código de país ingresado no corresponde a ningún país existente.");
		                        }
		                    } catch (InputMismatchException e) {
		                        System.out.println("Error al ingresar los datos: Formato incorrecto.");
		                    } catch (Exception e) {
		                        System.out.println("Error al ingresar el destino turístico: " + e.getMessage());
		                    }
		                    break;
		                case 2:
		           
		                    // Mostrar todos los destinos turísticos
		                    try {
		                        System.out.println("Lista de destinos turísticos:");
		                        for (DestinoTuristico destino : destinosTuristicos) {
		                            System.out.println("Código: " + destino.getCodigo());
		                            System.out.println("Nombre: " + destino.getNombre());
		                            System.out.println("Precio: " + destino.getPrecio());
		                            System.out.println("País: " + destino.getPais().getNombre());
		                            System.out.println("Cantidad de días: " + destino.getCantidadDias());
		                            System.out.println("------------------------");
		                        }
		                    } catch (Exception e) {
		                        System.out.println("Error al mostrar los destinos turísticos: " + e.getMessage());
		                    }
		                    break;

		               
		                case 3:
		                    // Modificar el país de un destino turístico
		                    try {
		                        Scanner input = new Scanner(System.in);
		                        System.out.println("Ingrese el código del destino turístico que desea modificar:");
		                        int codigoDestino = input.nextInt();

		                        // Buscar el destino turístico por su código
		                        DestinoTuristico destinoModificar = null;
		                        for (DestinoTuristico destino : destinosTuristicos) {
		                            if (destino.getCodigo() == codigoDestino) {
		                                destinoModificar = destino;
		                                break;
		                            }
		                        }

		                        if (destinoModificar != null) {
		                            System.out.println("Ingrese el nuevo código del país al que pertenece el destino turístico:");
		                            int nuevoCodigoPais = input.nextInt();

		                            // Buscar el país por su código
		                            Pais nuevoPaisAsociado = null;
		                            for (Pais pais : paises) {
		                                if (pais.getCodigo() == nuevoCodigoPais) {
		                                    nuevoPaisAsociado = pais;
		                                    break;
		                                }
		                            }

		                            if (nuevoPaisAsociado != null) {
		                                destinoModificar.setPais(nuevoPaisAsociado);
		                                System.out.println("País del destino turístico modificado correctamente.");
		                            } else {
		                                System.out.println("El código de país ingresado no corresponde a ningún país existente.");
		                            }
		                        } else {
		                            System.out.println("El código de destino turístico ingresado no corresponde a ningún destino existente.");
		                        }
		                    } catch (InputMismatchException e) {
		                        System.out.println("Error al ingresar los datos: Formato incorrecto.");
		                    } catch (Exception e) {
		                        System.out.println("Error al modificar el país del destino turístico: " + e.getMessage());
		                    }
		                    break;

		                case 4:
		                    // Limpiar el ArrayList de destinos turísticos
		                    try {
		                        destinosTuristicos.clear();
		                        System.out.println("El ArrayList de destinos turísticos ha sido limpiado correctamente.");
		                    } catch (Exception e) {
		                        System.out.println("Error al limpiar la lista de destinos turísticos: " + e.getMessage());
		                    }
		                    break;

		                case 5:
		                    // Eliminar un destino turístico
		                    try {
		                        Scanner input = new Scanner(System.in);
		                        System.out.println("Ingrese el código del destino turístico que desea eliminar:");
		                        int codigoEliminar = input.nextInt();

		                        Iterator<DestinoTuristico> iterator = destinosTuristicos.iterator();
		                        while (iterator.hasNext()) {
		                            DestinoTuristico destino = iterator.next();
		                            if (destino.getCodigo() == codigoEliminar) {
		                                iterator.remove();
		                                System.out.println("Destino turístico eliminado correctamente.");
		                                break;  // Se encontró y eliminó el destino, se puede salir del bucle
		                            }
		                        }
		                    } catch (Exception e) {
		                        System.out.println("Error al eliminar el destino turístico: " + e.getMessage());
		                    }
		                    break;

		          
		                case 6:
		                    // Mostrar los destinos turísticos ordenados por nombre
		                    try {
		                        ArrayList<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinosTuristicos);
		                        Collections.sort(destinosOrdenados, Comparator.comparing(DestinoTuristico::getNombre));

		                        System.out.println("Destinos turísticos ordenados por nombre:");
		                        for (DestinoTuristico destino : destinosOrdenados) {
		                            System.out.println("Nombre: " + destino.getNombre() + ", País: " + destino.getPais().getNombre());
		                        }
		                    } catch (Exception e) {
		                        System.out.println("Error al mostrar los destinos turísticos ordenados: " + e.getMessage());
		                    }
		                    break;

		                case 7:
		                    // Mostrar todos los países
		                    try {
		                        System.out.println("Lista de países:");
		                        for (Pais pais : paises) {
		                            System.out.println("Código: " + pais.getCodigo() + ", Nombre: " + pais.getNombre());
		                        }
		                    } catch (Exception e) {
		                        System.out.println("Error al mostrar los países: " + e.getMessage());
		                    }
		                    break;

		                case 8:
		                    // Mostrar los destinos turísticos que pertenecen a un país
		             
		                    try {
		                        Scanner input = new Scanner(System.in);
		                        System.out.println("Ingrese el código del país para mostrar sus destinos turísticos:");
		                        int codigoPais = input.nextInt();

		                        System.out.println("Destinos turísticos del país:");
		                        for (DestinoTuristico destino : destinosTuristicos) {
		                            if (destino.getPais().getCodigo() == codigoPais) {
		                                System.out.println("Nombre: " + destino.getNombre() + ", Código: " + destino.getCodigo());
		                            }
		                        }
		                    } catch (Exception e) {
		                        System.out.println("Error al mostrar los destinos turísticos del país: " + e.getMessage());
		                    }
		                    break;

		                case 9:
		              
		                    System.out.println("Saliendo del programa. ¡Hasta luego!");
		                    opcion = 9; 
		              

		                    break;
		                default:
		                    System.out.println("Opción inválida");
		            }
		        }
		    }
		}

