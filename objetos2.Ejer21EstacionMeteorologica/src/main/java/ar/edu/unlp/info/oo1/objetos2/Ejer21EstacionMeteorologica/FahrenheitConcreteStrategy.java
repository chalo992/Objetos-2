package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

import java.util.List;

public class FahrenheitConcreteStrategy implements TemperaturaStrategy{

	public String displayData(WeatherData homeWeatherStation) {
		return homeWeatherStation.displayData();
	}
	
	public double getTemperatura(double temperatura) {
		return temperatura;
	}
	
	public double getPromedio(List<Double> temperaturas) {
		return temperaturas.stream()
				.mapToDouble(t -> t).average().orElse(0);
	}
	
	public double getMinimo(List<Double> temperaturas) {
		return temperaturas.stream()
				.min((t1, t2) -> Double.compare(t1, t2))
				.orElse(null);
	}
	
	public double getMaximo(List<Double> temperaturas) {
		return temperaturas.stream()
				.max((t1, t2) -> Double.compare(t1, t2))
				.orElse(null);
	}
	
}
