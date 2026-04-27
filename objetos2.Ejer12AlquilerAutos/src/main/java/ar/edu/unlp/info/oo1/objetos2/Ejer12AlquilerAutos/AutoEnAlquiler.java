package ar.edu.unlp.info.oo1.objetos2.Ejer12AlquilerAutos;

public class AutoEnAlquiler {
private double precioPorDia;
private int cantidadPlazas;
private String marca;


public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca) {
	this.precioPorDia = precioPorDia;
	this.cantidadPlazas = cantidadPlazas;
	this.marca = marca;
}

public double getPrecioPorDia() {
	return this.precioPorDia;
}

}
