package ar.edu.unlp.info.oo2.objetos2.Ejer2MediaPlayer;

public class AdapterVideoFile implements Media{
 private VideoStream videoStream;
 
  public AdapterVideoFile(VideoStream videoStream) {
	  this.videoStream = videoStream;
  }
 
	public void play() {
		this.videoStream.repdoduce();;
	}
}
