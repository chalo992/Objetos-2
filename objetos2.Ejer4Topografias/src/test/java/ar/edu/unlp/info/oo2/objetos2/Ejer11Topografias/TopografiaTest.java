package ar.edu.unlp.info.oo2.objetos2.Ejer11Topografias;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopografiaTest {
	private Agua agua1;
	private Agua agua2;
	
	private Tierra tierra1;
	private Tierra tierra2;
	
	private Pantano pantano1;
    private Pantano pantano2;
    
	private Mixta mixta1;
	private Mixta mixta2;
	private Mixta mixta3;
		
		@BeforeEach
		void setUp() throws Exception {
			this.agua1 = new Agua();
			this.agua2 = new Agua();
			this.tierra1 = new Tierra();
			this.tierra2 = new Tierra();
			this.pantano1 = new Pantano();
			this.pantano2 = new Pantano();
			this.mixta1 = new Mixta();
			this.mixta2 = new Mixta();
			this.mixta3 = new Mixta();
			
	    	//mixta1
	    	this.mixta1.agregarTopografia(agua1);
	    	this.mixta1.agregarTopografia(tierra1);
	    	this.mixta1.agregarTopografia(tierra2);
	    	this.mixta1.agregarTopografia(agua2);
	    	
	    	//mixta2
	    	this.mixta2.agregarTopografia(agua1);
	    	this.mixta2.agregarTopografia(tierra1);
	    	this.mixta2.agregarTopografia(tierra2);
	    	this.mixta2.agregarTopografia(mixta1);
	    	
	    	//mixta3
	    	this.mixta3.agregarTopografia(agua1);
	    	this.mixta3.agregarTopografia(tierra1);
	    	this.mixta3.agregarTopografia(tierra2);
	    	this.mixta3.agregarTopografia(agua2);
		}
		
		@Test
	    public void testCalcularProporcion() {
			assertEquals(this.agua1.calcularProporcionAgua(), 1);
			assertEquals(this.tierra1.calcularProporcionAgua(), 0);
			assertEquals(this.tierra2.calcularProporcionTierra(), 1);
			assertEquals(this.mixta1.calcularProporcionAgua(), 0.5);
			assertEquals(this.mixta2.calcularProporcionAgua(), 0.375);
		}
		
	    @Test
	    public void testIgualdadTopografia() {  	
	    	assertTrue(this.agua1.comparar(agua2));
	    	assertTrue(this.tierra1.comparar(tierra2));
	    	assertFalse(this.agua1.comparar(tierra1));
	    	assertFalse(this.pantano1.comparar(tierra2));
	    	assertTrue(this.pantano2.comparar(pantano1));
	    	assertFalse(this.tierra1.comparar(mixta1));
	    	assertTrue(this.mixta1.comparar(mixta3));
	    	assertFalse(this.mixta3.comparar(mixta2));
	    }
}











