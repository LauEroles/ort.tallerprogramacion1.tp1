package ejercicio3;
import java.util.ArrayList;
import ejercicio2.Atleta;

public class Terna {
	ArrayList<Atleta> ganadoresPosicion1;
	ArrayList<Atleta> ganadoresPosicion2;
	ArrayList<Atleta> ganadoresPosicion3;

	public Terna() {
		ganadoresPosicion1 = new ArrayList<>();
		ganadoresPosicion2 = new ArrayList<>();
		ganadoresPosicion3 = new ArrayList<>();
	}

	public void crearTerna(ArrayList<Atleta> atletas) {

		double tiempo1 = obeterMejorTiempo(atletas);
		double tiempo2 = obeterMejorTiempo(atletas, tiempo1);
		double tiempo3 = obeterMejorTiempo(atletas, tiempo2);

		ganadoresPosicion1= obtenerAtletasPorTiempo(atletas, tiempo1);
		ganadoresPosicion2= obtenerAtletasPorTiempo(atletas, tiempo2);
		ganadoresPosicion3=obtenerAtletasPorTiempo(atletas, tiempo3);
		
	}

	public ArrayList<Atleta> obtenerAtletasPorTiempo(ArrayList<Atleta> atletas,double tiempo) {
		ArrayList<Atleta> atletasGanadores = new ArrayList<Atleta>();
		for (Atleta atleta : atletas) {
			if (atleta.getSegundos() == tiempo) {
				atletasGanadores.add(atleta);
			}
		}
		return atletasGanadores;
	}

	public double obeterMejorTiempo(ArrayList<Atleta> atletas, double mejorTiempoDespuesDe) {
		double tiempo = 999999;

		for (Atleta atleta : atletas) {
			if (atleta.getSegundos() < tiempo && atleta.getSegundos() > mejorTiempoDespuesDe) {
				tiempo = atleta.getSegundos();
			}
		}
		return tiempo;
	}

	// Hago una sobrecarga para poder reutilizar el metodo =)
	public double obeterMejorTiempo(ArrayList<Atleta> atletas) {
		double tiempo = 999999;

		for (Atleta atleta : atletas) {
			if (atleta.getSegundos() < tiempo) {
				tiempo = atleta.getSegundos();
			}
		}
		return tiempo;
	}

	
	@Override
	public String toString() {
		return "Terna [ganadoresPosicion1=" + ganadoresPosicion1 + ", ganadoresPosicion2=" + ganadoresPosicion2
				+ ", ganadoresPosicion3=" + ganadoresPosicion3 + "]";
	}

	// SOLUCION 2
	/*
	 * public void crearTerna(ArrayList<Atleta> atletas) {
	 * 
	 * double tiempo1=obeterMejorTiempo(atletas, -1); (AQUI ESTABLEZCO LOS
	 * LIMITES DE BUSQUEDA HARCODEADO) double tiempo2=obeterMejorTiempo(atletas,
	 * tiempo1); double tiempo3= obeterMejorTiempo(atletas, tiempo2); }
	 * 
	 * public double obeterMejorTiempo(ArrayList<Atleta>atletas, double
	 * mejorTiempoDespuesDe) { double tiempo = 999999;
	 * 
	 * for (Atleta atleta : atletas) { if (atleta.getSegundos() < tiempo &&
	 * atleta.getSegundos()>mejorTiempoDespuesDe) { tiempo =
	 * atleta.getSegundos(); } } return tiempo; }
	 */

	
}
