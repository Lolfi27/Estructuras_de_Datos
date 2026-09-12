package Actividad_4.Codigo;

public class Main {

    public static void main(String[] args) {
        int[] secuencia = { 45, 49, 53, 25, 43, 16, 65, 78, 28, 69, 13, 24, 61, 73, 96, 55, 99, 3, 85, 93, 57, 100,
                47 };

        ArbolBinario arbol = new ArbolBinario();

        for (int i : secuencia) {
            arbol.insertar(i);
        }

        System.out.println("Inorden: " + arbol.inorden());
        System.out.println("Preorden: " + arbol.preorden());
        System.out.println("Postorden: " + arbol.postorden());

        System.out.println(arbol.eliminar(3));
        System.out.println(arbol.eliminar(43));
        System.out.println(arbol.eliminar(25));
        System.out.println(arbol.eliminar(45));

        System.out.println("Inorden: " + arbol.inorden());
        System.out.println("Preorden: " + arbol.preorden());
        System.out.println("Postorden: " + arbol.postorden());

    }
}
