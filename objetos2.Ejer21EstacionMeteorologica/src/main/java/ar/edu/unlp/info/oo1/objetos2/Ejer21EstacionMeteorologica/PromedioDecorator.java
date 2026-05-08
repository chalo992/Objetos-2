package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

public class PromedioDecorator extends StationDecorator{

	public PromedioDecorator(WeatherData weatherData) {
		super(weatherData);
	}
	
	@Override
	public String displayData() {
		return this.weatherData.displayData() + " " + 
	"Promedio: " + this.weatherData.getTemperaturas().stream()
	               .mapToDouble(t -> t).average().orElse(0);
	} 
}
