package ar.edu.unlp.info.oo2.objetos2.Ejer11Topografias;

import java.util.ArrayList;
import java.util.List;

public class Pantano implements Topografia{
	 private double proporcionAgua;
	 private double proporcionTierra;
	 
	   public Pantano() {
		   this.proporcionAgua = 0.7;
		   this.proporcionTierra = 0.3;
	   }
	   
	   public double calcularProporcionAgua() {
		   return this.proporcionAgua;
	   }
	   
	   public double calcularProporcionTierra() {
		   return this.proporcionTierra;
	   }
	   
	   public List<Topografia> getProporciones(){
		   List<Topografia> listaVacia = new ArrayList<>();
		   return listaVacia;
	   }
	   
	   public boolean comparar(Topografia t) {
			  return t.esPantano();
		  }
		  
			public boolean esAgua() {
				return false;
			}
			
			public boolean esTierra() {
				return false;
			}
			
			public boolean esMixta(List<Topografia> t) {
				return false;
			}
			
			public boolean esPantano() {
				return true;
			}

}
