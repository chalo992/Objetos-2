package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

import java.time.LocalDate;
import java.util.List;

public class DecoratorFileManager implements FileManager {
	protected FileManager file;


	public DecoratorFileManager(FileManager file) {
		this.file = file;
	}

	   public String prettyPrint() {
		return this.file.prettyPrint();
	   }
		
		public String getExtension() {
			return this.file.getExtension();
		}
		
		public int getTamanio() {
			return this.file.getTamanio();
		}
		
		public LocalDate getFechaCreacion() {
			return this.file.getFechaCreacion();
		}
		
		public LocalDate getFechaModificacion() {
			return this.file.getFechaModificacion();
		}
		
		public List<String> getPermisos(){
			return this.file.getPermisos();
		}
}
