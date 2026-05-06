package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica.CelciusConcreteStrategy;
import ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica.FahrenheitConcreteStrategy;
import ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica.HomeWeatherStation;
import ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica.MaximoDecorator;
import ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica.MinimoDecorator;
import ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica.PromedioDecorator;
import ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica.StationDecorator;
import ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica.TemperaturaStrategy;

public class HomeWeatherStationTest {
	List<Double> temperaturas;
	HomeWeatherStation homeWeatherStation;
	TemperaturaStrategy fahrenheitStrategy;
	TemperaturaStrategy celciusStrategy;
	
	@BeforeEach
	void setUp() throws Exception {
		this.temperaturas = new ArrayList<>();
		this.temperaturas.add(86.0);
		this.homeWeatherStation = new HomeWeatherStation(86.0, 1008.0, 
				200.0, this.temperaturas);
		this.fahrenheitStrategy = new FahrenheitConcreteStrategy();
		this.celciusStrategy = new CelciusConcreteStrategy();

	}
	
    @Test
    public void testDisplayData() {  
    	//Ej1
    	StationDecorator d1 = new StationDecorator(homeWeatherStation, fahrenheitStrategy);
        System.out.println(d1.displayData());
       
        //Ej2
        StationDecorator d2 = new StationDecorator(homeWeatherStation, celciusStrategy);
        System.out.println(d2.displayData());
        
        //Ej3
        StationDecorator w1 = new PromedioDecorator(homeWeatherStation, celciusStrategy) ;
        System.out.println(w1.displayData());
        
        //Ej4
        StationDecorator w2 = new PromedioDecorator(homeWeatherStation, fahrenheitStrategy);
        System.out.println(w2.displayData());
        
        //Ej5
        StationDecorator w3 = new MaximoDecorator(new MinimoDecorator(new PromedioDecorator(homeWeatherStation, celciusStrategy), celciusStrategy), celciusStrategy);
        System.out.println(w3.displayData());
        
        //Ej6
        StationDecorator w4 = new MaximoDecorator(new MinimoDecorator(homeWeatherStation, celciusStrategy), celciusStrategy);
        System.out.println(w4.displayData());
        
        //Ej6
        StationDecorator w5 = new PromedioDecorator(new MaximoDecorator(new MinimoDecorator(homeWeatherStation, celciusStrategy), celciusStrategy), celciusStrategy);
        System.out.println(w5.displayData());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
