package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

import java.time.LocalDate;

public class CompraPesos extends ProductoFinanciero{
private double valorCompra;


	public CompraPesos(LocalDate fechaOperacion) {
		super(fechaOperacion);
	    this.valorCompra = 1400;
}


	public double retornarInversion(double montoInicial) {
		return this.valorCompra * montoInicial;
	}
	
}