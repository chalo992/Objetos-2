package ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador;

import java.util.ArrayList;
import java.util.List;

public class Similaridad implements Configuracion{
	private List<Pelicula> peliculasSim;
		

	public Similaridad() {
		this.peliculasSim = new ArrayList<>();
	}

	public List<Pelicula> sugerirPeliculas(List<Pelicula> peliculasNoVistas, 
			List<Pelicula> peliculasVistas){
		
	  this.peliculasSim.clear();
	  this.recorrerAgregarPeliculasSimilares(peliculasVistas);
	  List<Pelicula> peliculasFinalesSugeridas = this.sacarPeliculaRepetida();
	  return this.ordenarMasReciente(peliculasFinalesSugeridas);
	}
	
	private List<Pelicula> ordenarMasReciente(List<Pelicula> peliculas){
		return peliculas.stream()
				.sorted((p1, p2) -> Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
				.limit(3).toList();
	}
	
	private List<Pelicula> sacarPeliculaRepetida(){
		return this.peliculasSim.stream().distinct().toList();
	}
	
	private void recorrerAgregarPeliculasSimilares(List<Pelicula> peliculasVistas) {
		peliculasVistas.stream()
	      .forEach(p -> agregarPeliculasSimilares(p));
	}

	
	private void agregarPeliculasSimilares(Pelicula p){
		 this.peliculasSim.addAll(p.getPeliculasSimilares());
	}
	
}
