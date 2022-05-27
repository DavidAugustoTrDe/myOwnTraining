	/*ENGLISH: Program that calculates the cost of parking in a parking lot.
	  The first 3 hours will be charged at 20 pesos. The following after 3 hours,
	  at 15 pesos. Until reaching the top of 250 pesos, for 24 hours.
	  If you remain parked for more than one day, 250 pesos per day will be charged.
	  And 15 pesos the following hours.
	  The user will be prompted to enter the number of hours, and should get the price. Use methods.
	  SPANISH: Programa que calcule el costo del estacionamiento en un parking. 
	  Las primeras 3 horas se cobrar�n a 20 pesos. Las siguientes despu�s de las 3 horas, 
	  a 15 pesos. Hasta llegar al tope de 250 pesos, para 24 horas.
	  Si se permanece aparcado por m�s de un d�a, se cobrar�n 250 pesos por d�a. 
	  Y 15 pesos las horas siguientes. 
	  Se le pedir� al usuario ingresar la cantidad de horas, y debe obtener el precio. Usar m�todos.*/


public class EX19_parkingPayBill {

	public static void main(String[] args) {

		EX19_extraClass park = new EX19_extraClass();
		
		park.setHoras(40);
		park.displayCustomerDetails();

	}

}


