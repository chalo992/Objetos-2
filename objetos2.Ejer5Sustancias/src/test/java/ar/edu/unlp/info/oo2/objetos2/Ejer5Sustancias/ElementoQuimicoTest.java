package ar.edu.unlp.info.oo2.objetos2.Ejer5Sustancias;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementoQuimicoTest {
 private Atomo hidrogeno, oxigeno, cloro, sodio, calcio;
 private Union NaCa, NaCl, CaO, HO;
 private FactoryElementoQuimico factory;
 private List<ElementoQuimico> elementosNaCa, elementosNaCL,
 elementosCaO, elementosHO;
	
	@BeforeEach
	void setUp() throws Exception {
		this.factory = new FactoryElementoQuimico();
		this.hidrogeno = this.factory.getHidrogeno();
		this.oxigeno = this.factory.getOxigeno();
		this.cloro = this.factory.getCloro();
		this.sodio = this.factory.getSodio();
		this.calcio = this.factory.getCalcio();
		
		this.elementosNaCa = new ArrayList<>();
	    this.elementosNaCL = new ArrayList<>();
	    this.elementosCaO = new ArrayList<>();
	    this.elementosHO = new ArrayList<>();
		
		this.elementosNaCa.add(sodio);
		this.elementosNaCa.add(calcio);
		
		this.elementosNaCL.add(sodio);
		this.elementosNaCL.add(cloro);
		
		this.elementosCaO.add(calcio);
		this.elementosCaO.add(oxigeno);
		
		this.elementosHO.add(hidrogeno);
		this.elementosHO.add(oxigeno);
		

		this.NaCa = this.factory.getUnion(elementosNaCa);
		this.NaCl = this.factory.getUnion(elementosNaCL);
		this.CaO = this.factory.getUnion(elementosCaO);
		this.HO = this.factory.getUnion(elementosHO);
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
