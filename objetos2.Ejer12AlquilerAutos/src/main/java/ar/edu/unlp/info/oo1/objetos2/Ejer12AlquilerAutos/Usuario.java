package ar.edu.unlp.info.oo1.objetos2.Ejer12AlquilerAutos;

import java.util.List;

public class Usuario {
 private String nombre;
 private List<AutoEnAlquiler> autosEnAlquiler;


 public Usuario(String nombre) {
	 this.nombre = nombre;
 }
 
  
public void addAutoEnAlquiler(AutoEnAlquiler auto) {
	this.autosEnAlquiler.add(auto);
}
 
}
