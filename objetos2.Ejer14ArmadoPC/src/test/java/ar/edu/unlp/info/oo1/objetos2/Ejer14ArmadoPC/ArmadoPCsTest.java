package ar.edu.unlp.info.oo1.objetos2.Ejer14ArmadoPC;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArmadoPCsTest {
	Catalogo catalogo;
	List<Componente> componentes;
	Componente cpuBasico;
	Componente cpuIntermedio;
	Componente cpuGamer;
	Componente ochoGB;
	Componente dieciseisGB;
	Componente treintaydosGB;
	Componente hdd500GB;
	Componente ssd500GB;
	Componente ssd1TB;
	Componente gtx1650;
	Componente rtx4090;
	Componente gaboEstandar;
	Componente gaboItermedio;
	Componente gaboGamer;
	Componente padTerm;
	Componente cooler;
	Componente fuente800W;
	Componente fuente1260W;
	
	Basico basico;
	Intermedio intermedio;
	Gamer gamer;
	
	ComputadoraDirector director;
	
	@BeforeEach
	void setUp() throws Exception {
		cpuBasico = new Componente("Celeron", "Procesador Básico", 500, 80);
		cpuIntermedio = new Componente("i5 12400", "Procesador Intermedio", 1800, 120);
		cpuGamer = new Componente("i9 14900K", "Procesador Gamer", 3200, 160);
		ochoGB = new Componente("Ram 8GB", "8 GB", 600, 20);
		dieciseisGB = new Componente("Ram 16GB", "16 GB", 1100, 35);
		treintaydosGB = new Componente("Ram 32GB", "32 GB", 2000, 50);
		hdd500GB = new Componente("hdd500GB", "HDD 500 GB", 200, 15);
		ssd500GB = new Componente("ssd500GB", "SSD 500 GB", 650, 30);
		ssd1TB = new Componente("ssd1TB", "SSD 1 TB", 1000, 40);
		gtx1650 = new Componente("gtx1650", "GTX 1650", 2200, 150);
		rtx4090 = new Componente("rtx4090", "RTX 4090", 4000, 450);
		gaboEstandar = new Componente("gaboEstandar", "Gabinete Estándar", 230, 15);
		gaboItermedio = new Componente("gaboItermedio", "Gabinete Intermedio", 340, 20);
		gaboGamer = new Componente("gaboGamer", "Gabinete Gamer", 470, 30);
		padTerm = new Componente("padTerm", "Pad Térmico", 175, 15);
		cooler = new Componente("cooler", "Cooler", 350, 45);
		fuente800W = new Componente("fuente800W", "Fuente 800 W", 850, 0);
		fuente1260W = new Componente("fuente1260W", "Fuente 1305.0 W", 1200, 0);
		componentes = new ArrayList<>();
		
		componentes.add(cpuBasico);
		componentes.add(cpuIntermedio);
		componentes.add(cpuGamer);
		componentes.add(ochoGB);
		componentes.add(dieciseisGB);
		componentes.add(treintaydosGB);
		componentes.add(hdd500GB);
		componentes.add(ssd500GB);
		componentes.add(ssd1TB);
		componentes.add(gtx1650);
		componentes.add(rtx4090);
		componentes.add(gaboEstandar);
		componentes.add(gaboItermedio);
		componentes.add(gaboGamer);
		componentes.add(padTerm);
		componentes.add(cooler);
		componentes.add(fuente800W);
		componentes.add(fuente1260W);
		
		catalogo = new Catalogo(componentes);
		
		basico = new Basico();
		intermedio = new Intermedio();
		gamer = new Gamer();
		director = new ComputadoraDirector();
		
	}
	
    @Test
    public void testArmadoPC() {
        Computadora compuBasica = this.director.armarComputadora(basico, catalogo);
        Computadora compuIntermedia = this.director.armarComputadora(intermedio, catalogo);
        Computadora compuGamer = this.director.armarComputadora(gamer, catalogo);

        System.out.println("=== PC Básica ===");
        for (Componente c : compuBasica.getComponentes()) {
            System.out.println(c.getDescripcion());
        }

        System.out.println("\n=== PC Intermedia ===");
        for (Componente c : compuIntermedia.getComponentes()) {
            System.out.println(c.getDescripcion());
        }

        System.out.println("\n=== PC Gamer ===");
        for (Componente c : compuGamer.getComponentes()) {
            System.out.println(c.getDescripcion());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
