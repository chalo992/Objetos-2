package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

import java.util.List;

public interface TemperaturaStrategy {

	String displayData(WeatherData homeWeatherStation);
	double getTemperatura(double temperatura);
	double getPromedio(List<Double> temperaturas);
	double getMinimo(List<Double> temperaturas);
	double getMaximo(List<Double> temperaturas);
}
