/**
 * Clase que representa un coche
 * Guarda modelo, matrícula, velocidad
 * y metros recorridos
 */

public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    Integer metrosRecorridos;

    /**
     * Constructor del coche
     * @param modelo modelo del coche
     * @param matricula matricula unica
     */

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.metrosRecorridos = 0;
    }
}
