package ar.edu.unlp.info.oo2.objetos2.Ejer8ToDoItem;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
 private ItemState item;
 private List<String> comments;
 private Instant inicio;
 private Instant fin;
 private boolean termino = false;
 private String nombre;
 
 
 public ToDoItem(String name) {
	 this.comments = new ArrayList<>();
	 this.nombre = name;
	 this.item = new Pending();
 }

 public void start() {
	 if (this.item.start(this)) {
		 this.inicio = Instant.now();
	 }
 }
 
 public void togglePause() {
	 this.item.togglePause(this);
 }

 public void finish() {
	 this.item.finish(this);
 }

 public Duration workedTime() {
	if (!termino) {
		return Duration.between(this.inicio, Instant.now()); 
	}
	 return Duration.between(this.inicio, this.fin);
 }
 
 public void addComment(String comment) {
	 if (this.item.addComment()) {
		 this.comments.add(comment);
	 }
 }
 
 public void changeState(ItemState item) {
	 this.item = item;
 }
 
 public void finishDuration() {
	 this.fin = Instant.now();
	 this.termino = true;
 }
}
