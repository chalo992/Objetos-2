package ar.edu.unlp.info.oo1.objetos2.Ejer15Mensajero;

public class Mensajero {
private CifradoStrategy cifradoStrategy;
private String claveCifrado;

public Mensajero(CifradoStrategy cifradoStrategy, String claveCifrado) {
	this.cifradoStrategy = cifradoStrategy;
	this.claveCifrado = claveCifrado;
}

public void setCifradoStrategy(CifradoStrategy cifradoStrategy) {
	this.cifradoStrategy = cifradoStrategy;
}

public void setClaveSifrado(String claveCifrado) {
	this.claveCifrado = claveCifrado;
}

public void enviar(String mensaje) {
	this.recibir(this.cifradoStrategy.cifrarMensaje(mensaje, this.claveCifrado));
}

public void recibir(String mensaje) {
	System.out.println(this.cifradoStrategy.descifrarMensaje(mensaje, this.claveCifrado));
}

}
