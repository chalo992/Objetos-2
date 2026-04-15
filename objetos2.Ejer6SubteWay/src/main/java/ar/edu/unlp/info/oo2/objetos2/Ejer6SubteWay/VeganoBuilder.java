package ar.edu.unlp.info.oo2.objetos2.Ejer6SubteWay;

public class VeganoBuilder extends SandwichBuilder{

	public void agregarPan() {
		this.sandwich.agregarIngrediente("Pan integral");
		this.sandwich.sumarPrecio(100);
	}
	
	public void agregarAderezo() {
		this.sandwich.agregarIngrediente("Salsa criolla");
		this.sandwich.sumarPrecio(20);
	}
	
	public void agregarPrincipal() {
		this.sandwich.agregarIngrediente("Milanesa de girgolas");
		this.sandwich.sumarPrecio(500);
	}
	
	public void agregarAdicional() {
		//No hace nada
	}
}
