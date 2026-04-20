package ar.edu.unlp.info.oo2.objetos2.Ejer8ToDoItem;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class Finished implements ItemState{
	  
	  public boolean start(ToDoItem toDoItem) {
		  throw new RuntimeException("El objeto ToDoItem no se "
			  		+ "encuentra en pending");
	  }
	  
	  public void togglePause(ToDoItem toDoItem) {
		  throw new RuntimeException("El objeto ToDoItem no "
			  		+ "se encuentra en pause o in-progress");
	  }
	  
	  public void finish(ToDoItem toDoItem) {
		  throw new RuntimeException("El objeto ToDoItem no "
			  		+ "se encuentra en pause o in-progress");
	  }
	  
	  public boolean workedTime() {
		return true;
	  }
	  
	  public boolean addComment() {
		  throw new RuntimeException("El toDoItem ya finalizó, no se puede "
		  		+ "agregar mas comentarios"); 
	  }
}
