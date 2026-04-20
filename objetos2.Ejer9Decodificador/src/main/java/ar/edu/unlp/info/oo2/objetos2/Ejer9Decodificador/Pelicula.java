package ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
  private String titulo;
  private int anioEstreno;
  private List<Pelicula> peliculasSimilares;
  private double puntaje;
  
public Pelicula(String titulo, int anioEstreno, 
		 double puntaje) {
	this.titulo = titulo;
	this.anioEstreno = anioEstreno;
	this.peliculasSimilares = new ArrayList<>();
	this.puntaje = puntaje;
}

@Override
public String toString() {
    return this.titulo;
}


public int getAnioEstreno() {
	return this.anioEstreno;
}

public double getPuntaje() {
	return this.puntaje;
}
 
public List<Pelicula> getPeliculasSimilares(){
	return this.peliculasSimilares;
}

public void agregarPeliculaSimilar(Pelicula p) {
	if (!this.peliculasSimilares.contains(p)) {
		this.peliculasSimilares.add(p);
		p.agregarPeliculaSimilar(this);
	}
}
  
}
