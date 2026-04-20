package ar.edu.unlp.info.oo2.objetos2.Ejer10Calculadora;

public class EstadoDividiendo extends EstadoCalculadora{

	public void setValor(double valor, Calculadora c) {
		if (valor == 0) {
			c.setEstadoCalculadora(new EstadoError());
			return;
		}
		c.setValorAcumulado(c.getValorAcumulado() / valor);
		c.setEstadoCalculadora(new EstadoInicial());
	}
	
}
