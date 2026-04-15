package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

import java.time.LocalDate;

public class PlazoFijo extends ProductoFinanciero{
private int cantidadDias;
private double interes;


	public PlazoFijo(LocalDate fechaOperacion, int cantidadDias, 
			double interes) {
		super(fechaOperacion);
	    this.cantidadDias = cantidadDias;
	    this.interes = interes;
}


	public double retornarInversion(double montoInicial) {
		return ((montoInicial/100) * this.interes) * this.cantidadDias
				+ montoInicial;
	}
	
	public boolean permiteMembresia(Membresia m) {
		return m.permitePlazoFijo();
	}
}
