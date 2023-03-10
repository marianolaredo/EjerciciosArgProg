package Ejercicios;

import java.util.Arrays;

public class Clase4Ejerc1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numerosOrdenados = numeros(18,24,9, "d");
		System.out.println("Los numeros ordenados segun el pedido son:");
		System.out.println(Arrays.toString(numerosOrdenados));
    }
	
	public static int[] numeros(int n1, int n2, int n3, String orden) {
		int[] vector = new int[] {n1, n2, n3};
		
		for(int i = 0; i < vector.length - 1; i++) {
			for(int j = 0; j < vector.length - 1; j++) {
			      if(orden.equals("a")) {
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

}
