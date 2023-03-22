package TP4;
import java.util.Scanner;

public class Ejercicios1c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		if (a == 0) {
			System.out.println("Ingrese un número entero: ");
			a = sc.nextInt();
		}
		if (b == 0) {
			System.out.println("Ingrese un número entero: ");
        	b = sc.nextInt();
		}
		if (c == 0) {
			System.out.println("Ingrese un número entero: ");
        	c = sc.nextInt();
		}
        System.out.println("Desea que se ordene de forma ascendente? (true = si, false = no): ");
        boolean Asendente = sc.nextBoolean();
		int [] numeros = Ordenar (a,b,c,Asendente);
		System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2]);
		sc.close();
	}
	private static int [] Ordenar (int a1,int b1,int c1,boolean Asendente1) {
		int[] arregloOrdenado = new int[3];
		if (a1 > b1) {
			int temp = a1;
			a1 = b1;
			b1 = temp;
		}
		if (a1 > c1) {
			int temp = a1;
			a1 = c1;
			c1 = temp;
		}
		if (b1 > c1) {
			int temp = b1;
			b1 = c1;
			c1 = temp;
		}
		if (Asendente1 == true) {
			arregloOrdenado [0] = a1;
			arregloOrdenado [1] = b1;
			arregloOrdenado [2] = c1;
		}
		else {
			arregloOrdenado [0] = c1;
			arregloOrdenado [1] = b1;
			arregloOrdenado [2] = a1;
		}
		return arregloOrdenado;
	}
}
