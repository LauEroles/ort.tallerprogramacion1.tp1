package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Ap?ndice de m?todo generado autom?ticamente

		/*
		 * Desde el main(): Cre? una instancia de Grupo asign?ndole el n?mero,
		 * la letra o el nombre que le hayan puesto.
		 */

		Grupo grupo = new Grupo("1");

		// porque no me agrega a las otras 3 Laura?
		// por el metodo que valida que si ya esta el nombre de la persona no lo
		// agregar?

		/*
		 * Agregale los miembros reales de tu grupo de trabajos pr?cticos.
		 * Agregale uno m?s, ficticio. Cada vez que agregues un integrante el
		 * programa debe mostrar el mensaje ?[nombreIntegrante] fue asignado al
		 * grupo [nombreGrupo]?, donde [nombreIntegrante] y [nombreGrupo] son,
		 * respectivamente, los nombres del nuevo integrante y del grupo.
		 */
		grupo.agregarIntegrante("Laura");
		grupo.agregarIntegrante("Laura");
		grupo.agregarIntegrante("Laura");
		grupo.agregarIntegrante("Mar?a");
		grupo.agregarIntegrante("Diego");
		grupo.agregarIntegrante("Martin");
		grupo.agregarIntegrante("Priscilla");
		grupo.agregarIntegrante("Giselle");
		grupo.agregarIntegrante("Fernando");

		System.out.println(grupo.getCantidadIntegrantes());
		System.out.println(grupo.buscarIntegrante("Elena"));
		System.out.println(grupo.getNombre());
		System.out.println(grupo.getClass());
		System.out.println(grupo.hashCode());

		// Mostr? todos los datos del grupo.
		grupo.mostrar();

		// Remov? al integrante ficticio para que el grupo quede con los
		// integrantes reales.
		// Luego de removerlo de la lista, mostr? los datos del integrante
		// removido.
		grupo.removerIntegrante("Giselle");

		/* Volv? a remover el mismo integrante ficticio */
		//grupo.removerIntegrante("Giselle");

		// Mostr? de nuevo los datos del grupo, actualizados.
		grupo.mostrar();

		/*
		 * Vaci? el grupo y volv? a mostrarlo.
		 */
		grupo.vaciar();
		grupo.mostrar();
	}

	/*
	 * ?????????????????????????????????????????? Escrib? un m?todo del programa
	 * principal que compruebe si un integrante determinado fue o no agregado al
	 * grupo. Probalo tanto con uno que exista como con uno que no.
	 */

}
