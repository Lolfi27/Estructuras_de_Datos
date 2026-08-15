package Actividad_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Nodes.LinkedList biblioteca = new Nodes.LinkedList();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1. Agregar libro al inicio");
            System.out.println("2. Agregar libro al final");
            System.out.println("3. Insertar libro en posición");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Buscar libro");
            System.out.println("6. Consultar libro por posición");
            System.out.println("7. Eliminar libro");
            System.out.println("8. Eliminar libro por posición");
            System.out.println("9. Mostrar cantidad de libros");
            System.out.println("10. Salir");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(sc);

            switch (opcion) {
                case 1: {
                    Nodes.Book b = pedirLibro(sc);
                    biblioteca.insertAtBeginning(b);
                    System.out.println("Libro agregado al inicio.");
                    break;
                }
                case 2: {
                    Nodes.Book b = pedirLibro(sc);
                    biblioteca.insertAtEnd(b);
                    System.out.println("Libro agregado al final.");
                    break;
                }
                case 3: {
                    System.out.print("Posición donde insertar: ");
                    int pos = leerEntero(sc);
                    Nodes.Book b = pedirLibro(sc);
                    boolean ok = biblioteca.insertAt(pos, b);
                    System.out.println(ok ? "Libro insertado en la posición " + pos + "."
                            : "Posición inválida.");
                    break;
                }
                case 4:
                    System.out.println("--- Libros registrados ---");
                    biblioteca.display();
                    break;
                case 5: {
                    System.out.print("Código del libro a buscar: ");
                    String code = sc.nextLine();
                    System.out.println(biblioteca.search(code)
                            ? "El libro existe."
                            : "El libro no existe.");
                    break;
                }
                case 6: {
                    System.out.print("Posición a consultar: ");
                    int pos = leerEntero(sc);
                    Nodes.Book b = biblioteca.get(pos);
                    System.out.println(b != null ? b : "Posición inválida.");
                    break;
                }
                case 7: {
                    System.out.print("Código del libro a eliminar: ");
                    String code = sc.nextLine();
                    boolean ok = biblioteca.delete(code);
                    System.out.println(ok ? "Libro eliminado." : "El libro no existe.");
                    break;
                }
                case 8: {
                    System.out.print("Posición a eliminar: ");
                    int pos = leerEntero(sc);
                    boolean ok = biblioteca.deleteAt(pos);
                    System.out.println(ok ? "Libro eliminado." : "Posición inválida.");
                    break;
                }
                case 9:
                    System.out.println("Cantidad de libros: " + biblioteca.size());
                    break;
                case 10:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 10);

        sc.close();
    }

    private static int leerEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Ingresa un número válido: ");
            sc.next();
        }
        int val = sc.nextInt();
        sc.nextLine(); // limpiar el salto de línea pendiente
        return val;
    }

    private static Nodes.Book pedirLibro(Scanner sc) {
        System.out.print("Código: ");
        String code = sc.nextLine();
        System.out.print("Título: ");
        String title = sc.nextLine();
        System.out.print("Autor: ");
        String author = sc.nextLine();
        return new Nodes.Book(code, title, author);
    }
}
