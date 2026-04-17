package ar.edu.unlp.info.oo2.objetos2.Ejer5Sustancias;

import java.util.List;

public class FactoryElementoQuimico {
  
	public Union getUnion(List<ElementoQuimico> elementos) {
		return new Union(elementos);
	}

	public Atomo getHidrogeno() {
		return new Atomo("Hidrógeno", "H", 1, 1, false);
	}
	
	public Atomo getOxigeno() {
		return new Atomo("Oxígeno", "O", 16, -2, false);
	}
	
	public Atomo getCloro() {
		return new Atomo("Cloro", "Cl", 35, -1, false);
	}
	
	public Atomo getSodio() {
		return new Atomo("Sodio", "Na", 23, 1, true);
	}
	
	public Atomo getCalcio() {
		return new Atomo("Calcio", "Ca", 40, 2, true);
	}
}
