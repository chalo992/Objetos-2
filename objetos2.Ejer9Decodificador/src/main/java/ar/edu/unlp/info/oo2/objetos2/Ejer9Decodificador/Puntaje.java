package ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Configuracion{

	public List<Pelicula> sugerirPeliculas(List<Pelicula> peliculasNoVistas, 
			List<Pelicula> peliculasVistas){
		return peliculasNoVistas.stream()
			    .sorted((ex1, ex2) -> {
			        int comparacionPuntaje = Double.compare(ex2.getPuntaje(), ex1.getPuntaje());
			        if (comparacionPuntaje != 0) {
			            return comparacionPuntaje;
			        }
			        return Integer.compare(ex2.getAnioEstreno(), ex1.getAnioEstreno());
			    })
			    .limit(3)  
			    .collect(Collectors.toList());	
		}
	}

