package ar.edu.unlp.info.oo1.objetos2.Ejer25PlanesMedicos;

import java.time.LocalDate;

public abstract class PlanMedico {
private LocalDate fechaContratacion;

public PlanMedico(LocalDate fechaContratacion) {
	this.fechaContratacion = fechaContratacion;
}

public LocalDate getFechaContratacion() {
	return this.fechaContratacion;
}

public double limitePrestaciones(ConseguroInterface conseguro, Afiliado afiliado) {
	return this.montoFijo(conseguro) + this.cargoGrupoFamiliar(conseguro, afiliado)
	+ this.costoCoberturaViajera(conseguro, afiliado) + this.seguroInternacion();
}




public abstract double montoFijo(ConseguroInterface conseguro);
public abstract double cargoGrupoFamiliar(ConseguroInterface conseguro, Afiliado afiliado);
public abstract double costoCoberturaViajera(ConseguroInterface conseguro, Afiliado afiliado);
public abstract double seguroInternacion();
}
