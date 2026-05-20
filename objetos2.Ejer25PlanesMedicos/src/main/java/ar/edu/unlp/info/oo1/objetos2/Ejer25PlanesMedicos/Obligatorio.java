package ar.edu.unlp.info.oo1.objetos2.Ejer25PlanesMedicos;

import java.time.LocalDate;

public class Obligatorio extends PlanMedico{
public static final int monto = 15000;
public static final int montoPorFamiliar = 3500;


	public Obligatorio(LocalDate fechaContratacion) {
	super(fechaContratacion);
}

	public  double montoFijo(ConseguroInterface conseguro) {
		return (double) this.monto;
	}
	
	public double cargoGrupoFamiliar(ConseguroInterface conseguro, Afiliado afiliado) {
		return afiliado.getFamiliaresACargo() * this.montoPorFamiliar - conseguro.getDescuento();
	}
	
	public double costoCoberturaViajera(ConseguroInterface conseguro, Afiliado afiliado) {
		return afiliado.getSalario() * 0.01 - conseguro.getMontoCobertura();
	}
	
	public double seguroInternacion() {
		return 0;
	}
	
}
