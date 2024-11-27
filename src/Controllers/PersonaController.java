package Controllers;

import Models.Persona;

public class PersonaController {
    public PersonaController() {
        // Constructor
    }

    // Método de ordenamiento por selección descendente (por edad)
    public void selecciónController(Persona[] personas) {
        int tamanio = personas.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int aux = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (personas[j].getEdad() > personas[aux].getEdad()) {
                    aux = j;
                }
            }
            Persona personaTemporal = personas[i];
            personas[i] = personas[aux];
            personas[aux] = personaTemporal;
        }
    }

    // Método de búsqueda binaria por edad
    public int busquedaBinariaEdad(Persona[] personas, int edad) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            if (personas[medio].getEdad() == edad) {
                return medio;
            } else if (personas[medio].getEdad() < edad) {
                alto = medio - 1;
            } else {
                bajo = medio + 1;
            }
        }
        return -1;
    }

    // Método de ordenamiento por inserción ascendente (por nombre)
    public void InserccionAscendente(Persona[] personas) {
        int tamanio = personas.length;
        for (int i = 1; i < tamanio; i++) {
            Persona Key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getNombre().compareTo(Key.getNombre()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = Key;
        }
    }

    // Método de búsqueda binaria por nombre
    public int busquedaBinariaNombre(Persona[] personas, String nombre) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            int comparacion = nombre.compareTo(personas[medio].getNombre());
            if (comparacion == 0) {
                return medio;
            }
            if (comparacion < 0) {
                alto = medio - 1;
            } else {
                bajo = medio + 1;
            }
        }
        return -1;
    }
}