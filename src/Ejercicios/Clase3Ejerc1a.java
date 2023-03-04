package Ejercicios;

public class Clase3Ejerc1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cuantas veces aparece el caracter "a"
		String cadena = "lacasablanca";
		int aparicion = 0;
		char letra = 'a';
	
		for(var i=0;i<cadena.length();i++) {
			
			 if(cadena.charAt(i) == letra) {
		
			aparicion++;
			 }		 	
	   }
		System.out.println("La letra \"a\" se encuentra " +aparicion+ " veces en la frase \"lacasablanca\"");
	}
}

