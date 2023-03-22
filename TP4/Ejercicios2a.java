package TP4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.lang.Integer;

public class Ejercicios2a {

	public static void main(String[] args) throws IOException {
		List<String> numeros = Files.readAllLines(Paths.get("C:\\Users\\Seba\\Desktop\\Curso Java\\CursoJava\\src\\TP4\\numeros.txt"));
		int sum = 0;
		int mul = 1;
		for (int i=0;i<numeros.size();i++) {
			sum = sum + Integer.parseInt(numeros.get(i));
			mul = mul * Integer.parseInt(numeros.get(i));
		}
		System.out.println("La suma es: " + sum);
		System.out.println("El producto es: " + mul);
	}
}
