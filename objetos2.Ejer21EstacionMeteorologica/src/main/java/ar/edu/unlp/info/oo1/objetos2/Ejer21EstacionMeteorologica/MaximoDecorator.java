package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

public class MaximoDecorator extends StationDecorator{

	public MaximoDecorator(WeatherData weatherData) {
		super(weatherData);
	}
	
	@Override
	public String displayData() {
		return this.weatherData.displayData() + " " + 
				"Maximo: " + this.weatherData.getTemperaturas().stream()
				.max((t1, t2) -> Double.compare(t1, t2))
				.orElse(null);
	} 
}
