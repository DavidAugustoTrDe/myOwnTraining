	/*ENGLISH: The program will ask us for the number of pieces, and the price per piece. If 100 were 
	  bought or more pieces, a 20% discount will be applied. We will create a method that tells us 
	  how much it will be the total to pay.
 	  SPANISH: El programa nos pedir� el n�mero de piezas, y el precio por pieza. Si se compraron 100
 	  o m�s piezas, se aplicar� un descuento del 20%. Crearemos un m�todo que nos diga cu�nto ser� 
 	  el total a pagar.*/

public class EX18_totalPayAndDiscount {

	public static void main(String[] args) {

		EX18_extraClass numero = new EX18_extraClass();
		
		numero.setNumpiezas(101);
		numero.setPrecio(1);
		numero.displayCustomerDetails();
	}

}
