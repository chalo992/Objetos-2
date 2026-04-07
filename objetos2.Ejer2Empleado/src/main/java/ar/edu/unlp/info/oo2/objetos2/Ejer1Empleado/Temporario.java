package ar.edu.unlp.info.oo2.objetos2.Ejer1Empleado;

public class Temporario extends Personal{
  private int horasTrabajadas;
  private boolean casado;
  private int cantHijos;
  
  public Temporario(int horasTrabajadas, boolean casado, int cantHijos) {
	  this.horasTrabajadas = horasTrabajadas;
	  this.casado = casado;
	  this.cantHijos = cantHijos;
  }
	
	public int basico() {
		return 20000 + this.horasTrabajadas * 300; //23600
	}
	
	public int adicional() {
		if (this.casado) {
			return 5000 + 2000 * this.cantHijos; //11000
		}
		return 2000 * this.cantHijos;
	}
	
}
