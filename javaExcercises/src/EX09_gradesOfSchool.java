	/*ENGLISH: The program will ask us for 6 grades to enter, and at the end it will tell us how many 
	  students passed, how many had an "excellent" rating, and how many failed.
	  SPANISH: El programa nos pedirá 6 calificaciones a introducir, y al final nos dirá cuántos alumnos 
      aprobaron, cuántos tuvieron calificación de "excelencia", y cuántos reprobaron.*/

import java.util.Scanner;

public class EX09_gradesOfSchool {

	public static void main(String[] args) {
		int calif;
		Scanner sc = new Scanner(System.in);
		int aprobado = 0;
		int excelente = 0;
		int reprobado = 0;

		for (int contador=0; contador<6; contador++){
				do{System.out.println("Introduce la calificacion entre 1 y 10: ");
				calif=sc.nextInt();}while(calif<=0 || calif>10);//compruebo que sea mayor a 0 y menor a 11
				if (calif>=9) {excelente++;}
				if (calif>=7) {aprobado++;}		
				if (calif<7) {reprobado++;}
				System.out.println("------------Calif capturada---------------");
				} 
		
		System.out.println("Los aprobados fueron : "+aprobado);
		System.out.println("Los reprobados fueron : "+reprobado);
		System.out.println("Los nerdos fueron : "+excelente);
		sc.close();
	}

}
