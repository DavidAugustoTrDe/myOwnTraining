	/*ENGLISH: Using a while loop, we will make this program. We will be asked for an indeterminate 
      amount of numbers, provided they are only positive. And the program will add those numbers, and
      you will get your average.
      SPANISH: Usando un ciclo while, haremos este programa. Se nos pedirán una indeterminada cantidad de 
      números, con la condición que sólo sean positivos. Y el programa sumará esos números, y 
      obtendrá su promedio.*/

import java.util.Scanner;
	
public class EX05_meanAndPositive {

	public static void main(String[] args) {
		int numero=0,suma=0, cantidad=0;
		double res=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce un número positivo: ");
			numero=sc.nextInt();
				while(numero>0)
				{
					suma=suma+numero;
					cantidad++;
					System.out.println("Introduce otro número positivo: ");
					numero=sc.nextInt();

				}
		} 
		res=suma/cantidad;
		System.out.println("El promedio es de: "+res);
	}

}
