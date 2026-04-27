package ar.edu.unlp.info.oo2.objetos2.Ejer16Excursiones;

public interface ExcursionState {

	boolean incribirUsuario(int cupoMin, int cupoMax, int inscriptos, Excursion e);
	String informacion(Excursion e);
}
