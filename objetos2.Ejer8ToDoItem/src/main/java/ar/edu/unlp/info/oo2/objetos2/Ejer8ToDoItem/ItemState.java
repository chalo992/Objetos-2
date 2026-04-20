package ar.edu.unlp.info.oo2.objetos2.Ejer8ToDoItem;

public interface ItemState {

   
   public boolean start(ToDoItem toDoItem);
   public void togglePause(ToDoItem toDoItem);
   public void finish(ToDoItem toDoItem);
   public boolean workedTime();
   public boolean addComment();
}
