package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Clase4Ejerc1b {

	public static void main(String[] args) {
		int n1;
		Scanner leer = new Scanner(System.in);
		System.out.println ("Ingrese primer numero"); 
		n1 = leer.nextInt();
		int n2;
		Scanner leer2 = new Scanner(System.in);
		System.out.println ("Ingrese segundo numero"); 
		n2 = leer2.nextInt();
		int n3;
		Scanner leer3 = new Scanner(System.in);
		System.out.println ("Ingrese tercer numero"); 
		n3 = leer3.nextInt();
		Scanner scn = new Scanner(System.in);
		System.out.println ("Ingrese su desea ascendente \"a\" o \"d\" si desea descendente"); 
		String orden = scn.nextLine();
		
		
		int[] numerosOrdenados = numeros(n1,n2,n3,orden);
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



