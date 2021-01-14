/**
 * 
 */
package logica;

import java.util.ArrayList;
import java.util.Arrays;

import data.Vehiculo;

/**
 * @author Alexander Carrero
 * 15/09/2020 12:07:12 p. m.
 */
public class Concesionario {
	
	private String nombre;
	private ArrayList<Vehiculo> listaVehiculos;
	
	public Concesionario(String nombre) {
		super();
		this.nombre = nombre;
		// Relación de comoposición, se adicionan instancias de la Clase Vehculo, en un arreglo
		this.listaVehiculos = new ArrayList();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList <Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	/**
	 * Este método recorre el arreglo, verifica que cada posición del arreglo se encuentre vacía y le asigna una instancia de la clase Vehiculo 
	 * @param vehiculo
	 */
	
	public void crearVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
	}
	
	/**
	 * 
	 * Este método recorre el arreglo verifica el id del vehiculo y lo compara con el id ingresado para verificar si existe y en caso de existir 
	 * retorna el objeto de Vehiculo identificado con ese id.
	 * @param idVehiculo
	 * @return
	 */
	
	public Vehiculo buscarVehiculo(int idVehiculo) {
		Vehiculo vehiculo = null;
		for (Vehiculo v: listaVehiculos) {
			if(v.getIdVehiculo() == idVehiculo) {
				vehiculo = v;
				break;
			}
		}
		
		return vehiculo;
	}
	
	/**
	 * Método que recorre el arreglo y va iprimienoo en pantalla los objetos del mismo 
	 */
	
	public void mostrarCatalogo() {
		for(Vehiculo v: listaVehiculos) {
			System.out.println(v);
		}
	}

	
	
	

}
