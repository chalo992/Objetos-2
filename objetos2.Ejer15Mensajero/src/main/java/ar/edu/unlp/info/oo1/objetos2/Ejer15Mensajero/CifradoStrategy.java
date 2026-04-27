package ar.edu.unlp.info.oo1.objetos2.Ejer15Mensajero;

public interface CifradoStrategy {
  String cifrarMensaje(String mensaje, String clave);
  String descifrarMensaje(String mensaje, String clave);
}
