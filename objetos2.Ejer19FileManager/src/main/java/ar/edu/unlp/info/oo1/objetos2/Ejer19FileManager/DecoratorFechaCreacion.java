package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

public class DecoratorFechaCreacion extends DecoratorFileManager{

	public DecoratorFechaCreacion(FileManager file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.file.getFechaCreacion();
	   }
}
