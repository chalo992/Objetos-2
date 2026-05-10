package ar.edu.unlp.info.oo1.objetos2.RefactoringEjer10;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private StrategyNumeroLibre strategyNumero = new UltimoNumero();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() { //Replace Conditional Logic with Strategy
		return this.strategyNumero.obtenerNumero(this.lineas);
	}

	public void cambiarTipoGenerador(StrategyNumeroLibre strategyNumeroLibre) {
		this.strategyNumero = strategyNumeroLibre;
	}
	
	public boolean agregarNumeroTelefono(String str) { 
		if (!this.lineas.contains(str)) {
			this.lineas.add(str);
			return true;
		}
		else {
			return false;
		}
	}
}
