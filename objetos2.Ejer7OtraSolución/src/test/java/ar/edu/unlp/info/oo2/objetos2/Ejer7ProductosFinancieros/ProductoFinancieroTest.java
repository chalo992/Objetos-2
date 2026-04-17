package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución.CreadorConcretoProducto1;
import ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución.CreadorConcretoProducto2;
import ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución.CreadorConcretoProducto3;
import ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución.CreadorConcretoProducto4;
import ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución.Gold;
import ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución.Silver;

public class ProductoFinancieroTest {
	private Gold gold;
	private Silver silver;
	private CreadorConcretoProducto1 pc1;
	private CreadorConcretoProducto2 pc2;
	private CreadorConcretoProducto3 pc3;
	private CreadorConcretoProducto4 pc4;
	
	@BeforeEach
	void setUp() throws Exception {
		gold = new Gold(6, 30, 24);
		silver = new Silver(5, 35, 72);
		pc1 = new CreadorConcretoProducto1();
		pc2 = new CreadorConcretoProducto2();
		pc3 = new CreadorConcretoProducto3();
		pc4 = new CreadorConcretoProducto4();
	}
	
    @Test
    public void testAltaProductoFinanciero() {
        assertTrue(this.silver.altaBonoAltoRiesgo(pc3));
        assertFalse(this.gold.altaCompraPesos(pc4));
        assertTrue(this.silver.altaProducto2(pc2));
        assertFalse(this.gold.altaProducto1(pc1));
    }
    
    @Test
    public void testRetornarInversion() {
        this.silver.altaCompraDolares(pc3);
        assertEquals(silver.retornarInversion(2800), 2);
        this.silver.altaProducto1(pc1);
        assertEquals(silver.retornarInversion(4200), 5891553);
        //3 + 5880000 + 11550
    }
}
