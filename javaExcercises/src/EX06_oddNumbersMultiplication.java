	/*ENGLISH: Multiply all odd numbers until you enter 10 odd numbers and do not count 0's.
	  SPANISH: Multiplica todos los números impares hasta que introduzca 10 números impares y no cuenta 0´s.*/

import java.util.Scanner;

public class EX06_oddNumbersMultiplication {

	public static void main(String[] args) {

		int numero;
		int suma=0;
		int contador=0;
		try (Scanner sc = new Scanner(System.in)) {
			while (contador<10){
				System.out.println("Introduce el número: ");
				numero=sc.nextInt();
				if(numero==0) { }
				else if(numero%2!=0) {
					if (numero==1) {suma=numero+suma;}
					else if (contador==0) {suma=numero;} else {suma=numero*suma;}
					contador=contador+1; 
					System.out.println("La suma es: "+suma +", y el contador es: " +contador);

				}
		} 
		System.out.println("La multiplicación de todos los números impares es: "+suma);
	}
	}
}
