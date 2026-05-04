package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

public class DecoratorExtension extends DecoratorFileManager{

	public DecoratorExtension(FileManager file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return this.file.getExtension() + " - " + super.prettyPrint();
	   }
}
