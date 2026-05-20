package ar.edu.unlp.info.oo1.objetos2.Ejer25PlanesMedicos;

import java.time.LocalDate;

public class Premium extends PlanMedico{
	public static final int monto = 33000;
	public static final int montoPorFamiliar = 2800;


		public Premium(LocalDate fechaContratacion) {
		super(fechaContratacion);
	}

		public  double montoFijo(ConseguroInterface conseguro) {
			return (double) this.monto - conseguro.getDescuento();
		}
		
		public double cargoGrupoFamiliar(ConseguroInterface conseguro, Afiliado afiliado) {
			if(afiliado.getFamiliaresACargo() > 4) {
				return (afiliado.getFamiliaresACargo() - 4) * this.montoPorFamiliar;
			}
			return 0;
		}
		
		public double costoCoberturaViajera(ConseguroInterface conseguro, Afiliado afiliado) {
			return afiliado.getSalario() * 0.01 - conseguro.getMontoCobertura();
		}
		
		public double seguroInternacion() {
			return this.monto * 0.05;
		}
}
