package ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Configuracion{
	
	public List<Pelicula> sugerirPeliculas(List<Pelicula> peliculasNoVistas, 
			List<Pelicula> peliculasVistas){
		return peliculasNoVistas.stream()
				.sorted((p1, p2) -> Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
				.limit(3).toList();
	}
	

}
