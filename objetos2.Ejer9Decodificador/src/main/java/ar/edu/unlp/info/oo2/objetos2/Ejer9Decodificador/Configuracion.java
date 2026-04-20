package ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador;

import java.util.List;

public interface Configuracion {

	List<Pelicula> sugerirPeliculas(List<Pelicula> peliculasNovistas, 
			List<Pelicula> peliculasVistas);
}
