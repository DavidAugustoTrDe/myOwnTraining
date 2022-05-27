/*ENGLISH: Given two parallel arrays, one of them containing names of persons and 
the other containing their corresponding heights(in feet), arrange the persons in descending order of 
their heights and print the names. Both the arrays are of equal size (N) having unique elements.
Reading from standard input is already given and print the output to the standard output stream.
Input format:
First-line contains the array size ‘N’. Second-line contains the name of the persons separated by a 
comma and the third line contains the height of the respective persons separated by a comma.
Output format:
Print the comma-separated person names depending on the descending order of their heights.
SPANISH: Dadas dos matrices paralelas, una de ellas contiene nombres de personas 
y la otra que contengan sus alturas correspondientes (pies), ordene a las personas en orden descendente 
de su alturas e imprimir los nombres. Ambas matrices son del mismo tamaño (N) y tienen elementos únicos.
La lectura de la entrada estándar ya está dada e imprime la salida en el flujo de salida estándar.
Formato de entrada:
La primera línea contiene el tamaño de matriz 'N'. La segunda línea contiene el nombre de las personas separadas por un
coma y la tercera línea contiene la altura de las respectivas personas separadas por una coma.
Formato de salida:
Escriba los nombres de las personas separados por comas según el orden descendente de sus alturas.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EXmock1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de personas: ");
		int arraySize = sc.nextInt();
		String names;
		String heights;
		int cont=0; float maximo=0; float minimo=0; int maxcont=0; int mincont=0;
		List<String> nombres = new ArrayList<String>(); 
		List<Float> alturas = new ArrayList<Float>(); 
	
		do{System.out.println("Introduce " +arraySize +" nombres: ");
		names=sc.next(); nombres.add(names); cont++;}while(cont<arraySize);
		cont=0;
		do{System.out.println("Introduce " +arraySize +" alturas: ");
		heights=sc.next(); alturas.add(Float.parseFloat(heights)); cont++;}while(cont<arraySize);
		
		sc.close();
		
		for (int contador=1; contador<=alturas.size(); contador++){
			if(alturas.get(contador)>alturas.get(contador-1)) { maximo=alturas.get(contador); maxcont=contador; }
			if (alturas.get(0)>maximo) { maximo=alturas.get(0); maxcont=0;}
			if(alturas.get(contador)<alturas.get(contador-1)) { minimo=alturas.get(contador); mincont=contador;}
			if (alturas.get(0)<minimo) { minimo=alturas.get(0); mincont=0;}
		}
		
		for (int contador=0; contador<=alturas.size(); contador++){
			if(alturas.get(contador)>alturas.get(contador-1)) { maximo=alturas.get(contador); maxcont=contador; }
			if (alturas.get(0)>maximo) { maximo=alturas.get(0); maxcont=0;}
			if(alturas.get(contador)<alturas.get(contador-1)) { minimo=alturas.get(contador); mincont=contador;}
			if (alturas.get(0)<minimo) { minimo=alturas.get(0); mincont=0;}
		}
		
		System.out.println(nombres);
		System.out.println(alturas);
		System.out.println(maximo);
		System.out.println(minimo);


		
	}

}
