package ar.edu.unlp.info.oo2.objetos2.Ejer6SubteWay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubteWayTest {
	private SubteWayDirector director;
	private ClasicoBuilder clasico;
	private VeganoBuilder vegano;
	private VegetarianoBuilder vegetariano;
	private SinTaccBuilder sinTacc;
	private Sandwich s;
	
	@BeforeEach
	void setUp() throws Exception {
		this.director = new SubteWayDirector();
		this.clasico = new ClasicoBuilder();
		this.vegano = new VeganoBuilder();
		this.vegetariano = new VegetarianoBuilder();
		this.sinTacc = new SinTaccBuilder();
		this.s = new Sandwich();
	}
	
    @Test
    public void testCalcularPrecioSandwich() {
    	s = this.director.constuirSandwich(clasico);
    	System.out.println(s.getIngredientes());
        assertEquals(s.getPrecio(), 500);
        
        s = this.director.constuirSandwich(vegano);
    	System.out.println(s.getIngredientes());
        assertEquals(s.getPrecio(), 620);
        
        s = this.director.constuirSandwich(vegetariano);
    	System.out.println(s.getIngredientes());
        assertEquals(s.getPrecio(), 420);
        
        s = this.director.constuirSandwich(sinTacc);
    	System.out.println(s.getIngredientes());
        assertEquals(s.getPrecio(), 618);
        
    }
}
