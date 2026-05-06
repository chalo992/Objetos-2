package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

public class PromedioDecorator extends StationDecorator{

	public PromedioDecorator(WeatherData 
			weatherData, TemperaturaStrategy temperaturaStrategy) {
		super(weatherData, temperaturaStrategy);
	}
	
	@Override
	public String displayData() {
		return this.weatherData.displayData() + " " + "Promedio: " + this.temperaturaStrategy.getPromedio(weatherData.getTemperaturas());
	} 
}
