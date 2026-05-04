package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

public class DecoratorPermisos extends DecoratorFileManager{

	public DecoratorPermisos(FileManager file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return this.file.getPermisos()  + " - " + super.prettyPrint();
	   }
}

