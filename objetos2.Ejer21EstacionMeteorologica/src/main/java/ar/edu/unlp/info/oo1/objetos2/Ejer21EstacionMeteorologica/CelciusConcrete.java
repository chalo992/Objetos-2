package ar.edu.unlp.info.oo1.objetos2.Ejer21EstacionMeteorologica;

import java.util.List;

public class CelciusConcrete extends HomeWeatherStation{

	public CelciusConcrete(double temperatura, double presion, 
			double radiacionSolar, List<Double> temperaturas) {
	super(temperatura, presion, radiacionSolar, temperaturas);
}
	
	@Override
	public double getTemperatura() {
		return this.transformarFahrenheitACelcius(this.temperatura);
	}
	
	@Override
	public String displayData() {
		return "Temperatura C: " + this.transformarFahrenheitACelcius(this.temperatura) +
				" Presión atmosf: " + this.getPresion() +
			   	  " Radiación solar: " + this.getRadiacionSolar();
	}
	
	@Override
	public List<Double> getTemperaturas(){
		 return this.temperaturas.stream()
		            .map(t -> transformarFahrenheitACelcius(t))
		            .toList();
	}
	
	private double transformarFahrenheitACelcius(double temperatura) {
		return (temperatura - 32) / 1.8;
	}
	
}
