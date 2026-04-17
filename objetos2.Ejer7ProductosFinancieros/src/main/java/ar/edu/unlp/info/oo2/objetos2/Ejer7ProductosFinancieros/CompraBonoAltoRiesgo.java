package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

import java.time.LocalDate;
import java.util.Random;

public class CompraBonoAltoRiesgo extends ProductoFinanciero{
private int parking;


	public CompraBonoAltoRiesgo(LocalDate fechaOperacion, int parking) {
	super(fechaOperacion);
	this.parking = parking;
}


	public double retornarInversion(double montoInicial) {
		Random random = new Random();
		int variacion = random.nextInt(141) - 70;
		return (montoInicial/100) * variacion + montoInicial;
	}
	
	 public boolean permiteProductoSimpleEnCombinado(Membresia m) {
		 return m.permiteCompraBonoAltoRiesgo();
	 }
}