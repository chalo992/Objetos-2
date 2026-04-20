package ar.edu.unlp.info.oo2.objetos2.Ejer10Calculadora;

public class EstadoInicial extends EstadoCalculadora{

	public void setValor(double valor, Calculadora c) {
		c.setValorAcumulado(valor);
	}
	
	@Override
	public String getResultado(Calculadora c) {
		return "Valor acumulado: " + c.getValorAcumulado();
	}
	
	@Override
	public void borrar(Calculadora c) {
		c.setValorAcumulado(0);
		c.setEstadoCalculadora(new EstadoInicial());
	}
	
	@Override
	public void mas(Calculadora c) {
		c.setEstadoCalculadora(new EstadoSumando());
	}
	
	@Override
	public void menos(Calculadora c) {
		c.setEstadoCalculadora(new EstadoRestando());
	}
	
	@Override
	public void por(Calculadora c) {
		c.setEstadoCalculadora(new EstadoMultiplicando());
	}
	
	@Override
	public void dividido(Calculadora c) {
		c.setEstadoCalculadora(new EstadoDividiendo());
	}

}
