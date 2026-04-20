package ar.edu.unlp.info.oo2.objetos2.Ejer10Calculadora;

public class EstadoSumando extends EstadoCalculadora{


	public void setValor(double valor, Calculadora c) {
		c.setValorAcumulado(c.getValorAcumulado() + valor);
		c.setEstadoCalculadora(new EstadoInicial());
	}
	
}
