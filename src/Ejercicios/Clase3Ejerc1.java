
package Ejercicios;

import java.util.Arrays;

public class Clase3Ejerc1{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int apariciones = aparicion("lacasablanca" , 'a' );
		System.out.println("La letra aparece " + apariciones + " veces");
		
		int[] numerosOrdenados = numeros(18,24,9, "asc");
		System.out.println("Los numeros ordenados segun el pedido son:");
		System.out.println(Arrays.toString(numerosOrdenados));
		
		int sumaMayorx = numero(10,20,30,5);
           System.out.println("Laa suma de los 3 numeros menores a X es " + sumaMayorx); 
		
	}
	public static int aparicion(String palabra, char letra) {		
		int apariciones = 0;	
		for(var i=0;i<palabra.length();i++) {
		   if(palabra.charAt(i) == letra) {
		   apariciones++;
	        }
		 }
		return apariciones;
     }
	public static int[] numeros(int n1, int n2, int n3, String orden) {
		int[] vector = new int[] {n1, n2, n3};
		
		for(int i = 0; i < vector.length - 1; i++) {
			for(int j = 0; j < vector.length - 1; j++) {
			      if(orden.equals("asc")) {
				if(vector[j] > vector[j + 1]) {
					int temp = vector[j + 1];
					vector[j + 1] = vector[j];
					vector[j] = temp;
				}
			    }else {
				if(vector[j] < vector[j + 1]) {
					int temp = vector[j + 1];
					vector[j + 1] = vector[j];
					vector[j] = temp;	
			      }
		     }    
	       }
		}
	     return vector;
	}
	
		public static int numero(int n1, int n2, int n3, int n4) {
		int vector [] = new int[] {n1, n2, n3, n4};
		int suma = 0;
		
		for (int i = 0; i < vector.length; i++) {
				if(vector[i] > n4) {
					suma = vector[i] + suma;   	
				}		
		}
		return suma;
			
		}
}
	
		