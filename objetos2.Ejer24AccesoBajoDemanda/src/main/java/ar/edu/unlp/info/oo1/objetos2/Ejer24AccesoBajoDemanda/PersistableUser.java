package ar.edu.unlp.info.oo1.objetos2.Ejer24AccesoBajoDemanda;

import java.util.List;

public interface PersistableUser {

	public String getUsername();

	public String getEmail();

	public List<Post> getPosts();

}
