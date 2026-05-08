package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

import java.util.List;

public class StationDecorator implements WeatherData{
protected WeatherData weatherData;

public StationDecorator(WeatherData weatherData) {
	this.weatherData = weatherData;
}

public double getTemperatura() {
	return this.weatherData.getTemperatura();
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
	return this.weatherData.displayData();
}


}
