package ejercicio1;

import java.util.ArrayList;


public class Grupo {

	private String nombreGrupo = null;
	private ArrayList<String> integrantes;

	/*
	 * public Grupo(String nombre) Es el constructor. Debe inicializar
	 * correctamente los atributos de la clase.
	 */
	public Grupo(String nombre) {
		this.setNombre(nombre);
		integrantes = new ArrayList<>();
	}

	/*
	 * public String getNombre() Devuelve el nombre del grupo
	 */
	public String getNombre() {
		return nombreGrupo;
	}

	// ***PREGUNTAR***
	// en el ejercicio lo pide al modificador de acceso como private
	// pero creo que tiene que ser public
	// ASUMO QUE ES PRIVATE PORQUE EN REALIDAD LO QUIERO LLAMAR SOLO DESDE ESTA
	// CLASE
	// NO ESPERO QUE SE ACCEDA A TRAVES DE OTRA CLASE AL SETTER PARA QUE NO
	// PUEDA SER MODIFICADA?

	/*
	 * private void setNombre(String nombre) Setea el nombre del grupo a partir
	 * del parámetro recibido
	 */
	private void setNombre(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	/*
	 * public int getCantidadIntegrantes() Devuelve la cantidad actual de
	 * integrantes del grupo
	 */

	public int getCantidadIntegrantes() {
		return integrantes.size();
	}

	/*
	 * public void agregarIntegrante(String nombreIntegrante) Agrega al grupo el
	 * nombre de un nuevo integrante, siempre y cuando éste no haya sido cargado
	 * con anterioridad. Cuando ya exista, no debe volver a agregarlo
	 */

	/*
	 * SOLUCION DE SOFI: public void agregarIntegrante( String
	 * nombreIntegrante){ if (buscarIntegrante(nombreIntegrante)==null) {
	 * this.integrantes.add(nombreIntegrante); } }
	 */

	public void agregarIntegrante(String nombreIntegrante) {
		String integrante = buscarIntegrante(nombreIntegrante);
		if (integrante == null) {
			integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante + " ha sido agregado al grupo " + nombreGrupo);

		}
	}

	/*
	 * public String buscarIntegrante(String nombre) Busca al integrante del
	 * grupo cuyo nombre coincida con el parámetro de entrada. En caso de que
	 * haya coincidencia, lo devuelve; caso contrario, el método devolverá null
	 * 
	 * 
	 * 
	 * 
	 * SOLUCION PROFE /*public String buscarIntegrante(String nombre) { int pos
	 * = obtenerPosicionIntegrante(nombre); String persona = null; if (pos !=
	 * -1){ persona = listaIntegrantes.get(pos); }
	 * 
	 * return persona; }
	 */
	public String buscarIntegrante(String nombre) {
		String nombreIdentificado = null;
		String integranteABuscar;
		int i = 0;
		while (i < integrantes.size() && nombreIdentificado == null) {
			integranteABuscar = this.integrantes.get(i);
			if (integranteABuscar.equalsIgnoreCase(nombre)) {
				nombreIdentificado = integranteABuscar;
			}
			i++;
		}
		return nombreIdentificado;

	}

	/*
	 * private int obtenerPosicionIntegrante(String nombreIntegrante) Devuelve
	 * la posición en el grupo del integrante cuyo nombre se ha recibido por
	 * parámetro. En caso de no encontrarlo devolverá -1.
	 */

	/*
	 * SOLUCION DE SOFI: private int obtenerPosicionIntegrante(String
	 * nombreIntegrante){ int posicion=-1; int i=0; while(i <
	 * this.integrantes.size() &&
	 * this.integrantes.get(i).equals(nombreIntegrante){ } } } } ????
	 */

	/* DESABILITE ESTE METODO PORQUE NO ME CORRIA EL PROGRAMA
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicionIntegrante = -1;
		int i = 0;
		String integrante = integrantes.get(i);
		while (i < integrantes.size() && !integrante.equalsIgnoreCase(nombreIntegrante)) {
			i++;
			if (integrante.equalsIgnoreCase(nombreIntegrante)) {
				posicionIntegrante = i;
			}
		}
		return posicionIntegrante;
	}/*

	/*
	 * public String obtenerIntegrante(int posicion) Recibe un valor entero que
	 * representa la posición del integrante en la lista (entero igual o mayor
	 * que 1) y devuelve el integrante guardado en (posicion - 1) dentro de la
	 * colección de integrantes. Si el integrante no existe se debe devolver
	 * null
	 */
	public String obtenerIntegrante(int posicion) {
		String nombreIntegrante = null;
		// if (integrantes.size() >= posicion) {}
		// para validar que el usuario no ingresa numeros negativos debo hacer
		// una doble validacion
		if (posicion < integrantes.size() && posicion >= 1) {
			nombreIntegrante = integrantes.get(posicion - 1);
		}
		return nombreIntegrante;
	}

	/*
	 * public String removerIntegrante(String nombreIntegrante) Remueve de la
	 * colección de integrantes a aquel cuyo nombre coincide con el nombre
	 * recibido como parámetro. Si lo encontró, luego de removerlo debe
	 * devolverlo con return, y si no debe devolver null
	 */

	public String removerIntegrante(String nombreIntegrante) {
		String integranteARemover = buscarIntegrante(nombreIntegrante);
		String integranteRemovido = null;
		if (integranteARemover.equalsIgnoreCase(nombreIntegrante)) {
			// ME GENERA MUCHO VERTIGO ESTO QUE HICE PORQUE ESTOY PERDINEDO EL
			// VALOR DE LA REFERENCIA...
			//
			integranteRemovido = integranteARemover;
			integrantes.remove(integranteARemover);
			System.out.println(
					"El integrante " + integranteRemovido + " fue eliminado de la lista del grupo" + nombreGrupo);
		}
		return integranteRemovido;
	}
	/*
	 * private void mostrarIntegrantes() Muestra por consola la cantidad de
	 * integrantes y los nombres de cada uno de ellos
	 */

	private void mostrarIntegrantes() {
		System.out.println("La cantidad de integrantes del grupo es: " + integrantes.size());

		for (String integrante : integrantes) {
			System.out.println(integrante);
		}
	}
	/*
	 * public void mostrar() Muestra por consola el nombre del grupo, la
	 * cantidad de integrantes y el nombre de cada uno de ellos.
	 */

	public void mostrar() {
		System.out.println(
				"El nombre del grupo es: " + nombreGrupo + " ,la cantidad de integrantes es: " + integrantes.size());
		this.mostrarIntegrantes();
	}

	/*
	 * public void vaciar() Elimina todos los elementos de la lista de
	 * integrantes
	 */

	public void vaciar() {
		integrantes.clear();
		System.out.println("Se limpio la lista del grupo: " + nombreGrupo);
	}

}
