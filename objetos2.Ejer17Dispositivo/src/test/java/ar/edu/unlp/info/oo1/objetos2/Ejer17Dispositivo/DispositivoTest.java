package ar.edu.unlp.info.oo1.objetos2.Ejer17Dispositivo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
  Dispositivo dispositivo;
  Ringer ringer;
  Display display;
  CRC16_Calculator crc16;
  CRC32_Calculator crc32;
  WifiConn wifiConn;
  CuatroGConnection cuatroG;
  CuatroGConnectionAdapter cuatroGAdapter;
  
	@BeforeEach
	void setUp() throws Exception {
		ringer = new Ringer();
		display = new Display();
		crc16 = new CRC16_Calculator();
		crc32 = new CRC32_Calculator();
		wifiConn = new WifiConn("pict");
		cuatroG = new CuatroGConnection("symb");
		cuatroGAdapter = new CuatroGConnectionAdapter(cuatroG);
		dispositivo = new Dispositivo(crc16, wifiConn, ringer, display);
	}
	
  @Test
  public void testSend() {
	  System.out.println("Test Send");
      System.out.println(this.dispositivo.send("Hello world"));
      System.out.println("-----------------");
      System.out.println();
  }
  
  @Test
  public void testConectarCon() {
	  System.out.println("Test ConectarCon");
      this.dispositivo.conectarCon(cuatroGAdapter);
      System.out.println("-----------------");
      System.out.println();
  }
  
  @Test
  public void testConfigurarCRC () {
	  System.out.println("Test ConfigurarCRC");
      this.dispositivo.configurarCRC(crc32);
      System.out.println(this.dispositivo.send("Hello world"));
  }
}
