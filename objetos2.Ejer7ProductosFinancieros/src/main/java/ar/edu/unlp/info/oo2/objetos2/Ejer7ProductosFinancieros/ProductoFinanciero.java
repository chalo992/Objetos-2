package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

import java.time.LocalDate;


public abstract class ProductoFinanciero {
protected LocalDate fechaOperacion;

   public ProductoFinanciero(LocalDate fechaOperacion) {
	   this.fechaOperacion = fechaOperacion;
   }
   
   public boolean permiteMembresia(Membresia m) {
	   return true;
   }
   
   public abstract boolean permiteProductoSimpleEnCombinado(Membresia m);
   public abstract double retornarInversion(double montoInicial);
	
}
