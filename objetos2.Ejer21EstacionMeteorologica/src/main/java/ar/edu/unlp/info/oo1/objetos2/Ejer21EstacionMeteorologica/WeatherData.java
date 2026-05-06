package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

import java.util.List;

public interface WeatherData {

	double getTemperatura();
	double getPresion();
	double getRadiacionSolar();
	List<Double> getTemperaturas();
	String displayData();
}
