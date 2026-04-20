package ar.edu.unlp.info.oo2.objetos2.Ejer8ToDoItem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.objetos2.Ejer8ToDoItem.ToDoItem;

public class ToDoItemTest {
 private ToDoItem item;
 
	
 @Test
 public void testToDoItemDuration() throws InterruptedException {
	 this.item = new ToDoItem("Item");
	 this.item.start();
	 TimeUnit.SECONDS.sleep(1);
	 this.item.togglePause();
	 TimeUnit.SECONDS.sleep(1);
	 this.item.finish();
	 Duration dur1 = this.item.workedTime();
	 TimeUnit.SECONDS.sleep(1);
	 Duration dur2 = this.item.workedTime();
	 assertEquals(dur1, dur2);
 }
 
 @Test
 public void testAddComments() {
	 this.item = new ToDoItem("Item");
	 this.item.addComment("Hola1");
	 this.item.start();
	 this.item.addComment("Hola2");
	 this.item.togglePause();
	 this.item.addComment("Hola3");
	 this.item.finish();
	   RuntimeException ex = assertThrows(RuntimeException.class, () -> {
	        this.item.addComment("nuevo comentario");
	    });

	    assertEquals(
	        "El toDoItem ya finalizó, no se puede agregar mas comentarios",
	        ex.getMessage()
	    );
 }
}
