package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager.DecoratorExtension;
import ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager.DecoratorFechaCreacion;
import ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager.DecoratorFechaModificacion;
import ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager.DecoratorFileManager;
import ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager.DecoratorPermisos;
import ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager.DecoratorTamanio;
import ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager.FileOO2;

public class DecoratorFileManagerTest {

	FileOO2 fileOO2;
	List<String> permisos = new ArrayList<>();
	DecoratorTamanio decoTamanio;
	DecoratorPermisos decoPermisos;
	DecoratorFechaModificacion decoFechaModificacion;
	DecoratorFechaCreacion decoFechaCreacion;
	DecoratorExtension decoExtension;
	
	@BeforeEach
	void setUp() throws Exception {
		this.permisos.add("R");
		this.permisos.add("W");
		this.fileOO2 = new FileOO2("nombre", ".txt", 35, 
				LocalDate.of(2026, 4, 20), LocalDate.of(2026, 4, 25), 
				this.permisos);
		this.decoTamanio = new DecoratorTamanio(this.fileOO2);
		this.decoPermisos = new DecoratorPermisos(this.fileOO2);
		this.decoFechaModificacion = new DecoratorFechaModificacion(this.fileOO2);
		this.decoFechaCreacion = new DecoratorFechaCreacion(this.fileOO2);
	    this.decoExtension = new DecoratorExtension(this.fileOO2);
	}
	
    @Test
    public void testPrettyPrint() {
        DecoratorFileManager d1 = new DecoratorExtension(fileOO2);
        assertEquals(d1.prettyPrint(), ".txt - nombre");
        System.out.println(d1.prettyPrint());
        
        DecoratorFileManager d2 = new DecoratorExtension(new DecoratorFechaCreacion(fileOO2));
        assertEquals(d2.prettyPrint(), ".txt - 2026-04-20 - nombre");
        System.out.println(d2.prettyPrint());
        
        DecoratorFileManager d3 = new DecoratorExtension(new DecoratorPermisos(new DecoratorTamanio(fileOO2)));
        assertEquals(d3.prettyPrint(), ".txt - [R, W] - 35 - nombre");
        System.out.println(d3.prettyPrint());
    }
}
