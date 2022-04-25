package ejercicio2;

//import java.util.ArrayList;

public class Main_ej2_TP1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Carrera carrera = new Carrera();
		//ArrayList<Atleta> ganadores;

		carrera.agregarAtleta(new Atleta(60, "Laura"));
		carrera.agregarAtleta(new Atleta(120, "Eugenia"));
		carrera.agregarAtleta(new Atleta(60, "Martin"));
		carrera.agregarAtleta(new Atleta(70, "María"));
		carrera.agregarAtleta(new Atleta(60, "Picard"));
		carrera.agregarAtleta(new Atleta(60, "Deana Troi"));

		carrera.toString();
		
		carrera.mostrarAtletas();
		carrera.mostrarGanadores();
	
		
		
		
		
	}

	/*
	 * Para los Juegos Olímpicos de la Juventud nos pidieron un programa con el
	 * cual podamos calcular quién fue el ganador de una carrera. Para eso
	 * ingresaremos un atleta y los segundos que ha empleado (con decimales)
	 * para recorrer la distancia de una especialidad determinada. Se debe tener
	 * en cuenta que puede haber más de un ganador (sus tiempos empleados fueron
	 * los mismos)
	 */

}
