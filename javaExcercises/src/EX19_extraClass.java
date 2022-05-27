    /*THIS IS A EXTRA CLASS, THE MAIN IS ON EX19_parkingBills.java
 
	  ENGLISH: Program that calculates the cost of parking in a parking lot.
	  The first 3 hours will be charged at 20 pesos. The following after 3 hours,
	  at 15 pesos. Until reaching the top of 250 pesos, for 24 hours.
	  If you remain parked for more than one day, 250 pesos per day will be charged.
	  And 15 pesos the following hours.
	  The user will be prompted to enter the number of hours, and should get the price. Use methods.
	  SPANISH: Programa que calcule el costo del estacionamiento en un parking. 
	  Las primeras 3 horas se cobrarán a 20 pesos. Las siguientes después de las 3 horas, 
	  a 15 pesos. Hasta llegar al tope de 250 pesos, para 24 horas.
	  Si se permanece aparcado por más de un día, se cobrarán 250 pesos por día. 
	  Y 15 pesos las horas siguientes. 
	  Se le pedirá al usuario ingresar la cantidad de horas, y debe obtener el precio. Usar métodos.*/

public class EX19_extraClass {

	private int horas;
	private int precio;
	private int precioplus;
	private int total;
	private int dias;
	private int rest;
	
public int getHoras() {
	return horas;
}

public void setHoras(int horas) {
	do{ if (horas>0) {this.horas = horas;} 
	else if (horas<=0) {System.out.println("The number have to be greater than 0");} 
	}while(horas<=0);
}

	public void displayCustomerDetails() {
		if (horas>=24) { rest=horas/24; horas=horas-(24*rest); precioplus=250*rest; }
		if(horas<=3 && horas>0) { precio=20; }
		else if(horas>3 && horas<24) { precio=20+((horas-3)*15); if(horas>15) { precio=250; } }
		total=precio+precioplus;
		dias=rest;
		System.out.println("Displaying ticket details \n***********");
		System.out.println("Amount of hours : " +horas);
		System.out.println("Amount of entire days : " + dias);
		System.out.println("Total amount of pay : " + total);
		System.out.println();
		
	}

}
