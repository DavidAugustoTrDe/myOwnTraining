	 /*ENGLISH: We will enter 5 integers in an array of size 10, ordered and in a way
       growing. Later, we will enter a number, and it will be inserted in the appropriate place,
	   for the array to continue ordered, numbers from smallest to largest.
       SPANISH: Ingresaremos 5 números enteros en un arreglo de tamaño de 10, ordenados y de manera 
	   creciente. Posteriormente, ingresaremos un número, y éste se insertará en el lugar adecuado, 
	   para que el arreglo continúe ordenado, números de menor a mayor.*/

import java.util.Scanner;

public class EX17_arrayInOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int [10];
		int valor;
		
		for (int contador=0; contador<num.length; contador++){
			if(contador==0) {
				do{System.out.println("Introduce un numero del array: ");
				num[contador]=sc.nextInt();}while(num[contador]<0);//compruebo que no sea negativo 
				System.out.println("------------Numero capturado---------------");
			}
			else if(contador%2==0) {
				do{System.out.println("Introduce un numero del array mayor al anterior: ");
				num[contador]=sc.nextInt();}while(num[contador-2]>=num[contador]);//compruebo que sea mayor que el valor agreagado anteriormente 
				System.out.println("------------Numero capturado---------------");
			}
			
		} 
		
		do{System.out.println("Introduce un numero del array para ordenarlo: ");
		valor=sc.nextInt();}while(valor<0);//compruebo que no sea negativo 	
		System.out.println("------------Numero capturado---------------");

		sc.close();
		
		for (int contador=0; contador<6; contador++){ //Llego hasta la mitad porque dentro de las instrucciones tengo un +2
				if (num[0]==valor) {num[1]=valor; break; } //si es menor al primer espacio del array se coloca en el primero	
				else if((num[contador]<=valor) && (num[contador+2]>valor)) {num[contador+1]=valor;} //comparo el 0. con el 2, el 2 con el 4...
				else if ((num[contador]==valor) || (num[contador+2]==valor)) {num[contador+1]=valor; break; }
				else if (num[8]<=valor) {num[9]=valor; break; } //si es mayor al penultimo espacio del array se coloca en el ultimo
		}
				
		for (int contador=0; contador<num.length; contador++){
			if(num[contador]!=0) {System.out.println(num[contador]);} //Solamente imprimo numeros que no sean ceros
		}
		
	}

}
