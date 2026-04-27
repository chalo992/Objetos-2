package ar.edu.unlp.info.oo1.objetos2.Ejer17Dispositivo;

public class CuatroGConnection {
private String symb;

public CuatroGConnection(String symb) {
	this.symb = symb;
}

public String symb() {
	return this.symb;
}

public String transmit(String data, long crc) {
	return data + crc;
}
}
