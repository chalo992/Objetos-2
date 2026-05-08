package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

public class DecoratorPermisos extends DecoratorFileManager{

	public DecoratorPermisos(FileManager sigFile, FileManager antFile) {
		super(sigFile, antFile);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " - " +  this.sigFile.getPermisos();
	   }
}

