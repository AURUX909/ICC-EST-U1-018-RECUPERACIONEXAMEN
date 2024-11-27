import Controllers.PersonaController;
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = {
                new Persona("Anais", 25),
                new Persona("Luis", 32),
                new Persona("Carlos", 40),
                new Persona("María", 19),
                new Persona("José", 45),
                new Persona("Laura", 30),
                new Persona("Pedro", 28),
                new Persona("Marta", 35),
                new Persona("Jorge", 50),
                new Persona("Sofía", 22),
                new Persona("Raúl", 18),
                new Persona("Patricia", 29),
                new Persona("Andrés", 41),
                new Persona("Elena", 24),
                new Persona("Manuel", 38),
                new Persona("Isabel", 34),
                new Persona("Gabriel", 42),
                new Persona("Claudia", 26),
                new Persona("Fernando", 31),
                new Persona("Paula", 20),
                new Persona("Diego", 36),
                new Persona("Rosa", 27),
                new Persona("Rubén", 44),
                new Persona("Teresa", 33),
                new Persona("Iván", 17),
                new Persona("Julia", 21),
                new Persona("Adriana", 39),
                new Persona("Sergio", 48),
                new Persona("Lorena", 23),
                new Persona("Miguel", 52)
        };

        PersonaController control = new PersonaController();

        // Ordenar por edad descendente y mostrar
        System.out.println();
        System.out.print("=== Ordenando personas por edad en orden descendente ===");
        control.selecciónController(personas);
        imprimirArreglo(personas);

        // Buscar personas por edad
        System.out.println("\n=== Buscando personas por edad ===");
        int[] edades = { 25, 70 };
        for (int edad : edades) {
            int indice = control.busquedaBinariaEdad(personas, edad);
            if (indice != -1) {
                System.out.println("Persona encontrada: " + personas[indice] +
                        " en la posición " + indice);
            } else {
                System.out.println("Persona con edad " + edad + " no encontrada.");
            }
        }

        // Ordenar por nombre ascendente y mostrar
        System.out.println("\n=== Ordenando personas por nombre en orden ascendente ===");
        control.InserccionAscendente(personas);
        imprimirArreglo(personas);

        // Buscar personas por nombre
        System.out.println("\n=== Buscando personas por nombre ===");
        String[] nombresBuscar = { "Anais", "Miguel" };
        for (String nombre : nombresBuscar) {
            int indice = control.busquedaBinariaNombre(personas, nombre);
            if (indice != -1) {
                System.out.println("Persona encontrada: " + personas[indice] +
                        " en la posición " + indice);
            } else {
                System.out.println("Persona con nombre " + nombre + " no encontrada.");
            }
        }
    }

    // Método para imprimir el arreglo de personas de forma clara
    public static void imprimirArreglo(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}