import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle principal del programa
        do {
            // Mostramos el menú de opciones al usuario
            System.out.println("Menú - ELIGE UNA OPCIÓN:");
            System.out.println("Opción 1. Mostrar números aleatorios eligiendo la cantidad y el rango");
            System.out.println("Opción 2. Mostrar números aleatorios entre 0 y 1");
            System.out.println("Opción 3. Salir");
            // Solicita al usuario que teclee una opción
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            // Ejecuta la opción seleccionada
            ejecutarOpcion(opcion);

        } while (opcion != 3); // Continuar hasta que el usuario elija salir

        scanner.close();
    }

    // Función para ejecutar la opción seleccionada
    public static void ejecutarOpcion(int opcion) {
        if (opcion == 1) {
            // Para la opción 1, solicitamos información adicional y mostrar números aleatorios en el rango especificado
            int cantidad1 = solicitoEntero("Introduce cantidad:");
            int min = solicitoEntero("Introduce el valor mínimo:");
            int max = solicitoEntero("Introduce el valor máximo:");
            //Control de mínimo mayor que máximo.
            if (min<max) NumerosAleatorios(cantidad1, min, max);
            else System.out.println("Opción no permitida: Valor mínimo superior al máximo.");
        } else if (opcion == 2) {
            // Para la opción 2, pedimos la cantidad y mostramos números aleatorios entre 0 y 1
            int cantidad2 = solicitoEntero("Ingrese la cantidad de números aleatorios entre 0 y 1:");
            NumerosAleatorios(cantidad2);
        } else if (opcion == 3) {
            // Para la opción 3, mostramos un mensaje de cierre
            System.out.println("Cerrando programa...");
        } else {
            // Para opciones incorrectas, el programa mostará un mensaje de error
            System.out.println("Opción incorrecta");
        }
    }

    // Función para solicitar al usuario que introduzca un número entero
    public static int solicitoEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    // Función que sirve para mostrar la cantidad especificada de números aleatorios en el rango especificado
    public static void NumerosAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        System.out.println("Números aleatorios entre " + min + " y " + max + ":");
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(max - min + 1) + min;
            System.out.println(numero + " ");
        }
        System.out.println();
    }

    // Función sobrecargada que nos sirve para generar números entre 0 y 1
    public static void NumerosAleatorios(int cantidad) {
        Random random = new Random();
        System.out.println("Números aleatorios entre 0 y 1:");
        for (int i = 0; i < cantidad; i++) {
            double numero = random.nextDouble();
            System.out.println(numero + " ");
        }
        System.out.println();
    }
}
