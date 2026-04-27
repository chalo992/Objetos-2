package ar.edu.unlp.info.oo1.objetos2.Ejer12AlquilerAutos;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion{

	public double reembolso(double monto, LocalDate fecha) {
		if (LocalDate.now().isBefore(fecha)) {
			return monto;
		}
		return 0;
	}
}
