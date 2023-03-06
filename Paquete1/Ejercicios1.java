package Paquete1;

public class Ejercicios1 {

	public static void main(String[] args) {
		// Ejercicio 1
		// Apartado "a"
		int a = 15;
		int b = 20;
		System.out.println("Todos los numeros: ");
		while (a <=  b) {
			System.out.println(a);
			a++;
		}
		// Apartado "b"
		a = 15; // Vuelvo a settear el valor de "a" en 15
		System.out.println("Numeros pares: ");
		while (a <= b) {
			if (a%2 == 0) {
				System.out.println(a);
			}
			a++;
		}
		// Apartado "d"
		a = 15;
		System.out.println("Numeros pares usando for: ");
		for (int i=15; i <= b; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		// Ejercicio 2
		float ingresos = 4890803; // ingresos totales
		int cantidadDeVeiculos = 0; //esta seria la cantidad de vehiculos con una antiguedad menor a 5 años
		int cantidadDeInmuebles = 0; // cantidad de inmuebles
		boolean vehiculoDeLujo = false; // booleano que indica si tienen o no un vhiculo de lujo
		
		// por ahora no nos enseñaron a que el usuario introduzca datos por consola asi que hay que modificar manualmente los datos de entrada
		
		if ((ingresos >= 489083) && (cantidadDeVeiculos >= 3) && (cantidadDeInmuebles >= 3) && (vehiculoDeLujo == true) ) {
			System.out.println("Pertenece al grupo de ingresos altos");
		}
		else {
			System.out.println("No pertence al grupo de ingresos altos");
		}
	}

}
