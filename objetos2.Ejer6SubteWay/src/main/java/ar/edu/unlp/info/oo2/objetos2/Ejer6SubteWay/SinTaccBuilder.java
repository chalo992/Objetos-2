package ar.edu.unlp.info.oo2.objetos2.Ejer6SubteWay;

public class SinTaccBuilder extends SandwichBuilder{

	public void agregarPan() {
		this.sandwich.agregarIngrediente("Pan de chipá");
		this.sandwich.sumarPrecio(150);
	}
	
	public void agregarAderezo() {
		this.sandwich.agregarIngrediente("Salsa tártara");
		this.sandwich.sumarPrecio(18);
	}
	
	public void agregarPrincipal() {
		this.sandwich.agregarIngrediente("Carne de pollo");
		this.sandwich.sumarPrecio(250);
	}
	
	public void agregarAdicional() {
		this.sandwich.agregarIngrediente("Verduras grilladas");
		this.sandwich.sumarPrecio(200);
	}
}
