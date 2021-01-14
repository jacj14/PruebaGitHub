/**
 * 
 */
package data;

import logica.IManejable;

/**
 * @author Alexander Carrero
 * 15/09/2020 7:48:13 a. m.
 */
public class Camion extends Vehiculo implements IManejable{

	private int capacidadCarga;

	
	public Camion(String marca, String color, int velocidadActual, int precioBase, int idVehiculo, int precioTotal, int capacidadCarga) {
		super(marca, color, velocidadActual, precioBase, idVehiculo, precioTotal);
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public double calcularPrecio() {
		this.precioTotal = precioBase += precioBase*0.15;
		return this.precioTotal;
		
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public void acelerar(int dato) {
		this.velocidadActual += 8;
		System.out.println("El camion acaba de acelerar, ahora su velocidad es: " + this.velocidadActual);
		
	}

	@Override
	public void frenar(int dato) {
		this.velocidadActual -= 8;
		System.out.println("El camion acaba de frenar, ahora su velocidad es: " + this.velocidadActual);
		
	}
	
	@Override
	public String toString() {
		return "Vehiculo tipo Camion, marca: " + super.marca + ", color: " + super.color + ", velocidad actual: " + 
	super.velocidadActual + "km/h, precio base: $" + super.precioBase + ", ID del vehiculo: " + super.idVehiculo + ", capacidad de carga: " + this.capacidadCarga;
	}
	
	
	

}
