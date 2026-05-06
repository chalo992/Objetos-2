package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

import java.util.List;

public class StationDecorator implements WeatherData{
protected WeatherData weatherData;
protected TemperaturaStrategy temperaturaStrategy;

public StationDecorator(WeatherData weatherData, TemperaturaStrategy temperaturaStrategy) {
	this.weatherData = weatherData;
	this.temperaturaStrategy = temperaturaStrategy;
}

public double getTemperatura() {
	return this.temperaturaStrategy.getTemperatura(this.weatherData.getTemperatura());
}

public double getPresion() {
	return this.weatherData.getPresion();
}

public double getRadiacionSolar() {
	return this.weatherData.getRadiacionSolar();
}

public List<Double> getTemperaturas(){
	return this.weatherData.getTemperaturas();
}

public String displayData() {
	return this.temperaturaStrategy.displayData(weatherData);
}


}
