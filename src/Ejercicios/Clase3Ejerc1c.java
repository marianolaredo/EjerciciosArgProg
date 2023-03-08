package Ejercicios;

public class Clase3Ejerc1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Devuelve suma de 3 INT mayores a otro INT
int numeros [] = new int[] {10,20,30};
int suma = 0;
int mayorA = 3;

	for (int i = 0; i < numeros.length; i++) {
		if(numeros[i] > mayorA) {
		suma = numeros[i] + suma;	
	}
	
	}
	System.out.println(suma);
}
}
