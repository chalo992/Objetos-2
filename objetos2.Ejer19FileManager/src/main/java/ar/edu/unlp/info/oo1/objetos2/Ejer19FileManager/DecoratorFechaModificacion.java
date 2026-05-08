package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

public class DecoratorFechaModificacion extends DecoratorFileManager{

	public DecoratorFechaModificacion(FileManager sigFile, FileManager antFile) {
		super(sigFile, antFile);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.sigFile.getFechaModificacion();
	   }
}
