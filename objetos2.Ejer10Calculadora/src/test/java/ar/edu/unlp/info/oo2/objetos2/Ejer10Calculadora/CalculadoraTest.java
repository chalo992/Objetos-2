package ar.edu.unlp.info.oo2.objetos2.Ejer10Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.objetos2.Ejer10Calculadora.Calculadora;

public class CalculadoraTest {
 private Calculadora calc;
 
	@BeforeEach
	void setUp() throws Exception {
		this.calc = new Calculadora();
	}
	
 @Test
 public void testCalculadora() {
	 this.calc.mas();
	 this.calc.setValor(9);
	 assertEquals(this.calc.getResultado(), "Valor acumulado: 9.0");
	 System.out.println(this.calc.getResultado());
	 this.calc.setValor(5);
	 this.calc.mas();
	 this.calc.setValor(3);
	 assertEquals(this.calc.getResultado(), "Valor acumulado: 8.0");
     System.out.println(this.calc.getResultado());
     this.calc.por();
     this.calc.setValor(2);
     assertEquals(this.calc.getResultado(), "Valor acumulado: 16.0");
     System.out.println(this.calc.getResultado());
     this.calc.dividido();
     this.calc.setValor(0);
     assertEquals(this.calc.getResultado(), "Error");
     this.calc.borrar();
     this.calc.setValor(5);
     assertEquals(this.calc.getResultado(), "Valor acumulado: 5.0");
     System.out.println(this.calc.getResultado());
 }
}
