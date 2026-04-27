package ar.edu.unlp.info.oo1.objetos2.Ejer12AlquilerAutos;

import java.time.LocalDate;

public class Reserva {
private int cantidadDias;
private LocalDate fecha;
private Usuario usuario;
private AutoEnAlquiler autoEnAlquiler;
private PoliticaCancelacion politica;



public Reserva(int cantidadDias, LocalDate fecha, Usuario usuario, 
		AutoEnAlquiler autoEnAlquiler, PoliticaCancelacion politica) {
	this.cantidadDias = cantidadDias;
	this.fecha = fecha;
	this.usuario = usuario;
	this.autoEnAlquiler = autoEnAlquiler;
	this.politica = politica;
}

public void setPoliticaCancelacion(PoliticaCancelacion politica) {
	this.politica = politica;
}

public double montoAPagar() {
	return this.cantidadDias * this.autoEnAlquiler.getPrecioPorDia();
}

public double montoAReembolsar() {
	return this.politica.reembolso(this.montoAPagar(), this.fecha);
}

}
