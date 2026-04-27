package ar.edu.unlp.info.oo1.objetos2.Ejer12AlquilerAutos;

import java.time.LocalDate;

public interface PoliticaCancelacion {
  double reembolso(double monto, LocalDate fecha);
}
