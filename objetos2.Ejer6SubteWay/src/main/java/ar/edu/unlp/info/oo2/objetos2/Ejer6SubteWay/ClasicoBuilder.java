package ar.edu.unlp.info.oo2.objetos2.Ejer6SubteWay;

public class ClasicoBuilder extends SandwichBuilder{

	public void agregarPan() {
		this.sandwich.agregarIngrediente("Pan brioche");
		this.sandwich.sumarPrecio(100);
	}
	
	public void agregarAderezo() {
		this.sandwich.agregarIngrediente("Mayonesa");
		this.sandwich.sumarPrecio(20);
	}
	
	public void agregarPrincipal() {
		this.sandwich.agregarIngrediente("Carne de ternera");
		this.sandwich.sumarPrecio(300);
	}
	
	public void agregarAdicional() {
		this.sandwich.agregarIngrediente("Tomate");
		this.sandwich.sumarPrecio(80);
	}
	
}
