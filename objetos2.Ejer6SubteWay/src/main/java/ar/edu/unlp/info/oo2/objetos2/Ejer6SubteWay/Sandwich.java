package ar.edu.unlp.info.oo2.objetos2.Ejer6SubteWay;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
  private List<String> ingredientes;
  private double precio;
  
   public Sandwich() {
	   this.ingredientes = new ArrayList<>();
	   this.precio = 0;
   }
   
   public void agregarIngrediente(String ingrediente) {
	   this.ingredientes.add(ingrediente);
   }
   
   public void sumarPrecio(double precio) {
	   this.precio = this.precio + precio;
   }
   
   public double getPrecio() {
	   return this.precio;
   }
   
   public  List<String> getIngredientes(){
	   return this.ingredientes;
   }
}
