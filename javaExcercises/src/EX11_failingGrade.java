	/*ENGLISH: We will be capturing the control number and qualification of each student, out of a total 
	  of 5 students. The program will show us on the screen which ones have failed.
	  SPANISH: Iremos capturando el número de control y calificación de cada alumno, de un total de 5 
	  alumnos. El programa nos irá mostrando en pantalla cuáles han reprobado.*/

import java.util.Scanner;

public class EX11_failingGrade {

	public static void main(String[] args) {

		int num;
		int mat=0;
		Scanner sc = new Scanner(System.in);
		
		for (int contador=0; contador<5; contador++){
				do{System.out.println("Introduce la calificacion: ");
				num=sc.nextInt();}while(num<=0);//compruebo que no sea cero o negativo
				do{System.out.println("Introduce la matricula: ");
				mat=sc.nextInt();}while(mat<0);//compruebo que no sea cero o negativo
				System.out.println("------------Calificacion y matricula capturada---------------");
				System.out.println("-------------------------------------------------------------");
				if (num<7) {System.out.println("El alumno con matricula " +mat +" esta reprobado"
					                           +" con una calificacion de "+num);}
		} 
		
		
		sc.close();
		
	}

}
