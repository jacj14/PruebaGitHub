/**
 * 
 */
package presentacion;

import java.util.Scanner;

import data.Automovil;
import data.Bicicleta;
import data.Camion;
import data.Vehiculo;
import logica.Concesionario;

/**
 * @author Alexander Carrero
 * 16/09/2020 10:01:48 p. m.
 */

public class InterfazUsuario {

	private Scanner teclado = new Scanner(System.in);
	
	private Concesionario miConcesionario;
	
	//En el constructor se instancia un objeto de la clase Concesionario a través de una relación de composición
	
	public InterfazUsuario(String nombre) {
		this.miConcesionario = new Concesionario(nombre);
		
	}
	
	//Metodo menu, orienta al usuario frente a las opciones que ofrece la aplicación; a través de un condicional multiple ejecuta diferentes metodos
	
	public void menu() {
		int opcion = 0;
		boolean salir = false;
		while(!salir) {
			System.out.println("\nBienvenidos al concesionario " + miConcesionario.getNombre());
			System.out.println("\nA continuacion encontrara el menu de opciones ");
			System.out.println("1. Crear un vehiculo en el almacén");
			System.out.println("2. Ver el catalogo de vehiculos");
			System.out.println("3. Vender un vehiculo");
			System.out.println("4. Salir");
			System.out.println("\nIngrese una de las opciones ");
			
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1 :
				crearVehiculo(); 
				break;
			case 2 :
				miConcesionario.mostrarCatalogo(); 
				System.out.println(" ");
				break;
			case 3 :
				vender(); 
				break;	
			case 4 :
				salir = true; 
				System.out.println("\nGracias por su visita al concesionario El Carro Veloz");
				break;
			default :
				System.out.println("Error, debe ingresar una opcion valida entre 1 y 4");
			}
			
		}
		
	}
	
	/*
	 * Metodo que permite crear una instancia de la clase Vehiculo, el cual contiene un condicional multiple que 
	 * permite especificar a cual de las clases derivadas pertenece el objeto. En cada uno de los casos del condicional, una vez se hace la validación
	 * se crea la instancia, haciendo uso del poliformismo.
	 */
	
	private void crearVehiculo() {
		
		Vehiculo miVehiculo = null;
		
		System.out.println("Por favor ingrese los datos del vehiculo que desea crear: ");
		System.out.println("Marca: ");
		String marca = teclado.next();
		System.out.println("Color: ");
		String color = teclado.next();
		System.out.println("Velocidad Actual: ");
		int velocidadActual = teclado.nextInt();
		System.out.println("Precio Base: ");
		int precioBase = teclado.nextInt();
		System.out.println("Id del vehiculo: ");
		int idVehiculo = teclado.nextInt();
		
		System.out.println("Tipo de vehiculo 1. Automovil, 2. Bicicleta, 3. Camion");
		int dato = teclado.nextInt();
		
		
		switch (dato) {
		
			case 1: System.out.println("Ingrese el cilindraje del Automovil");
			int cilindraje = teclado.nextInt();
			miVehiculo = new Automovil(marca, color, velocidadActual,  precioBase, idVehiculo, 0, cilindraje);
			
			break;
			
			case 2: System.out.println("Ingrese el plato de la Bicicleta");
			int platoActual = teclado.nextInt();
			System.out.println("Ingrese el pinon actual de la Bicicleta");
			int pinonActual = teclado.nextInt();
			miVehiculo = new Bicicleta(marca, color, velocidadActual, precioBase, idVehiculo, 0, platoActual, pinonActual);
			break;
		
			case 3: System.out.println("Ingrese la capacidad de carga del Camion");
			int capacidadCarga = teclado.nextInt();
			miVehiculo = new Camion(marca, color, velocidadActual, precioBase, idVehiculo, 0, capacidadCarga);
			break;
		
			default :System.out.println("La opción elegida no existe");
			
		}
		
		miConcesionario.crearVehiculo(miVehiculo);
		
		System.out.println("\nEl vehiculo fue creado satisfactoriamente, si desea crear otro por favor seleccione la opcion correspondiente");
		System.out.println(" ");
		
		}
	
	/*
	 * Metodo que haciendo uso de dos metodos (mostrarCatalogo y BuscarVehiculo) creados en la clase Concesionario, busca una instancia de la clase Vehiculo 
	 * a través de el atributo idVehiculo y muestra en pantalla el resultado del metodo abstracto calcularPrecio que se encuentra en la clase Vehiculo
	 */
		
	private void vender() {
		miConcesionario.mostrarCatalogo();
		System.out.println("\nPara iniciar la compra, ingrese el Id del vehiculo: ");
		int idVehiculo = teclado.nextInt();
		
		Vehiculo v = miConcesionario.buscarVehiculo(idVehiculo);
		
		if (v == null) {
			System.out.println(" El vehiculo no existe ");
		}else {
			System.out.println(v);
			
			System.out.println("\nEl precio total del vehiculo elegido es de: $" + v.calcularPrecio());
			
		}
	}
	
	
	
	
	
	
	
	
}
