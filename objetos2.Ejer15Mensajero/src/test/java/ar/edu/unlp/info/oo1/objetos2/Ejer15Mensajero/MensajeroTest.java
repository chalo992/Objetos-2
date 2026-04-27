package ar.edu.unlp.info.oo1.objetos2.Ejer15Mensajero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MensajeroTest {
	Mensajero mensajero;
	FeistelCipher feistelCipher;
	RC4 rc4;
	FeistelCipherAdapter feistelCipherAdapter;
	RC4Adapter rc4Adapter;
	
	@BeforeEach
	void setUp() throws Exception {
		feistelCipher = new FeistelCipher("SECRET");
		rc4 = new RC4();
		
		feistelCipherAdapter = new FeistelCipherAdapter(feistelCipher);
		rc4Adapter = new RC4Adapter(rc4);
		
		mensajero = new Mensajero(feistelCipherAdapter, "SECRET_RC4");
		
		
	}
	
    @Test
    public void testMensaje() {
       String mensaje = "Hello World";
       this.mensajero.enviar(mensaje);
       this.mensajero.setCifradoStrategy(rc4Adapter);
       this.mensajero.enviar(mensaje);
    }
}
