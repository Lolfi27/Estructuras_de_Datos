package Trabajos_clase;

public class Listas {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        LinkedList() {
            head = null;
        }

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        public void display() {
            Node current = head;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;

            }
        }

        public int size() {
            Node current = head;
            int count = 0;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        public boolean search(int value) {
            Node current = head;

            while (current != null) {
                if (current.data == value) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public void delete(int value) {
            if (head == null) {
                return;
            }
            if (head.data == value) {
                head = head.next;
                return;
            }
            Node current = head;
            while (current.next != null) {
                if (current.next.data == value) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        System.out.println("----- Listado de elementos -----");
        list.display();
        System.out.println("----- Cantidad de elementos -----");
        System.out.println(list.size());
        System.out.println("----- Buscando elemento -----");
        System.out.println(list.search(30));
        System.out.println("----- Eliminando elemento -----");
        list.delete(30);
        System.out.println("----- Listado de elementos -----");
        list.display();
    }

}
