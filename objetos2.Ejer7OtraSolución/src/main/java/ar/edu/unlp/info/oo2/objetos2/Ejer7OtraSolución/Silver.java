package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

public class Silver {
	protected ProductoFinanciero productoFinanciero;
	protected double tasa;
	protected int plazo;
	protected int parking;
	
	public Silver(double tasa, int plazo, int parking) {
		this.tasa = tasa;
		this.plazo = plazo;
		this.parking = parking;
	}
	
	public double retornarInversion(double montoInicial) {
		return this.productoFinanciero.retornarInversion(montoInicial);
	}
	
	  public void altaCompraDolares(ProductoCreador productoCreador) {
		  this.productoFinanciero = productoCreador.crearCompraDolares();
	  }
	  
	  public void altaCompraPesos(ProductoCreador productoCreador) {
		  this.productoFinanciero = productoCreador.crearCompraPesos();
	  }
	  
	  public void altaPlazoFijo(ProductoCreador productoCreador) {
		  this.productoFinanciero = productoCreador.crearPlazoFijo(this.plazo, this.tasa);
	  }
	  
	  public void altaBonoAltoRiesgo(ProductoCreador productoCreador) {
		  this.productoFinanciero = productoCreador.crearBonoAltoRiesgo(this.parking);
	  }
	  
	  public void altaBonoBajoRiesgo(ProductoCreador productoCreador) {
		  this.productoFinanciero = productoCreador.crearCompraBonoBajoRiesgo(this.parking);
	  }
	  
	  public void altaProducto1(CreadorConcretoProducto1 productoCreador1) {
		  this.productoFinanciero = productoCreador1.armarProducto(this.plazo, this.tasa, this.parking);
	  }
	  
	  public void altaProducto2(CreadorConcretoProducto2 productoCreador2) {
		  this.productoFinanciero = productoCreador2.armarProducto(this.plazo, this.tasa, this.parking);
	  }
	  
}
