package ar.edu.unlp.info.oo2.objetos2.Ejer7OtraSolución;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreadorConcretoProducto1 extends ProductoCreador{

	public ProductoCombinado armarProducto(int plazoFijo, double interes
			,int parking){
		List<ProductoFinanciero> lista = new ArrayList<>();
		lista.add(new CompraDolares(LocalDate.now()));
		lista.add(new PlazoFijo(LocalDate.now(), plazoFijo, interes));
		lista.add(new CompraPesos(LocalDate.now()));
		ProductoCombinado p = new ProductoCombinado(LocalDate.now(), lista);
		return p;
	}
	
	
}
