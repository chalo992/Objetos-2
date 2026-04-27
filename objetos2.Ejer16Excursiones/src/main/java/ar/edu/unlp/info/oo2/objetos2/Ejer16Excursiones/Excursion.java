package ar.edu.unlp.info.oo2.objetos2.Ejer16Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
  private String nombre;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private String puntoEncuentro;
  private double costo;
  private int cupoMin;
  private int cupoMax;
  private ExcursionState estadoExcursion;
  private List<Usuario> inscriptos;
  private List<Usuario> listaEspera;
  
public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, 
		String puntoEncuentro, double costo, int cupoMin, int cupoMax) {
	this.nombre = nombre;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.puntoEncuentro = puntoEncuentro;
	this.costo = costo;
	this.cupoMin = cupoMin;
	this.cupoMax = cupoMax;
	this.estadoExcursion = new Provisoria();
	this.inscriptos = new ArrayList<>();
	this.listaEspera = new ArrayList<>();
}

public void inscribir(Usuario unUsuario) {
	if (this.estadoExcursion.incribirUsuario(cupoMin, cupoMax
			, this.inscriptos.size(), this)) {
		this.inscriptos.add(unUsuario);
	} else {
		this.listaEspera.add(unUsuario);
	}
}

public void setEstadoExcursion(ExcursionState e) {
	this.estadoExcursion = e;
}

public String obtenerInformacion() {
	return this.estadoExcursion.informacion(this);
}

public String emailsUsuarios() {
    return this.inscriptos.stream()
            .map(u -> u.getEmail())
            .collect(Collectors.joining(", "));
}

public String getNombre() {
	return this.nombre;
}

public LocalDate getFechaInicio() {
	return this.fechaInicio;
}

public LocalDate getFechaFin() {
	return this.fechaFin;
}

public String getPuntoEncuentro() {
	return this.puntoEncuentro;
}

public double getCosto() {
	return costo;
}

public int getCupoMin() {
	return cupoMin;
}

public int getCupoMax() {
	return this.cupoMax;
}

public int getCantInscriptos() {
	return this.inscriptos.size();
}

   
}
