package ejercicio2;
import java.util.ArrayList;

import ejercicio3.Terna;

public class Carrera {

	private ArrayList<Atleta> atletas;

	public Carrera() {
		this.atletas = new ArrayList<Atleta>();
	}

	public void agregarAtleta(Atleta atleta) {
		Atleta atletaEncontrado = buscarAlteta(atleta);
		if (atletaEncontrado == null) {
			atletas.add(atleta);
		}
	}

	public Atleta buscarAlteta(Atleta atleta) {
		Atleta atleta1 = null;
		Atleta atletaABuscar;
		int i = 0;
		while (i < atletas.size() && atleta1 == null) {
			atletaABuscar = this.atletas.get(i);
			if (atletaABuscar.equals(atleta)) {
				atleta1 = atleta;
			}
			i++;
		}
		return atleta1;
	}

	public double obeterMejorTiempo() {
		double tiempo = 999999;

		for (Atleta atleta : atletas) {
			if (atleta.getSegundos() < tiempo) {
				tiempo = atleta.getSegundos();
			}
		}

		return tiempo;
	}

	public ArrayList<Atleta> getAtletasGanadores() {
		double mejorTiempo = obeterMejorTiempo();
		ArrayList<Atleta> atletasGanadores = new ArrayList<Atleta>();
		for (Atleta atleta : atletas) {
			if (atleta.getSegundos() == mejorTiempo) {
				atletasGanadores.add(atleta);
			}
		}
		return atletasGanadores;
	}

	@Override
	public String toString() {
		return "Carrera [atletas=" + atletas + "]";
	}

	public void mostrarGanadores(){
		ArrayList<Atleta> ganadores= getAtletasGanadores();
		System.out.println("Los atletas ganadores son: " );
		for (Atleta atleta : ganadores) {
			System.out.println(atleta);
		}
		
	}
	
	public void mostrarAtletas(){
		for (Atleta atleta : atletas) {
			System.out.println(atleta);
		}
	}

	public void mostrarTerna(){
		Terna terna=new Terna();
		terna.crearTerna(atletas);
		System.out.println(terna);
	}
}