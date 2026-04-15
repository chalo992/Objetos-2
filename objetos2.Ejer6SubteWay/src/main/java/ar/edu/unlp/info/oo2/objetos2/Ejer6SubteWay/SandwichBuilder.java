package ar.edu.unlp.info.oo2.objetos2.Ejer6SubteWay;

public abstract class SandwichBuilder {
  protected Sandwich sandwich;
  
	public void crearSandwich() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();

}
