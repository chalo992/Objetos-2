package ar.edu.unlp.info.oo2.objetos2.Ejer6SubteWay;

public class SubteWayDirector {
 
	public Sandwich constuirSandwich(SandwichBuilder s) {
		s.crearSandwich();
		s.agregarPan();
		s.agregarAderezo();
		s.agregarPrincipal();
		s.agregarAdicional();
		return s.getSandwich();
	}
}
