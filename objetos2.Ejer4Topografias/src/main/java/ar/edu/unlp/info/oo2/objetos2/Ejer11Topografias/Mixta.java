package ar.edu.unlp.info.oo2.objetos2.Ejer11Topografias;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Mixta implements Topografia{
	  private List<Topografia> proporciones;
	  
	  public Mixta() {
		  this.proporciones = new ArrayList<>();
	  }
	  
	  public double calcularProporcionAgua() {
		  return this.proporciones.stream()
				 .mapToDouble(p -> p.calcularProporcionAgua()).sum()/4;
	  }
	  
	  public double calcularProporcionTierra() {
		  return this.proporciones.stream()
				 .mapToDouble(p -> p.calcularProporcionTierra()).sum()/4;
	  }
	  
	  public boolean agregarTopografia(Topografia t) {
		  if (this.proporciones.size() < 4) {
			  this.proporciones.add(t);
			  return true;
		  }
		  
		  return false;
	  }
	  
	  public List<Topografia> getProporciones(){
		   return this.proporciones;
	   }
	  
	  
	   public boolean comparar(Topografia t) {
			  return t.esMixta(this.getProporciones());
		  }
		  
			public boolean esAgua() {
				return false;
			}
			
			public boolean esTierra() {
				return false;
			}
			
			public boolean esMixta(List<Topografia> t) {
				if (this.proporciones.size() != t.size()) {
					return false;
				}
				return IntStream.range(0, this.proporciones.size())
					    .allMatch(i -> this.proporciones.get(i).comparar(t.get(i)));
			}
			
			public boolean esPantano() {
				return true;
			}
}
