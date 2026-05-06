package ar.edu.unlp.info.oo1.objetos2.Ejer20BaseDeDatos;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AuthDataBase implements DatabaseAccess{
private DatabaseAccess DB;
private String auth;
private boolean access;

public AuthDataBase(DatabaseAccess DB, String auth) {
	this.DB = DB;
	this.auth = auth;
	this.access = false;
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
		return this.DB.getSearchResults(queryString);
	}
   return Collections.emptyList();
	
}

public int insertNewRow(List<String> rowData) {
	if (this.access) {
		return this.DB.insertNewRow(rowData);
	}
	return -1; 

}
}
