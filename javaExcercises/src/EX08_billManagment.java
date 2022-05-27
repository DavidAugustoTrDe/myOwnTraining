	/*ENGLISH: The program will manage invoices of a sugar company, which is responsible for the sale
      per kilogram; the invoice will ask for the product code, the number of kilos, the price per
      each kilogram, and the amount of that bill. In addition, for every 5 invoices, it will tell us 
      which of them exceeded the amount of $1000, and it will give us the total billing of those 5 bills.
      SPANISH: El programa es para gestionar facturas de una empresa azucarera, que se encarga de la venta 
      por kilos; la factura pedirá el código del producto, la cantidad de kilos, el precio por 
      cada kilo, y el importe de esa factura. Además, por cada 5 facturas, nos dirá cuál de ellas 
      sobrepasó la cantidad de $1000, y nos dará la facturación total de esas 5 facturas.*/

import java.util.Scanner;
import java.util.ArrayList; // Importing the ArrayList class
import java.util.List;

public class EX08_billManagment {

	public static void main(String[] args) {
		
		String codigo = " ";
		int kilos;
		int precio;
		int importe;
		int total=0;
		Scanner sc = new Scanner(System.in);
		List<String> sobrepaso = new ArrayList<String>(); //uso de arraylist, muy util
		for (int contador=0; contador<5; contador++){
				do{System.out.println("Introduce el código de producto: ");
				codigo=sc.next();}while(codigo==null); //compruebo que no esté vacío
				do{System.out.println("Introduce la cantidad de kilos: ");
				kilos=sc.nextInt();}while(kilos==0 && kilos<0);//compruebo que sea mayor a 0
				do{System.out.println("Introduce el precio por kilo: ");
				precio=sc.nextInt();}while(precio==0 && precio<0);//compruebo que sea mayor a 0
				importe=kilos*precio;
				Integer importestr = importe;//lo hago objeto para poder convertir a string
				importestr.toString();//convierto a string
				if (importe>1000) {sobrepaso.add(codigo +" - con un importe de: " +importestr); //cont++;
				total=importe+total;}
				System.out.println("--------------------------------------");
				} 
		
		System.out.println("Los productos mayores a 1000 pesos en el importe son:");
		System.out.println(sobrepaso);
		sc.close();
	
	}
}
	
