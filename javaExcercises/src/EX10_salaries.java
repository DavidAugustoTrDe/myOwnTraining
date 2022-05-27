	/*ENGLISH: The program will ask to choose the amount of salaries, and then we introduce them with 
      the keyboard. At the end it will show on the screen which salary is the highest.
      SPANISH: El programa pedirá elegir la cantidad de sueldos, y después los introducimos con el 
      teclado. Al final mostrará en pantalla cuál sueldo es el mayor.*/

import java.util.Scanner;

public class EX10_salaries {

	public static void main(String[] args) {
		
		int num;
		int comp=0;
		int contadorminus;
		Scanner sc = new Scanner(System.in);
		do{System.out.println("Introduce la cantidad de sueldos: ");
		num=sc.nextInt();}while(num<0);//compruebo que sea mayor a 0 
		int[] sueldo = new int [num];	
		for (int contador=0; contador<num; contador++){
				do{System.out.println("Introduce el sueldo: ");
				sueldo[contador]=sc.nextInt();}while(sueldo[contador]<=0);//compruebo que no sea cero o negativo
				System.out.println("------------Sueldo capturado---------------");
		} 
		for (int contador=1; contador<num; contador++){
			contadorminus=contador-1;
			if (sueldo[contador]>=sueldo[contadorminus]) {
				comp=sueldo[contador]; 
			} 
		}
		System.out.println("El sueldo mayor fue : "+comp);
		sc.close();
	}

}
