package ar.edu.unlp.info.oo1.objetos2.Ejer14ArmadoPC;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
private List<Componente> componentes;

public Computadora() {
	this.componentes = new ArrayList<>();
}

public void agregarComponente(Componente componente) {
	this.componentes.add(componente);
}

public double consumoEquipo() {
	return this.componentes.stream()
			.mapToDouble(c -> c.getConsumo()).sum();
}

public double precioEquipo() {
	return this.componentes.stream()
			.mapToDouble(c -> c.getPrecio()).sum();
}

public List<Componente> getComponentes(){
	return this.componentes;
}

}
