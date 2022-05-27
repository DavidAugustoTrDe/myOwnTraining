	/*ENGLISH: This program will ask for an indefinite number of numbers, and the moment the user
      type a zero, it will stop asking for more numbers. At the end it will show the sum of all 
      the numbers introduced.
      SPANISH: Este programa pedirá una indefinida cantidad de números, y en el momento en que el usuario 
      teclee un cero, dejará de pedir más números. Al final mostrará la suma de todos los números 
      introducidos.*/

import java.util.Scanner;

public class EX04_suminsteadzero {

	public static void main(String[] args) {
		int numero=0;
		int suma=0;
		try (Scanner sc = new Scanner(System.in)) {
			do
			{
				System.out.println("Introduce el número: ");
				numero=sc.nextInt();
				suma=numero+suma;
				
				
			}while(numero!=0);
		} 
		System.out.println("La suma de todos los números es: "+suma);
	}
}
