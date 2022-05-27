	/*THIS IS AN EXTRA CLASS FROM THE EXCERCISE 18, THE MAIN CLASS IS ON EX18_totalPayAndDiscount.java
	 
	  ENGLISH: The program will ask us for the number of pieces, and the price per piece. If 100 were 
	  bought or more pieces, a 20% discount will be applied. We will create a method that tells us 
	  how much it will be the total to pay.
 	  SPANISH: El programa nos pedirá el número de piezas, y el precio por pieza. Si se compraron 100
 	  o más piezas, se aplicará un descuento del 20%. Crearemos un método que nos diga cuánto será 
 	  el total a pagar.*/

public class EX18_extraClass {
	
	
		private int numpiezas;
		private int precio;
		private int preciototal;
		private double preciodescuento;
		
			
	public int getNumpiezas() {
		return numpiezas;
	}

	public void setNumpiezas(int numpiezas) {
		do{ if (numpiezas>0) {this.numpiezas = numpiezas;} 
		else if (numpiezas<=0) {System.out.println("The number have to be greater than 0");} 
		}while(numpiezas<=0);
		}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		do{ if (precio>0) {this.precio = precio;} 
		else if (precio<=0) {System.out.println("The number have to be greater than 0");} 
		}while(precio<=0);
	}

		public void displayCustomerDetails() {
			preciototal=numpiezas*precio;
			if (numpiezas>=100) {final double descuento=0.2; preciodescuento=(preciototal*(1-descuento));}
			System.out.println("Displaying ticket details \n***********");
			System.out.println("Amount of products : " + numpiezas);
			System.out.println("Price of each product : " + precio);
			System.out.println("Price of all products (before discount) : " + preciototal);
			System.out.println("Price of all products (after discount)  : " + preciodescuento);
			System.out.println();
			
		}
		
}
