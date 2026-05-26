import java.util.Scanner;

/**
 * Clase encargada de la
 * interacción con el usuario
 */
public class View {

    /**
     * Muestra el menú principal
     * de la aplicación
     */

    public void menu() {
        Controller c = new Controller();
        int opcion = 0;
        do {
            System.out.println("\n--- XESTOR COCHES ---");
            System.out.println("1. Engadir Coche");
            System.out.println("2. Cambiar velocidad");
            System.out.println("3. Avanzar");
            System.out.println("4. Salir");
            System.out.print("Selecciona unha opción: ");

            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Modelo: ");
                    String modelo = new Scanner(System.in).next();
                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();
                    boolean a = c.añadirCoche(modelo, matricula);
                    if (a == true) {
                        System.out.println("Se ha añadido correctamente");
                    } else {
                        System.out.println("Algo ha fallado");
                    }
                }

                case 2 -> {
                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();
                    System.out.println("Nueva velocidad: ");
                    int velocidad = new Scanner(System.in).nextInt();
                    boolean a = c.newVelocidad(matricula, velocidad);
                    if (a == true) {
                        System.out.println("Se ha cambiado correctamente");
                    } else {
                        System.out.println("Algo ha fallado");
                    }
                }

                case 3 -> {
                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();

                    System.out.println("Metros a avanzar: ");
                    int metros = new Scanner(System.in).nextInt();

                    boolean a = c.avanzarCoche(matricula, metros);

                    if (a == true) {
                        System.out.println("El coche avanzó correctamente");
                    } else {
                        System.out.println("Algo ha fallado");
                    }
                }
            }
        } while (opcion != 4);
    }

    /**
     * Muestra la velocidad
     * de un coche
     * @param matricula matrícula del coche
     * @param v velocidad actual
     * @return true si se muestra correctamente
     */
    public boolean muestraVelocidad(String matricula, Integer v) {
        System.out.println(matricula + ": " + v + "km/h");
        return true;
    }

    /**
     * Muestra los metros recorridos
     * por un coche
     * @param matricula matrícula del coche
     * @param metros metros recorridos
     * @return true si se muestra correctamente
     */
    public boolean mostrarMetros(String matricula, Integer metros){

        System.out.println(matricula + ": " + metros + " metros recorridos");

        return true;
    }
}
