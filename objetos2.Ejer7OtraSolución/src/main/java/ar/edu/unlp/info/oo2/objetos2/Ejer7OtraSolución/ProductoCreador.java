package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

import java.time.LocalDate;

public abstract class ProductoCreador {
	
  public CompraDolares crearCompraDolares() {
	  return new CompraDolares(LocalDate.now());
  }
  
  public CompraPesos crearCompraPesos() {
	  return new CompraPesos(LocalDate.now());
  }
  
  public CompraBonoAltoRiesgo crearBonoAltoRiesgo(int parking) {
	  return new CompraBonoAltoRiesgo(LocalDate.now(), parking);
  }
  
  public CompraBonoBajoRiesgo crearCompraBonoBajoRiesgo(int parking) {
	  return new CompraBonoBajoRiesgo(LocalDate.now(), parking);
  }
  
  public PlazoFijo crearPlazoFijo(int cantDias, double interes) {
	  return new PlazoFijo(LocalDate.now(), cantDias, interes);
  }
	
	
  public abstract ProductoCombinado armarProducto(int plazoFijo, double interes
			,int parking);
 
}