package ar.edu.unlp.info.oo1.objetos2.Ejer15Mensajero;

public class FeistelCipherAdapter implements CifradoStrategy{
private FeistelCipher feistelCipher;



	public FeistelCipherAdapter(FeistelCipher feistelCipher) {
	   this.feistelCipher = feistelCipher;
    }

	public String cifrarMensaje(String mensaje, String clave) {
		  return this.feistelCipher.encode(mensaje);
	  }
	  
	 public String descifrarMensaje(String mensaje, String clave) {
		 return this.feistelCipher.encode(mensaje);
	 }
}
