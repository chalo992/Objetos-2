package ar.edu.unlp.info.oo1.objetos2.Ejer26PrestamosPrendarios;

public class Inmueble implements BienInterface{
	private String direccion;
	private double superficie;
	private double costoMetroCuadrado;
	public static final double liquidez = 0.2;

	

	public Inmueble(String direccion, double superficie,
			double costoMetroCuadrado) {
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoMetroCuadrado = costoMetroCuadrado;
	}

	public double valor() {
		return this.superficie * this.costoMetroCuadrado;
	}

	public double valorPrendario() {
		return this.valor() * this.liquidez;
	}
}
