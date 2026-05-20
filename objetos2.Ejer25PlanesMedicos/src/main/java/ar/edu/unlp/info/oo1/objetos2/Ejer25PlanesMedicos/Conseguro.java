package ar.edu.unlp.info.oo1.objetos2.Ejer25PlanesMedicos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Conseguro implements ConseguroInterface{
private String nombre;
private int descuento;
private LocalDate fechaIngreso;
private double montoCobertura;

public Conseguro(String nombre, int descuento, LocalDate fechaIngreso,
		double montoCobertura) {
	this.nombre = nombre;
	this.descuento = descuento;
	this.fechaIngreso = fechaIngreso;
	this.montoCobertura = montoCobertura;
}

public double getDescuento() {
	return this.descuento;
}

public int getAntiguedad() {
	return (int) ChronoUnit.YEARS.between(this.fechaIngreso, LocalDate.now());
}

public double getMontoCobertura() {
	return this.montoCobertura;
}

}
