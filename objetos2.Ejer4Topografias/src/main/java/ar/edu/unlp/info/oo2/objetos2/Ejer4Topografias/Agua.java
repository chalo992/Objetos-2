package ar.edu.unlp.info.oo2.objetos2.Ejer4Topografias;

import java.util.ArrayList;
import java.util.List;

public class Agua implements Topografia{
 private double proporcionAgua;
 private double proporcionTierra;
 
   public Agua() {
	   this.proporcionAgua = 1;
	   this.proporcionTierra = 0;
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
   
   public boolean equals(Topografia t) {
	   return t.esAgua();
   }
   
	public boolean esAgua() {
		return true;
	}
	
	public boolean esTierra() {
		return false;
	}
	
	public boolean esMixta(List<Topografia> t) {
		return false;
	}
	
	public boolean esPantano() {
		return false;
	}
   
}
