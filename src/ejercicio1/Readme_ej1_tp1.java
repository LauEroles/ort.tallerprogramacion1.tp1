package ejercicio1;

public class Readme_ej1_tp1 {

	/*Ejercicio 1.

Implement? la clase Grupo, la cual representa al grupo de Trabajos Pr?cticos y sus
integrantes. Para eso, la clase tendr? un atributo nombre (String) para guardar el nombre
del grupo y otro atributo llamado integrantes (colecci?n de Strings), donde cada elemento
ser? el nombre de un integrante de tu grupo de trabajos pr?cticos. Debe cumplir con el
siguiente dise?o (explotar/implementar los m?todos que se mencionan a continuaci?n):

public Grupo(String nombre) Es el constructor. Debe inicializar correctamente
los atributos de la clase.

public String getNombre() Devuelve
el nombre del grupo.

private void setNombre(String nombre) Setea el nombre del
grupo a partir del par?metro recibido.

public int getCantidadIntegrantes() Devuelve la cantidad
actual de integrantes del grupo.

public void agregarIntegrante(String nombreIntegrante) Agrega al grupo el nombre
de un nuevo integrante, siempre y cuando ?ste no haya sido cargado con anterioridad.
Cuando ya exista, no debe volver a agregarlo.

private int obtenerPosicionIntegrante(String nombreIntegrante) Devuelve la posici?n
en el grupo del integrante cuyo nombre se ha recibido por par?metro. En caso de no
encontrarlo devolver? -1.

public String obtenerIntegrante(int posicion) Recibe un valor entero que representa la
posici?n del integrante en la lista (entero igual o mayor que 1) y devuelve el integrante
guardado en (posicion - 1) dentro de la colecci?n de integrantes. Si el integrante no
existe se debe devolver null.

public String buscarIntegrante(String nombre) Busca al integrante del grupo cuyo
nombre coincida con el par?metro de entrada. En caso de que haya coincidencia, lo
devuelve; caso contrario, el m?todo devolver? null.

public String removerIntegrante(String nombreIntegrante) Remueve de la colecci?n
de integrantes a aquel cuyo nombre coincide con el nombre recibido como par?metro.
Si lo encontr?, luego de removerlo debe devolverlo con return, y si no debe devolver
null.

private void mostrarIntegrantes() Muestra por consola la cantidad de integrantes y
los nombres de cada uno de ellos.

public void mostrar() Muestra por consola el nombre del grupo, la cantidad de
integrantes y el nombre de cada uno de ellos.

public void vaciar() Elimina todos los elementos de la lista
de integrantes.
Desde el main():

Cre? una instancia de Grupo asign?ndole el n?mero, la letra o el nombre que le
hayan puesto.
P?gina 1 de 4

Colecciones y Estructuras Est?ticas - Trabajo Pr?ctico

Agregale los miembros reales de tu grupo de trabajos pr?cticos. Agregale uno m?s,
ficticio. Cada vez que agregues un integrante el programa debe mostrar el mensaje
?[nombreIntegrante] fue asignado al grupo [nombreGrupo]?, donde [nombreIntegrante]
y [nombreGrupo] son, respectivamente, los nombres del nuevo integrante y del grupo.

Escrib? un m?todo del programa principal que compruebe si un integrante
determinado fue o no agregado al grupo. Probalo tanto con uno que exista como con
uno que no.

Mostr? todos los datos del grupo.

Remov? al integrante ficticio para que el grupo quede con los integrantes reales.

Luego de removerlo de la lista, mostr? los datos del integrante removido.

Volv? a remover el mismo integrante ficticio.

Mostr? de nuevo los datos del grupo, actualizados.

Vaci? el grupo y volv? a mostrarlo.*/
	
}
