package ar.edu.unlp.info.oo1.objetos2.Ejer2_1JavaLoggingFramework;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AuthDataBase implements DatabaseAccess{
private DatabaseAccess DB;
private String auth;
private boolean access;
private Logger logger;

public AuthDataBase(DatabaseAccess DB, String auth) {
	this.DB = DB;
	this.auth = auth;
	this.access = false;
	this.logger = Logger.getLogger(AuthDataBase.class.getName());
}

public boolean authDataBase(String auth) {
	if (this.auth.equals(auth)) {
		this.access = true;
		return true;
	}
	return false;
}

public Collection<String> getSearchResults(String queryString){
	if (this.access) {
		this.logger.log(Level.INFO, "Busqueda exitoso");
		return this.DB.getSearchResults(queryString);
	}
	this.logger.log(Level.SEVERE, "Busqueda rechazada, no tenés permisos");
	this.logger.info("SEVERE");
   return Collections.emptyList();
	
}

public int insertNewRow(List<String> rowData) {
	if (this.access) {
		this.logger.log(Level.WARNING, "Insert exitoso");
		return this.DB.insertNewRow(rowData);
	}
	this.logger.log(Level.SEVERE, "Insert rechazado, no tenés permisos");
	return -1; 

}
}
