package ar.edu.unlp.info.oo1.objetos2.RefactoringEjer10;

import java.util.SortedSet;


public class UltimoNumero implements StrategyNumeroLibre{

	public String obtenerNumero(SortedSet<String> lineas) {
		String linea = lineas.last();
		lineas.remove(linea);
		return linea;
	}
}
