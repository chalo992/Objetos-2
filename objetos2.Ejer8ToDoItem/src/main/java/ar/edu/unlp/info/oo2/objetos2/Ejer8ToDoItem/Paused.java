package ar.edu.unlp.info.oo2.objetos2.Ejer8ToDoItem;


import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class Paused implements ItemState{

	  
	  public boolean start(ToDoItem toDoItem) {
		  throw new RuntimeException("El objeto ToDoItem no se "
			  		+ "encuentra en pending");
	  }
	  
	  public void togglePause(ToDoItem toDoItem) {
		  toDoItem.changeState(new InProgress());
	  }
	  
	  public void finish(ToDoItem toDoItem) {
		  toDoItem.finishDuration();
		  toDoItem.changeState(new Finished()); 
	  }
	  
	  public boolean workedTime() {
		  return true;
	  }
	  
	  public boolean addComment() {
		  return true;
	  }
}
