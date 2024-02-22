package ejercicios;

public class recursividad {

	public static void main(String[] args) {

		/*imprimirHastaN(10);
		System.out.println("--------");
		imprimirdesdeN(10);*/

		//System.out.println(obtenerCantidad(444444));

		System.out.println(potencias(3,3));
		System.out.println(3^7);
	}

	public static int sumaN(int n) {

		if(n==1) {
			return 1;
		}

		return n + sumaN(n-1);

	}

	public static void imprimirHastaN(int n) {

		if(n>1) {
			imprimirHastaN(n-1);
		}
		System.out.println(n);

	}

	public static void imprimirdesdeN(int n) {

		System.out.println(n);

		if(n>1) {
			imprimirdesdeN(n-1);
		}
	}

	public static int obtenerCantidad(int n) {


		if(n == 0) {
			return 0;
		}

		return 1+obtenerCantidad(n/10);

	}

	public static int fibonacci(int n) {


		if(n == 0 || n == 1) {
			return n;
		}

		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static int potencias(int n, int n2) {


		if(n2 == 0) {
			return 1;
		}

		return n * potencias(n ,n2-1);
	}

}
