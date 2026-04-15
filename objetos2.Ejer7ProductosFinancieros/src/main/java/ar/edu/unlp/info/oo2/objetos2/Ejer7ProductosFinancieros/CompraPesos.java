package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

import java.time.LocalDate;

public class CompraPesos extends ProductoFinanciero{
private double valorCompra;


	public CompraPesos(LocalDate fechaOperacion, double valorCompra) {
		super(fechaOperacion);
	    this.valorCompra = valorCompra;
}


	public double retornarInversion(double montoInicial) {
		return this.valorCompra * montoInicial;
	}
	
	public boolean permiteMembresia(Membresia m) {
		return m.permiteCompraPesos();
	}
}
