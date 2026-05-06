package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

import java.util.List;

public class CelciusConcreteStrategy implements TemperaturaStrategy{

	public String displayData(WeatherData homeWeatherStation) {
		return "Temperatura C: " + this.transformarFahrenheitACelcius(homeWeatherStation.getTemperatura()) +
				" Presión atmosf: " + homeWeatherStation.getPresion() +
			   	  " Radiación solar: " + homeWeatherStation.getRadiacionSolar();
	}
	
	public double getTemperatura(double temperatura) {
		return this.transformarFahrenheitACelcius(temperatura);
	}
	
	public double getPromedio(List<Double> temperaturas) {
		return this.transformarFahrenheitACelcius(temperaturas.stream()
				.mapToDouble(t -> t).average().orElse(0));
	}
	
	public double getMinimo(List<Double> temperaturas) {
		return this.transformarFahrenheitACelcius(temperaturas.stream()
				.min((t1, t2) -> Double.compare(t1, t2))
				.orElse(null));
	}
	
	public double getMaximo(List<Double> temperaturas) {
		return this.transformarFahrenheitACelcius(temperaturas.stream()
				.max((t1, t2) -> Double.compare(t1, t2))
				.orElse(null));
	}
	
	private double transformarFahrenheitACelcius(double temperatura) {
		return (temperatura - 32) / 1.8;
	}
}
