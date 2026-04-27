package ar.edu.unlp.info.oo1.objetos2.Ejer15Mensajero;

public class RC4Adapter implements CifradoStrategy{
 private RC4 rc4;

public RC4Adapter(RC4 rc4) {
	this.rc4 = rc4;
}
 
public String cifrarMensaje(String mensaje, String clave) {
	return this.rc4.encriptar(mensaje, clave);
}

public String descifrarMensaje(String mensaje, String clave) {
	return this.rc4.desencriptar(mensaje, clave);
}
 
}
