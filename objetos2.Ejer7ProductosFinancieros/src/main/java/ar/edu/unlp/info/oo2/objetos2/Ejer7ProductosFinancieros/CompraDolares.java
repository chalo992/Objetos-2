package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

import java.time.LocalDate;

public class CompraDolares extends ProductoFinanciero{
private double valorCompra;


	public CompraDolares(LocalDate fechaOperacion, double valorCompra) {
		super(fechaOperacion);
	    this.valorCompra = valorCompra;
}


	public double retornarInversion(double montoInicial) {
		return montoInicial/this.valorCompra;
	}
	
	public boolean permiteProductoSimpleEnCombinado(Membresia m) {
		 return m.permiteCompraDolares();
	 }
}
