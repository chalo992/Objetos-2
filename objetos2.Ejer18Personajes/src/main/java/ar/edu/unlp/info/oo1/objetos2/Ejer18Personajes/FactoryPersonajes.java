package ar.edu.unlp.info.oo1.objetos2.Ejer18Personajes;

public class FactoryPersonajes {

	public Personaje getGuerrero() {
		return new Personaje("Gerrero", new Acero(), new Espada(), 
				"Cuerpo a cuerpo");
	}
	
	public Personaje getArquero() {
		return new Personaje("Arquero", new Cuero(), new Arco(), 
				"Disparo de flechas");
	}
	
	public Personaje getMago() {
		return new Personaje("Mago", new Cuero(), new Baston(), 
				"Magia y combate a distancia");
	}
	
	public Personaje getThoor() {
		return new Personaje("Thoor", new Hierro(), new Martillo(), 
				"Lanza rayos y combate a distancia");
	}
}
