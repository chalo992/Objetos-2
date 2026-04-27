package ar.edu.unlp.info.oo1.objetos2.Ejer14ArmadoPC;

public class Gamer extends ComputadoraBuilder{
	
	public void agregarProcesador() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Procesador Gamer"));
		this.agregarPadTermico();
		this.agregarCooler();
	}
	
	public void agregarRam() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("32 GB"));
		this.compu.agregarComponente
		(this.catalogo.getComponente("32 GB"));
	}
	
	public void agregarDisco() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("SSD 500 GB"));
		this.compu.agregarComponente
		(this.catalogo.getComponente("SSD 1 TB"));
	}
	
	public void agregarTarjetaGrafica() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("RTX 4090"));
	}
	
	public void agregarGabinete() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Gabinete Gamer"));
		double consumo = this.compu.consumoEquipo();
		this.agregarFuente(consumo + consumo/2);
	}
	
	private void agregarFuente(double consumo) {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Fuente " + consumo + " W"));
	}
	
	private void agregarPadTermico() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Pad Térmico"));
	}
	
	private void agregarCooler() {
		this.compu.agregarComponente
		(this.catalogo.getComponente("Cooler"));
	}
}
