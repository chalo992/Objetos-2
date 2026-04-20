package ar.edu.unlp.info.oo2.objetos2.Ejer11FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio implements Elemento{
  private String nombre;
  private LocalDate fechaCreacion;
  private List<Elemento> directorios = new ArrayList<>();
  
public Directorio(String nombre, LocalDate fechaCreacion, List<Elemento> directorios) {
	this.nombre = nombre;
	this.fechaCreacion = fechaCreacion;
	this.directorios = directorios;
}
  
public int tamanoTotalOcupado() {
	return 32 + this.directorios.stream()
	            .mapToInt(d -> d.tamanoTotalOcupado()).sum();
}

public Archivo archivoMasGrande() {
	return this.directorios.stream()
	        .map(t -> t.archivoMasGrande())
	        .filter(a -> a != null)
	        .max((a1, a2) -> Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado()))
	        .orElse(null);
}

public Archivo archivoMasNuevo() {
	   return this.directorios.stream()
		        .map(c -> c.archivoMasNuevo()) 
		        .filter(a -> a != null)
		        .max((a1, a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
		        .orElse(null);
}

public Elemento buscar(String nombre) {
	if (this.nombre.equals(nombre)) {
		return this;
	}
	return this.directorios.stream().map(d -> d.buscar(nombre))
	        .filter(e -> e != null).findFirst().orElse(null);
}

public List<Elemento> buscarTodos(String nombre) {
	List<Elemento> list = this.directorios.stream()
            .flatMap(d -> d.buscarTodos(nombre).stream())
            .collect(Collectors.toList());

	if (this.nombre.equals(nombre)) {
		list.add(this);
		return list;
	}
	return list;
}

public String listadoDeContenido() {
	return this.directorios.stream()
    .map(e -> "/" + this.nombre + e.listadoDeContenido())
    .collect(Collectors.joining());
	
}

}
