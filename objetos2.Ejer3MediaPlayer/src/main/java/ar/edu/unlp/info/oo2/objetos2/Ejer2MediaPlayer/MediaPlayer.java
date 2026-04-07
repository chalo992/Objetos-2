package ar.edu.unlp.info.oo2.objetos2.Ejer2MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
 private List<Media> media;
 
  public MediaPlayer() {
	  this.media = new ArrayList<>();
  }
  
  public void addMedia(Media m) {
	  this.media.add(m);
  }
  
  public void play() {
	  this.media.stream().forEach(m -> m.play());
  }
}
