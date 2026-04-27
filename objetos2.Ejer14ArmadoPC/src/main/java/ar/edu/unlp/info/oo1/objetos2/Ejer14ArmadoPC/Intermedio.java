package ar.edu.unlp.info.oo1.objetos2.Ejer14ArmadoPC;

public class Intermedio extends ComputadoraBuilder{
	
	public void agregarProcesador() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Procesador Intermedio"));
	}
	
	public void agregarRam() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("16 GB"));
	}
	
	public void agregarDisco() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("SSD 500 GB"));
	}
	
	public void agregarTarjetaGrafica() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("GTX 1650"));
	}
	
	public void agregarGabinete() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Gabinete Intermedio"));
		this.agregarFuente();
	}
	
	private void agregarFuente() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Fuente 800 W"));
	}

}

