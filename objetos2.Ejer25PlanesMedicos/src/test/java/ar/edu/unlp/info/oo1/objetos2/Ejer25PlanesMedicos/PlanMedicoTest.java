package ar.edu.unlp.info.oo1.objetos2.Ejer25PlanesMedicos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanMedicoTest {
	Afiliado pedro;
	Obligatorio planObligatorio;
	ConseguroNull conseguroNull;
	Conseguro conseguro;
	@BeforeEach
	void setUp() throws Exception {
	    this.planObligatorio = new Obligatorio(LocalDate.of(2020, 10, 1));
	    this.conseguroNull = new ConseguroNull();
	    this.conseguro = new Conseguro("Blass", 2000, LocalDate.of(2025, 3, 2), 4000);
		this.pedro = new Afiliado("Pedro", 2, 100000, LocalDate.of(1998, 10, 1), 
				this.planObligatorio, this.conseguroNull);
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals(this.pedro.calcularMonto(), 23000);
        
        this.pedro.setPlanMedico(new Integral(LocalDate.now()));
        assertEquals(this.pedro.calcularMonto(), 33100);
        
        this.pedro.setConseguro(this.conseguro);
        assertEquals(this.pedro.calcularMonto(), 23100);
    }
}
