package es.juana.daw;

import java.util.Scanner;

public class Preba {

	public static void main(String[] args) throws HectorException{

		/*try {
			division();
		}catch(HectorException h){

		}*/

		//array();
		/*String cadena = "La verdad que David ha aprobado programacion gracias a copiarme, pero bueno sin más";
		char deli = ' ';
		String[] palabras = split(cadena, deli);
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}*/
		
		System.out.println(factorial(5));

	}

	public static int division(int i, int j) throws HectorException{

		

	
		int n1 = i;

		
		int n2 = j;

		int div;

		if(n2 == 0) {

			throw new HectorException("NO ESTA PERMITIDO DIVIDIR ENTRE CERO");

		}else {

			div = n1/n2;

		}

		return div;

	}

	public static void array() throws HectorException{

		Scanner sc = new Scanner(System.in);

		int[] array = {1,2,3,4,5};

		System.out.println("Dime la posicion a la que quieres acceder");
		int n1 = sc.nextInt();

		if(n1 > array.length || n1 < 0) {

			throw new HectorException("FUERA DE RANGO");

		}else {

			System.out.println(array[n1]);

		}

	}

	public static void leerCadena() throws HectorException {

		System.out.println("Dime un número");

		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();

		Integer x = null;

		for (int i = 0; i < cadena.length(); i++) {

			if(cadena.charAt(i) == '1' || cadena.charAt(i) == '2' || cadena.charAt(i) == '3' || cadena.charAt(i) == '4' || cadena.charAt(i) == '5' || cadena.charAt(i) == '6' || cadena.charAt(i) == '7' || cadena.charAt(i) == '8' || cadena.charAt(i) == '9') {



			}else {

				throw new HectorException("NO SE PUEDE CONVERTIR LA CADENA");
			}
		}

		x = Integer.parseInt(cadena);

		System.out.println(x);
	}

	public static String[] split(String cadena, char deli) throws HectorException {

		int delimitadores = 0;

		for (int i = 0; i < cadena.length(); i++) {

			if(cadena.charAt(i) == deli) {
				delimitadores++;
			}
		}

		String[] array = new String[delimitadores+1];


		if(delimitadores == 0) {

			throw new HectorException("NO SE PUEDE CONVERTIR LA CADENA");

		}

		int inicioLectura = 0;

		for (int i = 0; i < array.length; i++) {

			array[i] = "";

			int actual = inicioLectura;

			for ( inicioLectura = actual; inicioLectura < cadena.length(); inicioLectura++) {

				if(cadena.charAt(inicioLectura) != deli) {

					array[i] += cadena.charAt(inicioLectura);

				}else {

					inicioLectura++;
					break;

				}
			}

		}

		return array;
	}
	
	public static int factorial(int num) throws HectorException {
		
		if(num < 0 && num > 99999) {
			
			throw new HectorException("NO SE PUEDE FACTORIZAR EL NUMERO");
			
		}
		
		int resultado = 1;
		
		for (int i = 1; i <= num; i++) {
			
			resultado *= i;
			
		}
		
		return resultado;
		
	}
}
