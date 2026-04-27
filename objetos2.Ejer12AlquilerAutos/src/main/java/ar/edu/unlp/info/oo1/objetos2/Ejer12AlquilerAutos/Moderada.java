package ar.edu.unlp.info.oo1.objetos2.Ejer12AlquilerAutos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaCancelacion{

	public double reembolso(double monto, LocalDate fecha) {
		long dias = ChronoUnit.DAYS.between(LocalDate.now(), fecha);
	    System.out.println(dias);
		if (dias >= 7) {
			return monto;
		}
		if (dias >= 2) {
			return monto/2;
		}
		return 0;
	}
}
