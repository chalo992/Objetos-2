package ar.edu.unlp.info.oo2.objetos2.Ejer1Empleado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonalTest {
 private Temporario temporario;
 private Pasante pasante;
 private Planta planta;
	
	@BeforeEach
	void setUp() throws Exception {
		this.temporario = new Temporario(12, true, 3);
		this.pasante = new Pasante(5);
		this.planta = new Planta(20, true, 2);
	}
	
	 @Test
		void testSueldo() {
		 assertEquals(this.temporario.sueldo(), 30982);
		 assertEquals(this.pasante.sueldo(), 26900);
		 assertEquals(this.planta.sueldo(), 90050);
		 
	 }
}
