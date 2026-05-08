package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

public class DecoratorTamanio extends DecoratorFileManager{

	public DecoratorTamanio(FileManager sigFile, FileManager antFile) {
		super(sigFile, antFile);
	}
	
	@Override
	public String prettyPrint() {
		return  super.prettyPrint() + " - " +  this.sigFile.getTamanio();
	   }
}
