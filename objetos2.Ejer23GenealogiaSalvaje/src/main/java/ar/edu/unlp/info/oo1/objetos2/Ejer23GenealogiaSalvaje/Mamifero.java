package ar.edu.unlp.info.oo1.objetos2.Ejer23GenealogiaSalvaje;

import java.time.LocalDate;


public class Mamifero implements MamiferoInterface{
	private String id;
	private String especie;
	private LocalDate fecha;
	private MamiferoInterface padre;
	private MamiferoInterface madre;
   
	public Mamifero() {
		this.id = "";
		this.madre = new MamiferoNull();
		this.padre = new MamiferoNull();
	}
	
	public Mamifero(String id) {
		this.id = id;
		this.madre = new MamiferoNull();
		this.padre = new MamiferoNull();
	}
	
	public boolean esNull() {
		return false;
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
	
	public MamiferoInterface getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public MamiferoInterface getMadre () {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public MamiferoInterface getAbueloMaterno() {
		 return this.madre.getPadre();
		
	}
	
	public MamiferoInterface getAbuelaMaterna() {	
		return this.madre.getMadre();
	}
	
	public MamiferoInterface getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public MamiferoInterface getAbuelaPaterna() {
	    return this.padre.getMadre();
	}
	
	
	
	public boolean tieneComoAncestroA(MamiferoInterface unMamifero) {
		return this.padre.equals(unMamifero)
		        || this.madre.equals(unMamifero)
		        || this.padre.tieneComoAncestroA(unMamifero)
		        || this.madre.tieneComoAncestroA(unMamifero);
	}
	

}
