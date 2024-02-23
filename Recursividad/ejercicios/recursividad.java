package ejercicios;

public class recursividad {

	public static void main(String[] args) {

		/*imprimirHastaN(10);
		System.out.println("--------");
		imprimirdesdeN(10);*/

		//System.out.println(obtenerCantidad(444444));

		//System.out.println(potencias(3,3));

		//invertir(123);
		
		//System.out.println(palabraOrdenada("1234"));
		System.out.println(palindromo("radar"));
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

	public static void invertir(int n) {


		if (n < 10) {
			System.out.print(n);
		} else {

			System.out.print(n % 10);
			invertir(n / 10);

		}
	}

	public static boolean palabraOrdenada(String str) {

		if (str.length() <= 1) {
            return true;
        } else {
            if (str.charAt(0) <= str.charAt(1)) {
                return palabraOrdenada(str.substring(1));
            } else {
                return false;
            }
        }
		
	}
	
	public static boolean palindromo(String str) {

		if (str.length() == 1 || str.length() == 0) {
            return true;
        } else {
            if (str.charAt(0) == str.charAt(str.length()-1)) {
                return palindromo(str.substring(1,str.length()-1));
            } else {
                return false;
            }
        }
		
	}

}
