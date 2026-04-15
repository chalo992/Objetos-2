package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;


public abstract class Membresia {
	
	  public boolean permiteCompraDolares() {
		  return true;
	  }
	  
	  public boolean permiteCompraPesos() {
		  return true;
	  }
	  
	  public boolean permitePlazoFijo() {
		  return true;
	  }
	  
	  public boolean permiteCompraBonoBajoRiesgo() {
		  return true;
	  }
	  
	  public abstract boolean permiteCompraBonoAltoRiesgo();
}
