package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero{
private List<ProductoFinanciero> productos = new ArrayList<>();


	public ProductoCombinado(LocalDate fechaOperacion, List<ProductoFinanciero> productos) {
		super(fechaOperacion);
	    this.productos = productos;
}


	public double retornarInversion(double montoInicial) {
		return this.productos.stream()
				.mapToDouble(p -> p.retornarInversion(montoInicial)).sum();
	}
	
}
