package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreadorConcretoProducto3 extends ProductoCreador{

	public ProductoCombinado armarProducto(int plazoFijo, double interes
			,int parking){
		List<ProductoFinanciero> lista = new ArrayList<>();
		lista.add(new CompraBonoAltoRiesgo(LocalDate.now(), parking));
		lista.add(new CompraBonoBajoRiesgo(LocalDate.now(), parking));
		lista.add(new PlazoFijo(LocalDate.now(), plazoFijo, interes));
		ProductoCombinado p = new ProductoCombinado(LocalDate.now(), lista);
		return p;
	}
	
	
}
