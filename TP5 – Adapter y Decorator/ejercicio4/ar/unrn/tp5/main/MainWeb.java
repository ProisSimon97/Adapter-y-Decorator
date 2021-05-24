package ar.unrn.tp5.main;

import ar.unrn.tp5.modelo.RestCall;
import ar.unrn.tp5.modelo.RestCallBase;
import ar.unrn.tp5.modelo.RestCallDisco;
import ar.unrn.tp5.modelo.RestCallPersistencia;

public class MainWeb {
	public static void main(String[] args) {

		RestCall rest = new RestCallDisco(new RestCallBase("https://jsonplaceholder.typicode.com/posts"),
				"C:\\Users\\Simón\\Downloads\\UNRN\\Materias 3ro\\OO2\\Trabajos\\TP5\\archivo_punto4.txt");

		RestCall rest2 = new RestCallPersistencia(new RestCallBase("https://jsonplaceholder.typicode.com/posts"),
				"jdbc:mysql://localhost:3306/tp5_ejercicio4");

		RestCall rest3 = new RestCallPersistencia(
				new RestCallDisco(new RestCallBase("https://jsonplaceholder.typicode.com/posts"),
						"C:\\Users\\Simón\\Downloads\\UNRN\\Materias 3ro\\OO2\\Trabajos\\TP5\\archivo_punto4.txt"),
				"jdbc:mysql://localhost:3306/tp5_ejercicio4");

		try {
			System.out.println(rest.run());
			System.out.println(rest2.run());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}