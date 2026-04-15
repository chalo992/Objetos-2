package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

public class Usuario {
private Membresia mebresia;
private ProductoFinanciero pf;

   public Usuario(Membresia mebresia) {
	  this.mebresia = mebresia;
   }

 public void setMembresia(Membresia m) {
	 this.mebresia = m;
 }
 
 public boolean setProductoFinanciero(ProductoFinanciero pf) {
	 if (!pf.permiteMembresia(mebresia)) {
		 return false;
	 }
	 this.pf = pf;
	 return true;
 }
 
}
