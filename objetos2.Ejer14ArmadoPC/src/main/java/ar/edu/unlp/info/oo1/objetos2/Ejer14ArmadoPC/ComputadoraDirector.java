package ar.edu.unlp.info.oo1.objetos2.Ejer14ArmadoPC;

public class ComputadoraDirector {
  
	public Computadora armarComputadora
	(ComputadoraBuilder compuBuilder, Catalogo catalogo) {
		compuBuilder.newComputadora(catalogo);
		compuBuilder.agregarProcesador();
		compuBuilder.agregarRam();
		compuBuilder.agregarDisco();
		compuBuilder.agregarTarjetaGrafica();
		compuBuilder.agregarGabinete();
		return compuBuilder.getComputadora();
	}
}
