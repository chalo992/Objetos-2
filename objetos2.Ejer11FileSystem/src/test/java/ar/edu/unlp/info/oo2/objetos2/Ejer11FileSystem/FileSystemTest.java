package ar.edu.unlp.info.oo2.objetos2.Ejer11FileSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.objetos2.Ejer11FileSystem.Archivo;
import ar.edu.unlp.info.oo2.objetos2.Ejer11FileSystem.Directorio;
import ar.edu.unlp.info.oo2.objetos2.Ejer11FileSystem.Elemento;

public class FileSystemTest {
	Directorio raiz, direA, direB, direC;
	Archivo archA, archB, archC, archD, archE, archF;
	List<Elemento> list1, list2, list3, list4;
	
	@BeforeEach
	void setUp() throws Exception {
		list1 = new ArrayList<>();
		list2 = new ArrayList<>();
		list3 = new ArrayList<>();
		list4 = new ArrayList<>();
		archA = new Archivo("ArchA", LocalDate.of(2024, 10, 15), 30);
		archB = new Archivo("ArchB", LocalDate.of(2024, 10, 16), 35);
		archC = new Archivo("ArchC", LocalDate.of(2024, 10, 17), 105);
		archD = new Archivo("ArchA", LocalDate.of(2024, 10, 18), 10);
		archE = new Archivo("ArchE", LocalDate.now(), 23);
		archF = new Archivo("ArchF", LocalDate.of(2024, 10, 19), 43);
		
		list1.add(archA);
		list1.add(archE);
		direA = new Directorio("DireA", LocalDate.of(2024, 10, 20), list1);
		
		list2.add(archB);
		list2.add(archC);
		direB = new Directorio("ArchA", LocalDate.of(2024, 10, 21), list2);
		
		list3.add(archD);
		list3.add(direB);
		direC = new Directorio("DireC", LocalDate.of(2024, 10, 22), list3);
		
		list4.add(archF);
		list4.add(direC);
		list4.add(direA);
		raiz = new Directorio("Raiz", LocalDate.of(2024, 10, 23), list4);
		
	}
	
    @Test
    public void testTamanoTotalOcupado() {
    	assertEquals(this.archA.tamanoTotalOcupado(), 30);
        assertEquals(this.raiz.tamanoTotalOcupado(), 374);    
    }
    
    @Test
    public void testArchivoMasGrande() {
    	assertEquals(this.raiz.archivoMasGrande(), archC);
    }
    
    @Test
    public void testArchivoMasNuevo() {
    	assertEquals(this.raiz.archivoMasNuevo(), archE);
    }
    
    @Test
    public void testBuscar() {
    	assertEquals(this.raiz.buscar("ArchA"), archD);
    }
    
    @Test
    public void testBuscarTodos() {
    	assertEquals(this.raiz.buscarTodos("ArchA").size(), 3);
    }
    
    @Test
    public void testListadoContenido() {
    	System.out.println(this.raiz.listadoDeContenido());
    }
  
    
}
