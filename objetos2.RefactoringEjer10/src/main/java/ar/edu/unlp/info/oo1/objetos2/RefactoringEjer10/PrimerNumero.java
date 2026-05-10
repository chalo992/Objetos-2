package ar.edu.unlp.info.oo1.objetos2.RefactoringEjer10;

import java.util.SortedSet;

public class PrimerNumero implements StrategyNumeroLibre{

	public String obtenerNumero(SortedSet<String> lineas) {
		String linea = lineas.first();
		lineas.remove(linea);
		return linea;
	}
}
