package ar.edu.unlp.info.oo2.objetos2.Ejer4Topografias;

import java.util.List;

public interface Topografia {
 
	List<Topografia> getProporciones();
	double calcularProporcionAgua();
	double calcularProporcionTierra();
	boolean equals(Topografia t);
	boolean esAgua();
	boolean esTierra();
	boolean esMixta(List<Topografia> t);
	boolean esPantano();
}
