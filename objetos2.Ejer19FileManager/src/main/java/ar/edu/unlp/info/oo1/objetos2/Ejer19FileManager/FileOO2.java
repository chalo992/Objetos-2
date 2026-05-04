package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileOO2 implements FileManager {
private String nombre;
private String extension;
private int tamanio;
private LocalDate fechaCreacion;
private LocalDate fechaModificacion;
private List<String> permisos;


public FileOO2(String nombre, String extension, int tamanio, LocalDate fechaCreacion,
		LocalDate fechaModificacion, List<String> permisos) {
	this.nombre = nombre;
	this.extension = extension;
	this.tamanio = tamanio;
	this.fechaCreacion = fechaCreacion;
	this.fechaModificacion = fechaModificacion;
	this.permisos = new ArrayList<>();
	this.permisos = permisos;
}

    public String prettyPrint() {
    	return this.nombre;
    }
	
	public String getExtension() {
		return this.extension;
	}
	
	public int getTamanio() {
		return this.tamanio;
	}
	
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public LocalDate getFechaModificacion() {
		return this.fechaModificacion;
	}
	
	public List<String> getPermisos(){
		return this.permisos;
	}
	
}
