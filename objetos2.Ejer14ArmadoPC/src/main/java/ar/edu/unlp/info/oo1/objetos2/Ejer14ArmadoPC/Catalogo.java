package ar.edu.unlp.info.oo1.objetos2.Ejer14ArmadoPC;


import java.util.List;

public class Catalogo {
 private List<Componente> componentes;

public Catalogo(List<Componente> componentes) {
	this.componentes = componentes;
}
 

public Componente getComponente(String descripcion) {
	return this.componentes.stream()
			.filter(a -> a.getDescripcion().startsWith(descripcion))
            .findFirst().orElse(null);
}
 
}
