	/*ENGLISH: We will create an array of 5 positions, to store integers, and the program at the end 
      will tell us which is the largest of those 5.
      SPANISH: Crearemos un arreglo de 5 posiciones, para almacenar números enteros, y el programa 
      al finalizar nos dirá cuál es el mayor de esos 5.*/

import java.util.Scanner;

public class EX02_highestNumber {

	public static void main(String[] args) {
		int arreglo[]=new int[5];
		int mayor=arreglo[0];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ingrese los 5 números: ");
			for(int i=0;i<arreglo.length;i++)
			{
				arreglo[i]=sc.nextInt();
				if(arreglo[i]>mayor)
				{
					mayor=arreglo[i];
				}
				
			}
		}
		System.out.println("El número mayor es: "+mayor);
	}

}
