package ar.edu.unlp.info.oo1.objetos2.Ejer17Dispositivo;

public class Dispositivo {
private Calculator crcCalculator;
private Connection connection;
private Ringer ringer;
private Display display;

public Dispositivo(Calculator crcCalculator, Connection connection, 
		Ringer ringer, Display display) {
	this.crcCalculator = crcCalculator;
	this.connection = connection;
	this.ringer = ringer;
	this.display = display;
}

public void configurarCRC(Calculator crcCalculator) {
	this.crcCalculator = crcCalculator;
}

public void conectarCon(Connection connection) {
	this.connection = connection;
	this.display.showBanner(this.connection.pict());
	this.ringer.ring();
}

public String send(String data) {
	long crc = this.crcCalculator.crcFor(data);
	return this.connection.sendData(data, (int) crc);
}

}
