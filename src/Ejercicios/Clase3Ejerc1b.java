package Ejercicios;

public class Clase3Ejerc1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Ordenar de mayor a menor
		int numeros[] = new int[] {18, 24, 9};
		
		for(int i = 0; i < numeros.length - 1; i++) {
			for(int j = 0; j < numeros.length - 1; j++) {
				if(numeros[j] < numeros[j + 1]) {
					int temp = numeros[j + 1];
					numeros[j + 1] = numeros[j];
					numeros[j] = temp;
				}
			} 
		}
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		}
	}	
			
		


