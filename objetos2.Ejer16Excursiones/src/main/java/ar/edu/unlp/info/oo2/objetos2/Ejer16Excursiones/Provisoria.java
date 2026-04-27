package ar.edu.unlp.info.oo2.objetos2.Ejer16Excursiones;

public class Provisoria implements ExcursionState{
	
	public boolean incribirUsuario(int cupoMin, int cupoMax, 
			int inscriptos, Excursion e) {
		
		if (inscriptos + 1 == cupoMin) {
		 e.setEstadoExcursion(new Definitiva());
	     return true;
		}
		
		return true;
		
	}
	
	public String informacion(Excursion e) {
		return "Nombre: " + e.getNombre() + " Costo: " + e.getCosto() +
				" Fecha inicial: " + e.getFechaInicio() + " Fecha final: " +
				e.getFechaFin() + "Punto encuentro: " + e.getPuntoEncuentro() +
				" Usuarios faltantes: " + (e.getCupoMin() - e.getCantInscriptos());
	}

}
