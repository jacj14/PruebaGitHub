/**
 * 
 */
package data;

import logica.IManejable;

/**
 * @author Alexander Carrero
 * 15/09/2020 7:35:41 a. m.
 */
public class Automovil extends Vehiculo implements IManejable{
	
	private int cilindraje;

	
	public Automovil(String marca, String color, int velocidadActual, int precioBase, int idVehiculo, int precioTotal, int cilindraje) {
		super(marca, color, velocidadActual, precioBase, idVehiculo, precioTotal);
		this.cilindraje = cilindraje;
	
	}

	@Override
	public double calcularPrecio() {
		this.precioTotal = this.precioBase += this.precioBase*0.25;
		return this.precioTotal;
		
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}


	@Override
	public void acelerar(int dato) {
		this.velocidadActual += 10;
		System.out.println("El automovil acaba de acelerar, ahora su velocidad es: " + this.velocidadActual);
		
	}

	@Override
	public void frenar(int dato) {
		this.velocidadActual -= 10;
		System.out.println("El automovil acaba de frenar, ahora su velocidad es: " + this.velocidadActual);
		
	}
	
	@Override
	public String toString() {
		return "Vehiculo tipo Automovil, marca: " + super.marca + ", color: " + super.color + ", velocidad actual: " + 
	super.velocidadActual + "km/h, precio base: $" + super.precioBase + ", ID del vehiculo: " + super.idVehiculo + ", cilindraje: " + this.cilindraje;
	}
	
	
	
	

}
