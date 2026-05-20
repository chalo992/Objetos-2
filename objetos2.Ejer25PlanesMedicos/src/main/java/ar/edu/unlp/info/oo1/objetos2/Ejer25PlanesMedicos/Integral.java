package ar.edu.unlp.info.oo1.objetos2.Ejer25PlanesMedicos;

import java.time.LocalDate;

public class Integral extends PlanMedico{
public static final int monto = 22000;
public static final int anioPorAntiguedad = 10000;


	public Integral(LocalDate fechaContratacion) {
	super(fechaContratacion);
}

	public  double montoFijo(ConseguroInterface conseguro) {
		return (double) this.monto;
	}
	
	public double cargoGrupoFamiliar(ConseguroInterface conseguro, Afiliado afiliado) {
		return afiliado.getFamiliaresACargo() * 3000 + afiliado.getSalario() * 0.01;
	}
	
	public double costoCoberturaViajera(ConseguroInterface conseguro, Afiliado afiliado) {
		return afiliado.getSalario() * 0.03 - conseguro.getAntiguedad() * this.anioPorAntiguedad;
	}
	
	public double seguroInternacion() {
		return this.monto * 0.05;
	}
}
