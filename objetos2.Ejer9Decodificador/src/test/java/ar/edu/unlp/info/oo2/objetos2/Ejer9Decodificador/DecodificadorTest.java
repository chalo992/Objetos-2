package ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador.Decodificador;
import ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador.Novedad;
import ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador.Pelicula;
import ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador.Puntaje;
import ar.edu.unlp.info.oo2.objetos2.Ejer9Decodificador.Similaridad;

public class DecodificadorTest {
   private List<Pelicula> todasLasPeliculas;
   private List<Pelicula> peliculasVistas;
   private Decodificador deco;
   private Pelicula thor;
   private Pelicula capitanAmerica;
   private Pelicula ironMan;
   private Pelicula dunkirk;
   private Pelicula rocky;
   private Pelicula rambo;
   
	@BeforeEach
	void setUp() throws Exception {
		this.thor = new Pelicula("Thor", 2007, 7.9);
		this.capitanAmerica = new Pelicula("Capitan America", 2016, 7.8);
		this.ironMan = new Pelicula("Iron Man", 2010, 7.9);
		this.dunkirk = new Pelicula("Dunkirk", 2017, 7.9);
		this.rocky = new Pelicula("Rocky", 1976, 8.1);
		this.rambo = new Pelicula ("Rambo", 1979, 7.8);
		
		this.thor.agregarPeliculaSimilar(capitanAmerica);
		this.thor.agregarPeliculaSimilar(ironMan);
		this.capitanAmerica.agregarPeliculaSimilar(ironMan);
		this.rocky.agregarPeliculaSimilar(rambo);
		
		this.todasLasPeliculas = new ArrayList<>();
		this.peliculasVistas = new ArrayList<>();
		this.todasLasPeliculas.add(capitanAmerica);
		this.todasLasPeliculas.add(thor);
		this.todasLasPeliculas.add(ironMan);
		this.todasLasPeliculas.add(dunkirk);
		this.todasLasPeliculas.add(rocky);
		this.todasLasPeliculas.add(rambo);
		
		this.peliculasVistas.add(thor);
		this.peliculasVistas.add(rocky);
		
		this.deco = new Decodificador(this.todasLasPeliculas, this.peliculasVistas);
	}
	
    @Test
    public void sugerirPeliculas() {
        this.deco.setConfiguracion(new Novedad());
        List<Pelicula> peliculasNovedad = new ArrayList<>();
        peliculasNovedad.add(dunkirk);
        peliculasNovedad.add(capitanAmerica);
        peliculasNovedad.add(ironMan);
        assertEquals(peliculasNovedad, deco.sugerirPeliculas());
        System.out.println(deco.sugerirPeliculas());
        
        this.deco.setConfiguracion(new Similaridad());
        List<Pelicula> peliculasSimilares = new ArrayList<>();
        peliculasSimilares.add(capitanAmerica);
        peliculasSimilares.add(ironMan);
        peliculasSimilares.add(rambo);
        assertEquals(peliculasSimilares, deco.sugerirPeliculas());
        System.out.println(deco.sugerirPeliculas());
        
        this.deco.setConfiguracion(new Puntaje());
        List<Pelicula> peliculasPuntaje = new ArrayList<>();
        peliculasPuntaje.add(dunkirk);
        peliculasPuntaje.add(ironMan);
        peliculasPuntaje.add(capitanAmerica);
        assertEquals(peliculasPuntaje, deco.sugerirPeliculas());
        System.out.println(deco.sugerirPeliculas());
    }
}
