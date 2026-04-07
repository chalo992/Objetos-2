package ar.edu.unlp.info.oo2.objetos2.Ejer1Empleado;

public abstract class Personal {

	public double sueldo() {
		return this.basico() + this.adicional() - this.descuento();
	}
	
	public double descuento() {
		return ((this.basico()/100) * 13) + ((this.adicional()/100) * 5);
	} 
	
	protected abstract int basico();
	protected abstract int adicional();
}
