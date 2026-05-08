package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

public class DecoratorExtension extends DecoratorFileManager{

	public DecoratorExtension(FileManager sigFile, FileManager antFile) {
		super(sigFile, antFile);
	}
	
	@Override
	public String prettyPrint() {
		return  super.prettyPrint() + " - " +this.sigFile.getExtension();
	   }
}
