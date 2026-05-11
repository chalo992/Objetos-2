package ar.edu.unlp.info.oo1.objetos2.Ejer23GenealogiaSalvaje;

public class MamiferoNull implements MamiferoInterface{

	public boolean esNull() {
		return true;
	}

	
	public MamiferoInterface getPadre() {
		return this;
	}
	
	public MamiferoInterface getMadre () {
		return this;
	}
	
	public boolean tieneComoAncestroA(MamiferoInterface unMamifero) {
		return false;
	}
	
	
}
