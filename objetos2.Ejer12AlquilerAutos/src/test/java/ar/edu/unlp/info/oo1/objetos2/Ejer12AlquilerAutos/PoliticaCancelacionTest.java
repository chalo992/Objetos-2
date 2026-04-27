package ar.edu.unlp.info.oo1.objetos2.Ejer12AlquilerAutos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PoliticaCancelacionTest {
	Usuario user;
	AutoEnAlquiler auto1;
	Reserva reserva;
	
	@BeforeEach
	void setUp() throws Exception {
		user = new Usuario("blass");
		auto1 = new AutoEnAlquiler(750, 5, "Toyota");
		reserva = new Reserva(10, LocalDate.of(2026, 4, 26), user, auto1, 
				new Estricta());
	}
	
    @Test
    public void testPoliticaCancelacion() {
        assertEquals(reserva.montoAReembolsar(), 0);
        System.out.println(reserva.montoAReembolsar());
        
        reserva.setPoliticaCancelacion(new Flexible());
        assertEquals(reserva.montoAReembolsar(), 7500);
        System.out.println(reserva.montoAReembolsar());
        
        reserva.setPoliticaCancelacion(new Moderada());
        System.out.println(reserva.montoAReembolsar());
        assertEquals(reserva.montoAReembolsar(), 3750);
        System.out.println(reserva.montoAReembolsar());
    }
}
