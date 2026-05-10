package ar.edu.unlp.info.oo1.objetos2.RefactoringEjer10;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class RandomNumero implements StrategyNumeroLibre{

	public String obtenerNumero(SortedSet<String> lineas) {
		String linea = new ArrayList<String>(lineas)
				.get(new Random().nextInt(lineas.size()));
		lineas.remove(linea);
		return linea;
	}
}
