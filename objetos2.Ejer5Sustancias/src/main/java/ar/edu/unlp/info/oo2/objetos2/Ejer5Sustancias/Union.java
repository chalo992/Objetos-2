package ar.edu.unlp.info.oo2.objetos2.Ejer5Sustancias;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Union implements ElementoQuimico{
 private List<ElementoQuimico> elementos = new ArrayList<>();
 
  public Union(List<ElementoQuimico> elementos) {
	  this.elementos = elementos;
  }
  
  public String formula() {
	  return this.elementos.stream()
		        .map(e -> e.formula())
		        .collect(Collectors.joining());
  }
  
  public int pesoMolecular() {
	  return this.elementos.stream()
			 .mapToInt(p -> p.pesoMolecular()).sum();
  }
  
  public int carga() {
	  return this.elementos.stream()
				 .mapToInt(p -> p.carga()).sum();
  }
  
  public boolean esMetal() {
	  return false;
  }
  
  public boolean esValida() {
	  long metales = this.elementos.stream()
		        .filter(e -> e.esMetal())
		        .count();

		    return metales <= 1;
  }
  
 
}
