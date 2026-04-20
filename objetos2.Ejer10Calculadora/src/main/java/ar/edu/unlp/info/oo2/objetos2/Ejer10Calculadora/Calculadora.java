package ar.edu.unlp.info.oo2.objetos2.Ejer10Calculadora;

public class Calculadora {
 private double valorAcumulado;
 private EstadoCalculadora estado;
 
  public Calculadora() {
	  this.valorAcumulado = 0;
	  this.estado = new EstadoInicial();
  }
  
  public String getResultado() {
	  return this.estado.getResultado(this);
  }

  
  public void setValor(double unValor) {
	  this.estado.setValor(unValor, this);
  }
  
  public void setEstadoCalculadora(EstadoCalculadora e) {
	  this.estado = e;
  }
  
  public void borrar() {
	this.estado.borrar(this);  
  }
  
  public void setValorAcumulado(double valor) {
	this.valorAcumulado = valor;
  }
  
  public double getValorAcumulado() {
	  return this.valorAcumulado;
  }
  
  public void mas() {
	  this.estado.mas(this);
  }

  public void menos() {
	  this.estado.menos(this);
  }
  
  public void por() {
	  this.estado.por(this);
  }
  
  public void dividido() {
	  this.estado.dividido(this);
  }

}
