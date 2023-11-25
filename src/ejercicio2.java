import java.util.Scanner;

public class ejercicio2 {

    // Función recursiva para calcular el enésimo término de la serie de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario el valor de n
        System.out.print("Introduce el valor de n para calcular el enésimo término de la serie de Fibonacci: ");
        int n = scanner.nextInt();

        // El número no puede ser negativo, se lo mostramos al usuario
        if (n < 0) {
            System.out.println("El valor de n debe ser un número no negativo.");
        } else {
            // Calculamos y mostramos resultado
            int resultado = fibonacci(n);
            System.out.println("El enésimo término de la serie de Fibonacci para n=" + n + " es: " + resultado);
        }

        // Cerramos el scanner
        scanner.close();
    }
}

