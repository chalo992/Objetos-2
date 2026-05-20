package ar.edu.unlp.info.oo1.objetos2.Ejer1SingleThreadTCPFramework;

import java.io.PrintWriter;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer{

	 public void handleMessage(String message, PrintWriter out) {
		 String[] args = message.split(" ");
	        if (args.length != 3) {
	            out.println("Error: Se debe ingresar tres argumentos");
	            return;
	        }

	        String letras = args[0];
	        String numeros = args[1];
	        String especiales = args[2];
	        
	        
	        Random random = new Random();
			char claveNumero = numeros.charAt(random.nextInt(numeros.length()));
	        char claveEspacial = especiales.charAt(random.nextInt(especiales.length()));
	        String claveLetras = "";
	        
	        for (int i=0; i<6; i++) {
	        	char c = letras.charAt(random.nextInt(letras.length()));
	        	claveLetras += String.valueOf(c);
	        }
	        out.println(claveLetras + String.valueOf(claveEspacial) + 
	        		String.valueOf(claveNumero));
	    }
	    
	    public String termination() {
	    	return "cerrar";
	    }

	    public static void main(String[] args) {

	        new PasswordServer().startLoop(args);

	    }

	}
