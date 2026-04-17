package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

public class Gold extends Membresia{
	
	public Gold(double tasa, int plazo, int parking) {
		super(tasa, plazo, parking);
	}
	
	public boolean altaProducto1(CreadorConcretoProducto1 pc1) {
		 return false;
	 }
	 public boolean altaProducto2(CreadorConcretoProducto2 pc2) {
		 return false;
	 }

	 public boolean altaCompraPesos(ProductoCreador pc) {
		 return false;
	 }
}