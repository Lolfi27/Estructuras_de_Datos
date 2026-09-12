package Trabajos_clase.Semana_5;

public class Clase_1 {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.data = 1;

        root.left.data = 2;
        root.right.data = 3;

        root.left.left.data = 4;
        root.left.right.data = 5;
        root.right.left.data = 6;
        root.right.right.data = 7;

        root.left.left.left.data = 8;
        root.left.left.right.data = 9;
        root.left.right.left.data = 10;
        root.left.right.right.data = 11;

        System.out.println("valor de la raíz: " + root.data);
    }
}