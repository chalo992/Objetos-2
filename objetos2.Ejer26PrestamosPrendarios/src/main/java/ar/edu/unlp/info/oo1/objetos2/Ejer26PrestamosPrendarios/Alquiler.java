package ar.edu.unlp.info.oo1.objetos2.Ejer26PrestamosPrendarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements BienInterface{
	private LocalDate inicioContrato;
	private LocalDate finContrato;
	private double costoMensual;
	public static final double liquidez = 0.9;
	
	public Alquiler(LocalDate inicioContrato, LocalDate finContrato, 
			double costoMensual) {
		this.inicioContrato = inicioContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}

	private int mesesFaltantesContrato() {
		return (int) ChronoUnit.MONTHS.between(LocalDate.now(), finContrato);
	}
	
	public double valor() {
		return this.mesesFaltantesContrato() * this.costoMensual;
	}

	public double valorPrendario() {
		return this.valor() * this.liquidez;
	}
}
