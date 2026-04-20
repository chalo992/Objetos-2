package ar.edu.unlp.info.oo2.objetos2.Ejer11FileSystem;

import java.util.List;

public class FileSystem {
 private Directorio raiz;
 
   public FileSystem (Directorio raiz) {
	   this.raiz = raiz;
   }
   
   public int tamanoTotalOcupado() {
	  return this.raiz.tamanoTotalOcupado();
   }

   
   public Archivo archivoMasGrande() {
	   return this.raiz.archivoMasGrande();
   }

 
   public Archivo archivoMasNuevo() {
	   return this.raiz.archivoMasNuevo();
   }

 
   public Elemento buscar(String nombre){
	   return this.raiz.buscar(nombre);
   }

  
   public List<Elemento> buscarTodos(String nombre){
	   return this.raiz.buscarTodos(nombre);
   }

  
   public String listadoDeContenido() {
	   return this.raiz.listadoDeContenido();
   }
 

}
