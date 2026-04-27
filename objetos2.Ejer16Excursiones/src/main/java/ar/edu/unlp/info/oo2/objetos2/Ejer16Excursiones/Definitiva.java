package ar.edu.unlp.info.oo2.objetos2.Ejer16Excursiones;

public class Definitiva implements ExcursionState{

	public boolean incribirUsuario(int cupoMin, int cupoMax, 
			int inscriptos, Excursion e) {
		
		if (inscriptos + 1 == cupoMax) {
			e.setEstadoExcursion(new Cerrada());
			return true;
		}
		
	    return true;
	}
	
	public String informacion(Excursion e) {
		return "Nombre: " + e.getNombre() + " Costo: " + e.getCosto() +
				" Fecha inicial: " + e.getFechaInicio() + " Fecha final: " +
				e.getFechaFin() + "Punto encuentro: " + e.getPuntoEncuentro() +
				" Emails usuarios: " + e.emailsUsuarios() +
				" Usuarios faltantes: " + (e.getCupoMax() - e.getCantInscriptos());
	}
}
