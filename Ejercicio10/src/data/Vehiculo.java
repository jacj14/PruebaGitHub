/**
 * 
 */
package data;

/**
 * @author Alexander Carrero
 * 15/09/2020 7:16:16 a. m.
 */
public abstract class Vehiculo {
	
	protected String marca;
	protected String color;
	protected int velocidadActual;
	protected int precioBase;
	protected int idVehiculo;
	protected int precioTotal = 0;
	
		
	public Vehiculo(String marca, String color, int velocidadActual, int precioBase, int idVehiculo, int precioTotal) {
		super();
		this.marca = marca;
		this.color = color;
		this.velocidadActual = velocidadActual;
		this.precioBase = precioBase;
		this.idVehiculo = idVehiculo;
		this.precioTotal = precioTotal;
	}

	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getVelocidadActual() {
		return velocidadActual;
	}


	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}


	public int getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}


	public int getIdVehiculo() {
		return idVehiculo;
	}


	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}


	public int getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}


	public abstract double calcularPrecio();

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", color=" + color + ", velocidadActual=" + velocidadActual
				+ ", precioBase=" + precioBase + ", idVehiculo=" + idVehiculo + ", precioTotal=" + precioTotal + "]";
	}

	

	

	
	
	
	
	
	
	
	
	

}
