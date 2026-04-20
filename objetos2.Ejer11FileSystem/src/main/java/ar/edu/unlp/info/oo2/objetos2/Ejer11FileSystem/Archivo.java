package ar.edu.unlp.info.oo2.objetos2.Ejer11FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo implements Elemento{
 private String nombre;
 private LocalDate fechaCreacion;
 private int tamanioBytes;
 
public Archivo(String nombre, LocalDate fechaCreacion, int tamanioBytes) {
	this.nombre = nombre;
	this.fechaCreacion = fechaCreacion;
	this.tamanioBytes = tamanioBytes;
}
 
public int tamanoTotalOcupado() {
	return this.tamanioBytes;
}

public LocalDate getFechaCreacion() {
	return this.fechaCreacion;
}


public Archivo archivoMasGrande() {
	return this;
}

public Archivo archivoMasNuevo() {
	return this;
}


public Elemento buscar(String nombre) {
	if (this.nombre.equals(nombre)) {
	 return this;
	}
	return null;
}

public List<Elemento> buscarTodos(String nombre) {
	List<Elemento> list = new ArrayList<>();
	if (this.nombre.equals(nombre)) {
		  list.add(this);
		  return list;
		}
		return list;
}

public String listadoDeContenido() {
	return "/" + this.nombre + "\n";
}

}
