package ar.edu.unlp.info.oo2.objetos2.Ejer16Excursiones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.objetos2.Ejer16Excursiones.Excursion;
import ar.edu.unlp.info.oo2.objetos2.Ejer16Excursiones.Usuario;

public class ExcursionTest {
private Excursion e;
private Usuario user1;
private Usuario user2;
private Usuario user3;
	
	@BeforeEach
	void setUp() throws Exception {
		this.e = new Excursion("Dos días en kayak bajando el Paraná",
				LocalDate.of(2026, 5, 24), LocalDate.of(2026, 5, 31), 
				"A la vuelta", 350, 1, 2);
		this.user1 = new Usuario("Pepe", "Pepito", "pepe@gmail.com");
		this.user2 = new Usuario("Otro", "AlgunOtro", "otro@gmail.com");
		this.user3 = new Usuario("Blass", "Laika", "blass@gmail.com");
	}
	
    @Test
    public void testInscribirUsuario() {
       System.out.println("Provisoria");
       System.out.println(this.e.obtenerInformacion());
       this.e.inscribir(user1);
       System.out.println();
       System.out.println("Definitiva");
       System.out.println(this.e.obtenerInformacion());
       this.e.inscribir(user2);
       this.e.inscribir(user3);
       System.out.println();
       System.out.println("Cerrada");
       System.out.println(this.e.obtenerInformacion());
    }
}
