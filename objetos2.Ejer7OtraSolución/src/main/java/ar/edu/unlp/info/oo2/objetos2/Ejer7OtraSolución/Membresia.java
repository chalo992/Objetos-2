package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

public abstract class Membresia {
	protected ProductoFinanciero pf;
	protected double tasa;
	protected int plazo;
	protected int parking;
	
	public Membresia(double tasa, int plazo, int parking) {
		this.tasa = tasa;
		this.plazo = plazo;
		this.parking = parking;
	}
	
	public double retornarInversion(double montoInicial) {
		return this.pf.retornarInversion(montoInicial);
	}
	
	  public boolean altaCompraDolares(ProductoCreador pc) {
		  this.pf = pc.crearCompraDolares();
		  return true;
	  }
	  
	  public boolean altaPlazoFijo(ProductoCreador pc) {
		  this.pf = pc.crearPlazoFijo(this.plazo, this.tasa);
		  return true;
	  }
	  
	  public boolean altaBonoAltoRiesgo(ProductoCreador pc) {
		  this.pf = pc.crearBonoAltoRiesgo(this.parking);
		  return true;
	  }
	  
	  public boolean altaBonoBajoRiesgo(ProductoCreador pc) {
		  this.pf = pc.crearCompraBonoBajoRiesgo(this.parking);
		  return true;
	  }
	  
	  public boolean altaProducto3(CreadorConcretoProducto3 pc3) {
		  this.pf = pc3.armarProducto(this.plazo, this.tasa, this.parking);
		  return true;
	  }
	  
	  public boolean altaProducto4(CreadorConcretoProducto3 pc4) {
		  this.pf = pc4.armarProducto(this.plazo, this.tasa, this.parking);
		  return true;
	  }
	  
	  public abstract boolean altaProducto1(CreadorConcretoProducto1 pc1);
	  public abstract boolean altaProducto2(CreadorConcretoProducto2 pc2);
	  public abstract boolean altaCompraPesos(ProductoCreador pc);
}
