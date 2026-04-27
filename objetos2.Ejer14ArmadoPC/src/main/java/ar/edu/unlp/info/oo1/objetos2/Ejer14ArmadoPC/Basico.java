package ar.edu.unlp.info.oo1.objetos2.Ejer14ArmadoPC;

public class Basico extends ComputadoraBuilder{
	
	/*
	public Basico(Catalogo catalogo) {
		super(catalogo);
		this
	}
	*/
	public void agregarProcesador() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Procesador Básico"));
	}
	
	public void agregarRam() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("8 GB"));
	}
	
	public void agregarDisco() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("HDD 500 GB"));
	}
	
	public void agregarTarjetaGrafica() {
		//No posee (integrada)
	}
	
	public void agregarGabinete() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Gabinete Estándar"));
	}

}
