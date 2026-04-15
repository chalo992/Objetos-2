package ar.edu.unlp.info.oo2.objetos2.Ejer6SubteWay;

public class VegetarianoBuilder extends SandwichBuilder{

	public void agregarPan() {
		this.sandwich.agregarIngrediente("Pan con semillas");
		this.sandwich.sumarPrecio(120);
	}
	
	public void agregarAderezo() {
		//No hace nada
	}
	
	public void agregarPrincipal() {
		this.sandwich.agregarIngrediente("Provoleta grillada");
		this.sandwich.sumarPrecio(200);
	}
	
	public void agregarAdicional() {
		this.sandwich.agregarIngrediente("Berenjenas al escabeche");
		this.sandwich.sumarPrecio(100);
	}
	
}
