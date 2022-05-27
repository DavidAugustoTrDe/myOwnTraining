	/*ENGLISH: The program asks us to enter 5 integers, and at the end, it will show them upside down.
	  SPANISH: El programa nos pide introducir 5 números enteros, y al final, los mostrará al revés.*/

import java.util.Scanner;

public class EX12_inverseNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] sueldo = new int [5];	

		for (int contador=0; contador<5; contador++){
				do{System.out.println("Introduce un numero: ");
				sueldo[contador]=sc.nextInt();}while(sueldo[contador]<=0);//compruebo que no sea cero o negativo
				System.out.println("------------Numero capturado---------------");
		} 
		
		sc.close();
		System.out.println("Los numeros inversos son: ");

		for (int contador=4; contador>=0; contador--){
			System.out.println(sueldo[contador]);
		} 
		
	}

}
