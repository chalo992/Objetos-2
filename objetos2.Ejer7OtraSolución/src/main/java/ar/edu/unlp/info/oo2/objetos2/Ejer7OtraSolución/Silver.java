package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

public class Silver extends Membresia{
	
	public Silver(double tasa, int plazo, int parking) {
		super(tasa, plazo, parking);
	}
	
	 public boolean altaProducto1(CreadorConcretoProducto1 pc1) {
		 this.pf = pc1.armarProducto(this.plazo, this.tasa, this.parking);
	     return true;
	 }
	 public boolean altaProducto2(CreadorConcretoProducto2 pc2) {
		 this.pf = pc2.armarProducto(this.plazo, this.tasa, this.parking);
	     return true;
	 }
	
	 public boolean altaCompraPesos(ProductoCreador pc) {
		 this.pf = pc.crearCompraPesos();
		 return true;
	 }
	

}
