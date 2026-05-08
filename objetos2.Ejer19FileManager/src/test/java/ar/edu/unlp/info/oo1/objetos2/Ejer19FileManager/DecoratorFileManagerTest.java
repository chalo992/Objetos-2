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
	
	@BeforeEach
	void setUp() throws Exception {
		this.permisos.add("R");
		this.permisos.add("W");
		this.fileOO2 = new FileOO2("nombre", ".txt", 35, 
				LocalDate.of(2026, 4, 20), LocalDate.of(2026, 4, 25), 
				this.permisos);
	
	}
	
    @Test
    public void testPrettyPrint() {
        DecoratorFileManager decoExtension = new DecoratorExtension(fileOO2, null);
        assertEquals(decoExtension.prettyPrint(), "nombre - .txt");
        System.out.println(decoExtension.prettyPrint());
        
        DecoratorFechaCreacion decoFecha = new DecoratorFechaCreacion(null, null);
        decoExtension.agregarDecorador(decoFecha);
        System.out.println(decoExtension.prettyPrint());
        
        
        DecoratorPermisos decoPermisos = new DecoratorPermisos(null, null);
        DecoratorTamanio decoTamanio = new DecoratorTamanio(null, null);
        decoFecha.eliminarDecorator();
        decoExtension.agregarDecorador(decoPermisos);
        decoPermisos.agregarDecorador(decoTamanio);
        System.out.println(decoExtension.prettyPrint());
        
    }
}
