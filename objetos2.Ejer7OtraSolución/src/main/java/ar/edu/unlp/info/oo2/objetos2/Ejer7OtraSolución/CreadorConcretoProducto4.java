package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreadorConcretoProducto4 extends ProductoCreador{

	public ProductoCombinado armarProducto(int plazoFijo, double interes
			,int parking){
		List<ProductoFinanciero> lista = new ArrayList<>();
		lista.add(new CompraBonoAltoRiesgo(LocalDate.now(), parking));
		lista.add(new CompraBonoAltoRiesgo(LocalDate.now(), parking));
		lista.add(new CompraBonoAltoRiesgo(LocalDate.now(), parking));
		ProductoCombinado p = new ProductoCombinado(LocalDate.now(), lista);
		return p;
	}
	

}