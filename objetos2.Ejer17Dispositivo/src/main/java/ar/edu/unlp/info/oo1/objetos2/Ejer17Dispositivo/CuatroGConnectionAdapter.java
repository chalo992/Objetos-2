package ar.edu.unlp.info.oo1.objetos2.Ejer17Dispositivo;

public class CuatroGConnectionAdapter implements Connection{
private CuatroGConnection cuatroGConnectionAdapter;

public CuatroGConnectionAdapter(CuatroGConnection cuatroGConnectionAdapter) {
	this.cuatroGConnectionAdapter = cuatroGConnectionAdapter;
}

public String sendData(String data, int crc) {
	return this.cuatroGConnectionAdapter.transmit(data, crc);
}

public String pict() {
	return this.cuatroGConnectionAdapter.symb();
}

}
