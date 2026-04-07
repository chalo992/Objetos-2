package ar.edu.unlp.info.oo2.objetos2.Ejer5Sustancias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementoQuimicoTest {
 private Atomo hidrogeno, oxigeno, cloro, sodio, calcio;
 private Union NaCa, NaCl, CaO, HO;
	
	@BeforeEach
	void setUp() throws Exception {
		this.hidrogeno = new Atomo("Hidrogeno", "H", 1, 1, false);
		this.oxigeno = new Atomo("Oxigeno", "O", 16, -2, false);
		this.cloro = new Atomo("Cloro", "Cl", 35, -1, false);
		this.sodio = new Atomo("Sodio", "Na", 23, 1, true);
		this.calcio = new Atomo("Calcio", "Ca", 40, 2, true);
		
		this.NaCa = new Union();
		this.NaCl = new Union();
		this.CaO = new Union();
		this.HO = new Union();
		
		this.NaCa.agregarElemento(sodio);
		this.NaCa.agregarElemento(calcio);
		
		this.NaCl.agregarElemento(sodio);
		this.NaCl.agregarElemento(cloro);
		
		this.CaO.agregarElemento(calcio);
		this.CaO.agregarElemento(oxigeno);
		
		this.HO.agregarElemento(hidrogeno);
		this.HO.agregarElemento(oxigeno);
	}
	
    @Test
    public void testFormula() {
    	assertEquals(this.cloro.formula(), "Cl");
        assertEquals(this.NaCa.formula(), "NaCa");
        assertEquals(this.HO.formula(), "HO");
        
    }
    
    @Test
    public void testPesoMolecular() {
    	assertEquals(this.cloro.pesoMolecular(), 35);
        assertEquals(this.CaO.pesoMolecular(), 56);
        assertEquals(this.NaCl.pesoMolecular(), 58);
        
    }
    
    @Test
    public void testCarga() {
    	assertEquals(this.sodio.carga(), 1);
        assertEquals(this.HO.carga(), -1);
        assertEquals(this.NaCl.carga(), 0);
        
    }
    
    @Test
    public void testEsValida() {
    	assertTrue(this.calcio.esValida());
        assertFalse(this.NaCa.esValida());
        assertTrue(this.NaCl.esValida());
        
    }
}
