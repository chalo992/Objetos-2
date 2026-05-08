package ar.edu.unlp.info.oo1.objetos2.Ejer19FileManager;

import java.time.LocalDate;
import java.util.List;

public interface FileManager {
 String prettyPrint();
 String getExtension();
 int getTamanio();
 LocalDate getFechaCreacion();
 LocalDate getFechaModificacion();
 List<String> getPermisos();
 FileManager getFileManager();
 void setSigFileManager(FileManager file);
 void setAntFileManager(FileManager file);
}
