package ar.edu.unlp.info.oo2.objetos2.Ejer11FileSystem;

import java.util.List;

public interface Elemento {
  
	int tamanoTotalOcupado();
	Archivo archivoMasGrande();
	Archivo archivoMasNuevo();
	Elemento buscar(String nombre);
	List<Elemento> buscarTodos(String nombre);
	String listadoDeContenido();
}
