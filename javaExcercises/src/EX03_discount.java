	/*ENGLISH: A piece of bread costs $5.
	  If there are more than 50 pieces were purchased, each piece will cost $4.5
      If there are more than 100 were purchased, each piece will cost $4.
      SPANISH: La pieza de pan cuesta a $5.
	  Si se compraron más de 50 piezas, cada pieza costará a $4.5
      Si se compraron más de 100, cada pieza costará a $4.*/

public class EX03_discount {

	public static void main(String[] args) {
		int piezas = 101;
		double precio = 5;
		double total;
		if (piezas>50)
		{
			precio=4.5;
			if (piezas>100)
			{
				precio=4;
			}
			
		}
		total = piezas*precio;
		System.out.println("El precio por las " +piezas +" piezas de pan es de: " +total+ " pesos.");
	}

}
