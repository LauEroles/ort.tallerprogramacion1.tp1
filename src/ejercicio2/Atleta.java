package ejercicio2;

public class Atleta {

	private double segundos = 0;
	private String nombreCompleto;

	public Atleta(double segundos, String nombreCompleto) {
		this.setSegundos(segundos);
		this.setNombreCompleto(nombreCompleto);
	}

	public double getSegundos() {
		return segundos;
	}

	private void setSegundos(double segundos) {
		this.segundos = segundos;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public String toString() {
		return nombreCompleto + " segundos: " + segundos;
	}

}
