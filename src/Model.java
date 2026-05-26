import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public int cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        System.out.println(" LOG esta haciendose");
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }

    /**
     * Hace avanzar el coche
     * sumando metros recorridos
     * @param matricula matrícula del coche
     * @param metros metros a avanzar
     * @return metros recorridos totales
     */
    public int avanzar(String matricula, int metros) {
        getCoche(matricula).metrosRecorridos += metros;

        return getCoche(matricula).metrosRecorridos;
    }

    /**
     * Devuelve los metros recorridos
     * de un coche
     * @param matricula matrícula del coche
     * @return metros recorridos
     */
    public int getMetros(String matricula) {
        return getCoche(matricula).metrosRecorridos;
    }
}