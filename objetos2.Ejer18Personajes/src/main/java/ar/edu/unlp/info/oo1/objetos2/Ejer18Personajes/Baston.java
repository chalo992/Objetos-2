package ar.edu.unlp.info.oo1.objetos2.Ejer18Personajes;

public class Baston implements Arma{

	public int atacarConArma(Armadura armadura) {
		return armadura.contraBaston();
	}
}
