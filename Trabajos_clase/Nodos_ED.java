package Trabajos_clase;

public class Nodos_ED {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        Node fourth = new Node(400);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
