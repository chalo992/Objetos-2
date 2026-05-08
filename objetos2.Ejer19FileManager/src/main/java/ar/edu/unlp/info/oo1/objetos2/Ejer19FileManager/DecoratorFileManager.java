package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

import java.time.LocalDate;
import java.util.List;

public class DecoratorFileManager implements FileManager {
	protected FileManager sigFile;
	protected FileManager antFile;


	public DecoratorFileManager(FileManager sigFile, FileManager antFile) {
		this.sigFile = sigFile;
		this.antFile = antFile;
	}

	   public String prettyPrint() {
		return this.sigFile.prettyPrint();
	   }
		
		public String getExtension() {
			return this.sigFile.getExtension();
		}
		
		public int getTamanio() {
			return this.sigFile.getTamanio();
		}
		
		public LocalDate getFechaCreacion() {
			return this.sigFile.getFechaCreacion();
		}
		
		public LocalDate getFechaModificacion() {
			return this.sigFile.getFechaModificacion();
		}
		
		public List<String> getPermisos(){
			return this.sigFile.getPermisos();
		}
		
		public FileManager getFileManager() {
			return this.sigFile;
		}
		
		public void setSigFileManager(FileManager file) {
			 this.sigFile = file;
		}
		
		public void setAntFileManager(FileManager file) {
			this.antFile = file;
		}
		
		public void agregarDecorador(DecoratorFileManager file) {
			file.setSigFileManager(this.sigFile);
			file.setAntFileManager(this);
		    this.sigFile.setAntFileManager(file);
			 this.setSigFileManager(file);
		}
		
		public void eliminarDecorator() {
		    this.antFile.setSigFileManager(this.sigFile);
		    this.sigFile.setAntFileManager(this.antFile);
		}
}
