package ar.edu.unlp.info.oo1.objetos2.Ejer17Dispositivo;

public class WifiConn implements Connection{
private String pict;

   public WifiConn(String pict) {
	   this.pict = pict;
   }
   
	public String sendData(String data, int crc) {
		return data + crc;
	}
	
	public String pict() {
		return this.pict;
	}
}
