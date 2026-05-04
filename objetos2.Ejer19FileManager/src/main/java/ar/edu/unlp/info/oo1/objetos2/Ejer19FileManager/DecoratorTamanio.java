package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

public class DecoratorTamanio extends DecoratorFileManager{

	public DecoratorTamanio(FileManager file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return  this.file.getTamanio() + " - " + super.prettyPrint();
	   }
}
