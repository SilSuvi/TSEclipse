
public class ClaseInteger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creaci�n de un objeto Integer usando el segundo constructor
		Integer num1 = new Integer("125");
		// Creaci�n de un objeto Integer usando el primer constructor
		Integer num2 = new Integer(20);
		
		// Obtenci�n del entero que almacena objeto integer
		// Si no se realiza esto, las l�neas siguientes dar�an
		// error de compilaci�n
		
		int n1 = num1.intValue();
		int n2 = num2.intValue();
		
		System.out.println("La suma de " + n1 + " y " + n2 + " equivale a " + (n1 + n2));
		
		if (n1 + n2 > 130) 
			n1++;
		else 
			n1--;
		
		System.out.println(n1);
	}

}
