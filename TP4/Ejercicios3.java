package TP4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicios3 {
	public static void main(String[] args) throws IOException {
		List<String> nombres = Files.readAllLines(Paths.get("C:\\Users\\Seba\\Desktop\\Curso Java\\CursoJava\\src\\TP4\\nombres.txt"));
		System.out.println(nombres);
		String nombresString = nombres.get(0);
		String[] nombresSplit = nombresString.split(" ");
		for (int i=0;i<nombresSplit.length;i++) {
			System.out.println(nombresSplit[i]);
		}
	}
}