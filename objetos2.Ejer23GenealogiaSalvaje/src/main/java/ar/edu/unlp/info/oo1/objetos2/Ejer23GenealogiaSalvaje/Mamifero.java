package ar.edu.unlp.info.oo1.objetos2.Ejer23GenealogiaSalvaje;

import java.time.LocalDate;


public class Mamifero {
	private String id;
	private String especie;
	private LocalDate fecha;
	private Mamifero padre;
	private Mamifero madre;
   
	public Mamifero() {
		this.id = null;
		this.madre = null;
		this.padre = null;
	}
	
	public Mamifero(String id) {
		this.id = id;
		this.madre = null;
		this.padre = null;
	}
	
	public String getIdentificador() {
		return this.id;
	}
	
	public void setIdentificador(String id) {
		this.id = id;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return this.fecha;
	}
	
	public void setFechaDeNacimiento(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre () {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null) {
		 return this.madre.getPadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null) {
		return this.madre.getMadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null) {
		return this.padre.getPadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null) {
		return this.padre.getMadre();
		}else {
			return null;
		}
		}
	
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    return tieneComoAncestroA2(this, unMamifero);
	}
	

	private boolean tieneComoAncestroA2(Mamifero actual, Mamifero unMamifero) {
	   
	    if (actual.getPadre() != null) {
	        if (actual.getPadre().equals(unMamifero) || tieneComoAncestroA2(actual.getPadre(), unMamifero)) {
	            return true;
	        }
	    }

	    if (actual.getMadre() != null) {
	        if (actual.getMadre().equals(unMamifero) || tieneComoAncestroA2(actual.getMadre(), unMamifero)) {
	            return true;
	        }
	    }

	  
	    return false;
	}
}
