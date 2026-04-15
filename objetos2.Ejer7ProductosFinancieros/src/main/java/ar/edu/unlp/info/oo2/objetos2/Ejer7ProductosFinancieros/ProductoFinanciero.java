package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
protected LocalDate fechaOperacion;

   public ProductoFinanciero(LocalDate fechaOperacion) {
	   this.fechaOperacion = fechaOperacion;
   }
   
	public abstract double retornarInversion(double montoInicial);
	public abstract boolean permiteMembresia(Membresia m);
}
