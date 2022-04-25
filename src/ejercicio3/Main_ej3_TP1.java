package ejercicio3;

import ejercicio2.Atleta;
import ejercicio2.Carrera;

public class Main_ej3_TP1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Carrera carrera = new Carrera();

		carrera.agregarAtleta(new Atleta(60, "Laura"));
		carrera.agregarAtleta(new Atleta(120, "Eugenia"));
		carrera.agregarAtleta(new Atleta(60, "Martin"));
		carrera.agregarAtleta(new Atleta(70, "María"));
		carrera.agregarAtleta(new Atleta(60, "Picard"));
		carrera.agregarAtleta(new Atleta(60, "Deana Troi"));

		carrera.mostrarTerna();
	}
}
