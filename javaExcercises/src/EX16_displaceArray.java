	/*ENGLISH: We will create an array of 10 positions, where we will store 10 integers, and
	  subsequently, we will move each number one position forward.
	  SPANISH: Crearemos un arreglo de 10 posiciones, donde almacenaremos 10 números enteros,y 
	  posteriormente, desplazaremos cada número una posición adelante.*/

import java.util.Scanner;

public class EX16_displaceArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int [12];
		int[] num2 = new int [12];	
		int contador2=0;
		
		for (int contador=0; contador<num.length; contador++){
				do{System.out.println("Introduce un numero del array: ");
				num[contador]=sc.nextInt();}while(num[contador]<0);//compruebo que no sea negativo
				System.out.println("------------Numero capturado---------------");
		} 
		
		for (int contador=0; contador<num2.length; contador++){
				if (contador==0) { num2[contador]=num[num.length-1]; }
				else {num2[contador]=num[contador2]; contador2++; }
		} 
		
		sc.close();
		
		System.out.println("El orden de los numeros es: ");
		
		for (int contador=0; contador<num2.length; contador++){
			System.out.println(num2[contador]);
		}
		
	}

}
