package ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador;

import java.util.List;

public class Decodificador {
 private List<Pelicula> grillaPeliculas;
 private List<Pelicula> peliculasVistas;
 private Configuracion configuracion;
 
public Decodificador(List<Pelicula> grillaPeliculas, List<Pelicula> peliculasVistas) {
	this.grillaPeliculas = grillaPeliculas;
	this.peliculasVistas = peliculasVistas;
}
 
 public void setConfiguracion(Configuracion c) {
	 this.configuracion = c;
 }
 
 private List<Pelicula> peliculasNoVistas(){
	 return this.grillaPeliculas.stream()
		        .filter(p -> !this.peliculasVistas.contains(p))
		        .toList();
 }
 
 public List<Pelicula> sugerirPeliculas(){
	 return this.configuracion.sugerirPeliculas(this.peliculasNoVistas(),
			 this.peliculasVistas);
 }
 
}
