package TP4;

public class Ejercicios1a {

	public static void main(String[] args) {
		int a = 21;
		int b = 17;
		int c = 31;
		boolean Asendente = false; //Simplemente con cambiar el valor del booleano ordena asendente o desendente
		int [] numeros = Ordenar (a,b,c,Asendente);
		System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2]);
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
