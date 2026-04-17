package ar.edu.unlp.info.oo2.objetos2.Ejer7ProductosFinancieros;

public class Usuario {
private Membresia membresia;
private ProductoFinanciero pf;

   public Usuario(Membresia mebresia) {
	  this.membresia = mebresia;
   }

 public void setMembresia(Membresia m) {
	 this.membresia = m;
 }
 
 public boolean setProductoFinanciero(ProductoFinanciero pf) {
	 if (!pf.permiteMembresia(this.membresia)) {
		 return false;
	 }
	 this.pf = pf;
	 return true;
 }
 
}
