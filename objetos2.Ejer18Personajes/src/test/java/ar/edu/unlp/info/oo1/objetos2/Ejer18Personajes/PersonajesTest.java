package ar.edu.unlp.info.oo1.objetos2.Ejer18Personajes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajesTest {
	Personaje thoor, mago;
	FactoryPersonajes factory;
	
	@BeforeEach
	void setUp() throws Exception {
		this.factory = new FactoryPersonajes();
		thoor = this.factory.getThoor();
		mago = this.factory.getMago();
	}
	
    @Test
    public void testAtacar() {
    	this.thoor.atacar(this.mago);
    	this.mago.atacar(this.thoor);
        assertEquals(this.mago.getVida(), 92);
        assertEquals(this.thoor.getVida(), 99);
    }
    
    @Test
    public void testPersonajeFueraDeCombate() {
    	for (int i = 1; i<15; i++) {
    		this.thoor.atacar(this.mago);
    	}
    }
}
