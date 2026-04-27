package ar.edu.unlp.info.oo2.objetos2.Ejer16Excursiones;

public class Cerrada implements ExcursionState{

	public boolean incribirUsuario(int cupoMin, int cupoMax, 
			int inscriptos, Excursion e) {
		
	    return false;	
	}
	
	public String informacion(Excursion e) {
		return "Nombre: " + e.getNombre() + " Costo: " + e.getCosto() +
				" Fecha inicial: " + e.getFechaInicio() + " Fecha final: " +
				e.getFechaFin() + " Punto encuentro: " + e.getPuntoEncuentro();			
	}
}
