package ar.edu.unlp.info.oo1.objetos2.Ejer26PrestamosPrendarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automovil implements BienInterface{
private LocalDate modelo;
private int kilometraje;
private double costoKM;
public static final double liquidez = 0.7;

public Automovil(LocalDate modelo, int kilometraje, double costoKM) {
	this.modelo = modelo;
	this.kilometraje = kilometraje;
	this.costoKM = costoKM;
}

private int anioAntiguedad() {
	return (int) ChronoUnit.YEARS.between(this.modelo, LocalDate.now());
}

public double valor() {
	double total = this.kilometraje * this.costoKM;
	return total - ( (total * 0.1) * this.anioAntiguedad() );
}

public double valorPrendario() {
	return this.valor() * this.liquidez;
}
}
