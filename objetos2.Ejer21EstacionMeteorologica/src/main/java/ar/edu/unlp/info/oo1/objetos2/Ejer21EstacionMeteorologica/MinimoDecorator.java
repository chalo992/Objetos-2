package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

public class MinimoDecorator extends StationDecorator{

	public MinimoDecorator(WeatherData 
			weatherData, TemperaturaStrategy temperaturaStrategy) {
		super(weatherData, temperaturaStrategy);
	}
	
	@Override
	public String displayData() {
		return this.weatherData.displayData() + " " + "Minimo: " + this.temperaturaStrategy.getMinimo(weatherData.getTemperaturas());
	} 
}
