package ar.edu.unlp.info.oo1.objetos2.Ejer25PlanesMedicos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Afiliado {
private String nombre;
private int familiaresACargo;
private double salario;
private LocalDate fechaNacimiento;
private PlanMedico plan;
private List<PlanMedico> previos;
private ConseguroInterface conseguro;

public Afiliado(String nombre, int familiaresACargo, double salario, 
		LocalDate fechaNacimiento, PlanMedico plan, ConseguroInterface conseguro) {
	this.nombre = nombre;
	this.familiaresACargo = familiaresACargo;
	this.salario = salario;
	this.fechaNacimiento = fechaNacimiento;
	this.plan = plan;
	this.previos = new ArrayList<>();
	this.conseguro = conseguro;
}

public void setPlanMedico(PlanMedico plan) {
	this.previos.add(this.plan);
	this.plan = plan;
}

public void setConseguro(ConseguroInterface conseguro) {
	this.conseguro = conseguro;
}

public int getFamiliaresACargo() {
	return this.familiaresACargo;
}

public double getSalario() {
	return this.salario;
}

public double calcularMonto() {
	return this.plan.limitePrestaciones(this.conseguro, this);
}

}
