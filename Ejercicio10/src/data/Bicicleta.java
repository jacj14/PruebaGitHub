/**
 * 
 */
package data;

/**
 * @author Alexander Carrero
 * 15/09/2020 7:23:47 a. m.
 */
public class Bicicleta extends Vehiculo{
	
	private int platoActual;
	private int pinonActual;
	
	
	public Bicicleta(String marca, String color, int velocidadActual, int precioBase, int idVehiculo, int precioTotal, int platoActual, int pinonActual) {
		super(marca, color, velocidadActual, precioBase, idVehiculo, precioTotal);
		this.platoActual = platoActual;
		this.pinonActual = pinonActual;
	}
	
	public void cambiarPlato() {
		this.platoActual +=1;
	}
	
	public void cambiarPinon() {
		this.pinonActual +=1;
	}

	public int getPlatoActual() {
		return platoActual;
	}

	public void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}

	public int getPinonActual() {
		return pinonActual;
	}

	public void setPinonActual(int pinonActual) {
		this.pinonActual = pinonActual;
	}


	@Override
	public double calcularPrecio() {
		this.precioTotal = this.precioBase -= (precioBase * 0.30);
		return this.precioTotal;
		
	}

	@Override
	public String toString() {
		return "Vehiculo tipo Bicicleta, marca: " + super.marca + ", color: " + super.color + ", velocidad actual: " + 
	super.velocidadActual + "km/h, precio base: $" + super.precioBase + ", ID del vehiculo: " + super.idVehiculo + 
	", plato actual: " + this.platoActual + ", pinon actual: " + this.pinonActual;
	}
	
	
	

}
