package Actividad_2;

import java.util.Scanner;

public class Main {

    static Stacks.stack stack = new Stacks.stack();
    static Queue queue = new Queue();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== CENTRO DE OPERACIONES =====");
            System.out.println();
            System.out.println("1. Registrar acción");
            System.out.println("2. Deshacer última acción");
            System.out.println("3. Ver última acción");
            System.out.println("4. Mostrar historial");
            System.out.println();
            System.out.println("5. Agregar tarea");
            System.out.println("6. Procesar siguiente tarea");
            System.out.println("7. Ver siguiente tarea");
            System.out.println("8. Mostrar tareas pendientes");
            System.out.println();
            System.out.println("9. Mostrar estado del sistema");
            System.out.println("0. Salir");
            System.out.println();
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero(sc);

            String texto = leerString(sc);

            switch (opcion) {

                case 1:
                    stack.push(texto);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    queue.enqueue(texto);
                    break;

                case 6:
                    queue.dequeue();
                    break;

                case 7:
                    queue.peek();
                    break;

                case 8:
                    queue.display();
                    break;

                case 9:
                    stack.display();
                    queue.display();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }

    private static int leerEntero(Scanner sc) {

        while (!sc.hasNextInt()) {
            System.out.print("Ingresa un número válido: ");
            sc.next();
        }

        int val = sc.nextInt();
        sc.nextLine();

        return val;
    }

    private static String leerString(Scanner sc) {
        while (!sc.hasNext()) {
            System.out.print("Ingresa un texto válido: ");
            sc.next();
        }

        String val = sc.nextLine();
        sc.nextLine();

        return val;
    }
}