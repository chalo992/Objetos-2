package ar.edu.unlp.info.oo2.objetos2.Ejer8ToDoItem;


public class Pending implements ItemState{
	
 
  
  public boolean start(ToDoItem toDoItem) {
	  toDoItem.changeState(new InProgress());
	  return true;
  }
  
  public void togglePause(ToDoItem toDoItem) {
	  throw new RuntimeException("El objeto ToDoItem no "
	  		+ "se encuentra en pause o in-progress");
  }
  
  public void finish(ToDoItem toDoItem) {
	  throw new RuntimeException("El objeto ToDoItem no "
		  		+ "se encuentra en in-progress o paused");
  }
  public boolean workedTime() {
	  throw new RuntimeException("El ToDoItem no inició");
  }
  
  public boolean addComment() {
		return true; 
  }
  
}
