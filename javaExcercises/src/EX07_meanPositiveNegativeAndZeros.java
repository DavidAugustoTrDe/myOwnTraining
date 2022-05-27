	/*ENGLISH: We will capture 10 integers, and the program at the end will tell us of those 10 numbers,
      what is the average of the positives, what was the average of the negatives, and the number of 
      zeros entered.
      SPANISH: Capturaremos 10 n�meros enteros, y el programa al final nos dir� de esos 10 n�meros, 
	  cu�l es el promedio de los positivos, cu�l fue de los negativos, y la cantidad de ceros ingresados.*/

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
				System.out.println("Introduce el n�mero: ");
				numero=sc.nextInt();
				if(numero>0)  {contadorpos++; if (suma==0) {suma=numero;} else {suma=numero+suma;}}
				if(numero<0)  {contadorneg++; if (sumaneg==0) {sumaneg=-numero;} else {sumaneg=-numero+sumaneg;}}
				if(numero==0) {contadorzero++;}
				contador++;
				}
		} 
		float res = suma/contadorpos; float resneg = sumaneg/contadorneg; 
		System.out.println("El promedio de los n�meros positivos es : "+res);
		System.out.println("El promedio de los n�meros negativos es : "+resneg);
		System.out.println("El n�mero de los ceros es : "+contadorzero);

	}
	}


