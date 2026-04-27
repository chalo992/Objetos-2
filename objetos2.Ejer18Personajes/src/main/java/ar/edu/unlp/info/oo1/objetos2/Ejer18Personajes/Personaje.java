package ar.edu.unlp.info.oo1.objetos2.Ejer18Personajes;

public class Personaje {
private String nombre;
private Armadura armadura;
private Arma arma;
private String habilidad;
private int vida;

public Personaje(String nombre, Armadura armadura, Arma arma, 
		String habilidad) {
	this.nombre = nombre;
	this.armadura = armadura;
	this.arma = arma;
	this.habilidad = habilidad;
	this.vida = 100;
}

public Armadura getArmadura() {
	return this.armadura;
}

public int getVida() {
	return this.vida;
}

public void atacar(Personaje enemy) {
	if (enemy.getVida() <= 0) {
		System.out.println("Enemigo fuera de combate, vida: " + enemy.getVida());
		return;
	}
	int daño = this.arma.atacarConArma(enemy.getArmadura());
	enemy.recibirDaño(daño);
}

public void recibirDaño(int daño) {
	this.vida = this.vida - daño;
}


}
