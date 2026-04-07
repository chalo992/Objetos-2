package ar.edu.unlp.info.oo2.objetos2.Ejer1Empleado;

public class Pasante extends Personal{
	 private int cantExamenes;

	  
	  public Pasante(int cantExamenes) {
		  this.cantExamenes = cantExamenes;

	  }
		
		public int basico() {
			return 20000;
		}
		
		public int adicional() {
			
			return 2000 * this.cantExamenes;
		}
		
}
