package ar.edu.unlp.info.oo1.objetos2.Ejer26PrestamosPrendarios;

import java.util.ArrayList;
import java.util.List;

public class BienCombinado implements BienInterface{
	private List<BienInterface> bienes = new ArrayList<>();
	public static final double liquidez = 0.5;

	

	public BienCombinado(List<BienInterface> bienes) {
		this.bienes = bienes;
	}


	public double valor() {
		return this.valorPrendario();
	}

	public double valorPrendario() {
		return (this.bienes.stream()
				.mapToDouble(b -> b.valor()).sum()) * this.liquidez;
	}
}
