	/*ENGLISH: We will capture 10 integers, and the program at the end will tell us of those 10 numbers,
      what is the average of the positives, what was the average of the negatives, and the number of 
      zeros entered.
      SPANISH: Capturaremos 10 números enteros, y el programa al final nos dirá de esos 10 números, 
	  cuál es el promedio de los positivos, cuál fue de los negativos, y la cantidad de ceros ingresados.*/

import java.util.Scanner;

public class EX07_meanPositiveNegativeAndZeros {

	public static void main(String[] args) {
		int numero;
		int suma=0;
		int sumaneg=0;
		int contador=0;
		int contadorpos=0;
		int contadorneg=0;
		int contadorzero=0;
		try (Scanner sc = new Scanner(System.in)) {
			while (contador<10){
				System.out.println("Introduce el número: ");
				numero=sc.nextInt();
				if(numero>0)  {contadorpos++; if (suma==0) {suma=numero;} else {suma=numero+suma;}}
				if(numero<0)  {contadorneg++; if (sumaneg==0) {sumaneg=-numero;} else {sumaneg=-numero+sumaneg;}}
				if(numero==0) {contadorzero++;}
				contador++;
				}
		} 
		float res = suma/contadorpos; float resneg = sumaneg/contadorneg; 
		System.out.println("El promedio de los números positivos es : "+res);
		System.out.println("El promedio de los números negativos es : "+resneg);
		System.out.println("El número de los ceros es : "+contadorzero);

	}
	}


