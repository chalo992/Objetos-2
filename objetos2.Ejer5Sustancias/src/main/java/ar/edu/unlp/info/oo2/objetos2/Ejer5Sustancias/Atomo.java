package ar.edu.unlp.info.oo2.objetos2.Ejer5Sustancias;

public class Atomo implements ElementoQuimico{
 private String nombre;
 private String simbolo;
 private int pesoAtomico;
 private int carga;
 private boolean esMetal;
 
public Atomo(String nombre, String simbolo, int pesoAtomico, 
		int carga, boolean esMetal) {
	this.nombre = nombre;
	this.simbolo = simbolo;
	this.pesoAtomico = pesoAtomico;
	this.carga = carga;
	this.esMetal = esMetal;
}
 
  public String formula() {
	  return this.simbolo;
  }
  
  public int pesoMolecular() {
	  return this.pesoAtomico;
  }
  
  public int carga() {
	  return this.carga;
  }
  
  public boolean esValida() {
	  return true;
  }
  
  public boolean esMetal() {
	  return this.esMetal;
  }
 
}
