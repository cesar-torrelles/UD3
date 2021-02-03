
public class ejercicio5 {

	public static void main(String[] args) {
		//Valores iniciales
		 int A = 1;
		 int B = 2;
		 int C = 3;
		 int D = 4;
		 
		//se imprimen los valores iniciales
		System.out.println("A vale = "+A);
		System.out.println("B vale = "+B);
		System.out.println("C vale = "+C);
		System.out.println("D vale = "+D);
		System.out.println();
		
		//guardamos los valores iniciales en otras variables para no perderlos
		int a = A; 
		int b = B;
		int c = C;
		int d = D;
		
		//aplicamos el ejercicio que se nos pide, usando los valores guardados en las nuevas variables
		B = c;
		C = a;
		A = d;
		D = b;
		
		System.out.println();
		// imprimimos los datos de los nuevos valores que deseamos para nuestras variables iniciales
		System.out.println("Se desea que:\n" +
				"B = C\n" + 
				"C = A\n" + 
				"A = D\n" + 
				"D = B");

		System.out.println();

		// se imprimen los valores nuevos
		System.out.println("Por lo tanto:");
		System.out.println("A ahora vale = "+A);
		System.out.println("B ahora vale = "+B);
		System.out.println("C ahora vale = "+C);
		System.out.println("D ahora vale = "+D);
		
	}

}
