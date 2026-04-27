package ar.edu.unlp.info.oo1.objetos2.Ejer14ArmadoPC;

public abstract class ComputadoraBuilder {
protected Computadora compu;
protected Catalogo catalogo;


public void newComputadora(Catalogo catalogo) {
	this.compu = new Computadora();
	this.catalogo = catalogo;
}

public Computadora getComputadora() {
	return this.compu;
}

public abstract void agregarProcesador();
public abstract void agregarRam();
public abstract void agregarDisco();
public abstract void agregarTarjetaGrafica();
public abstract void agregarGabinete();
}
