package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

public class MinimoDecorator extends StationDecorator{

	public MinimoDecorator(WeatherData weatherData) {
		super(weatherData);
	}
	
	@Override
	public String displayData() {
		return this.weatherData.displayData() + " " + 
				"Minimo: " + this.weatherData.getTemperaturas().stream()
				.min((t1, t2) -> Double.compare(t1, t2))
				.orElse(null);
	} 
}
