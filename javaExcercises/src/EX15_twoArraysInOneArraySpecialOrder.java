	/*ENGLISH: Another exercise using arrays. We will fill two arrays, A and B, with 12 integers
      each. And we will put those numbers in a third array C, but in a special way:
      3 numbers from A, then 3 numbers from B. Then another 3 numbers from A,
      then another 3 numbers of B... etc.
	  SPANISH: Otro ejercicio usando arreglos. Rellenaremos dos arreglos, A y B, con 12 números enteros 
      cada uno. Y pondremos en un tercer arreglo C esos números, pero de manera especial: 
      3 números de A, luego 3 números de B. Luego, otros 3 números de A, 
      luego otros 3 números de B... etc.*/

import java.util.Scanner;

public class EX15_twoArraysInOneArraySpecialOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int [12];
		int[] num2 = new int [12];	
		int[] num3 = new int [24];	
		int contador2=0;
		
		for (int contador=0; contador<num.length; contador++){
				do{System.out.println("Introduce un numero del primer array: ");
				num[contador]=sc.nextInt();}while(num[contador]<0);//compruebo que no sea negativo
				System.out.println("------------Numero capturado---------------");
		} 
		for (int contador=0; contador<num2.length; contador++){
			do{System.out.println("Introduce un numero del segundo array: ");
			num2[contador]=sc.nextInt();}while(num2[contador]<0);//compruebo que no sea negativo
			System.out.println("------------Numero capturado---------------");
		} 
		
		sc.close();
		
		int i=0;
		
		while (i<12) {
		for (int contador=0; contador<3; contador++){ //cada 3 numeros se brinca al siguiente loop
			num3[contador2]=num[i+contador]; contador2++; }  
		for (int contador=0; contador<3; contador++){
			num3[contador2]=num2[i+contador]; contador2++; }
		i+=3;
		}
		System.out.println("El orden de los numeros es: ");
		
		for (int contador=0; contador<num3.length; contador++){
			System.out.println(num3[contador]);
		}

		
		
	}

}
