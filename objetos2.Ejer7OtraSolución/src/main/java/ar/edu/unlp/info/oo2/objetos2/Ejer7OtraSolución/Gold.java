package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

public class Gold extends Silver{
	
	public Gold(double tasa, int plazo, int parking) {
		super(tasa, plazo, parking);
	}
	
	public void altaProducto3(CreadorConcretoProducto3 productoCreador3) {
		 this.productoFinanciero = productoCreador3.armarProducto(this.plazo, this.tasa, this.parking);
	 }
	 public void altaProducto4(CreadorConcretoProducto4 productoCreador4) {
		 this.productoFinanciero = productoCreador4.armarProducto(this.plazo, this.tasa, this.parking);
	 }

	
}