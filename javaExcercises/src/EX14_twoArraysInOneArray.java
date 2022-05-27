	/*ENGLISH: We will create two arrays, "a" and "b", and store 10 numbers in each. Subsequently,
      in a third array "c", we will store the numbers from array "a" and array "b", in
      this order: The first from a, the first from b, the second from a, the second from b,
      the third from a, the third from b, etc.
	  SPANISH: Crearemos dos arrays, "a" y "b", y almacenaremos 10 números en cada uno. Posteriormente, 
      en un tercer arreglo "c", guardaremos los números del arreglo "a" y el arreglo "b", en 
      este orden: El primero de a, el primero de b, el segundo de a, el segundo de b, 
      el tercero de a, el tercero de b, etc.¨*/

import java.util.Scanner;

public class EX14_twoArraysInOneArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int [10];
		int[] num2 = new int [10];	
		int[] num3 = new int [20];	
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
		for (int contador=0; contador<num3.length; contador++){
			if (contador==0) { num3[contador]=num[contador2]; } //cuando en el array sea cero le pongo el valor del array del primer array 
			else if (contador%2==0) { num3[contador]=num[contador2];} 			
			if (contador%2==1 && contador!=0) {contador2++;}//dejo pasar dos espacios en el tercer array para que pueda escribir del primer espacio de los array1 y array2
		}  
		contador2=0;
		for (int contador=0; contador<num3.length; contador++){
			if (contador%2==1) { num3[contador]=num2[contador2];}
			if (contador%2==1) {contador2++;}//same shit de arriba pero solamente que en este loop se escriben 
		}  
		
		System.out.println("El orden de los numeros es: ");
		
		for (int contador=0; contador<num3.length; contador++){
			System.out.println(num3[contador]);
		}

		
	}

}
