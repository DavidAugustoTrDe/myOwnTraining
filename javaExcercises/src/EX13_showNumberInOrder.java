	/*ENGLISH: We will create an array of 10 positions, which we will fill with 10 integers.
      At the moment of printing that array, we will do it with the following order in the numbers:
      first, last, second, penultimate, third.
	  SPANISH: Crearemos un arreglo de 10 posiciones, el cual llenaremos con 10 números enteros. 
      Al momento de imprimir ese arreglo, lo haremos con el siguiente orden en los números : 
      primero, último, segundo, penúltimo, tercero.*/

import java.util.Scanner;

public class EX13_showNumberInOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int [10];	

		for (int contador=0; contador<num.length; contador++){
				do{System.out.println("Introduce un numero: ");
				num[contador]=sc.nextInt();}while(num[contador]<=0);//compruebo que no sea cero o negativo
				System.out.println("------------Numero capturado---------------");
		} 
		
		sc.close();
		System.out.println("Los numeros inversos son: ");

		for (int contador=0; contador<5; contador++){
			System.out.println(num[contador]);
			System.out.println(num[9-contador]);
		
		} 
		
	}

}
