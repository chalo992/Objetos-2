package ar.edu.unlp.info.oo1.objetos2.Ejer23GenealogiaSalvaje;

public interface MamiferoInterface {

	public boolean esNull();
	public MamiferoInterface getPadre();
	public MamiferoInterface getMadre();
	public boolean tieneComoAncestroA(MamiferoInterface unMamifero);
	
}
