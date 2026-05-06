package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

public class MaximoDecorator extends StationDecorator{

	public MaximoDecorator(WeatherData 
			weatherData, TemperaturaStrategy temperaturaStrategy) {
		super(weatherData, temperaturaStrategy);
	}
	
	@Override
	public String displayData() {
		return this.weatherData.displayData() + " " + "Maximo: " + this.temperaturaStrategy.getMaximo(weatherData.getTemperaturas());
	} 
}
