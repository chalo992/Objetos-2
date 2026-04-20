package ar.edu.unlp.info.oo2.objetos2.Ejer10Calculadora;

public abstract class EstadoCalculadora {
   
	public abstract void setValor(double valor, Calculadora c);
	
	public String getResultado(Calculadora c) {
		c.setEstadoCalculadora(new EstadoError());
		return "";
	}
	
	public void borrar(Calculadora c) {
		c.setValorAcumulado(0);
		c.setEstadoCalculadora(new EstadoInicial());
	}
	
	public void mas(Calculadora c) {
		c.setEstadoCalculadora(new EstadoError());
	}
	
	public void menos(Calculadora c) {
		c.setEstadoCalculadora(new EstadoError());
	}
	
	public void por(Calculadora c) {
		c.setEstadoCalculadora(new EstadoError());
	}
	
	public void dividido(Calculadora c) {
		c.setEstadoCalculadora(new EstadoError());
	}
}
