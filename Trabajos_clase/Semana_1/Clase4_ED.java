package Trabajos_clase.Semana_1;

public class Clase4_ED {

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

        public void inssertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void insertAt(int index, int data) {
            if (head == null) {
                return;
            }
            if (index < 0) {
                return;
            }
            if (index == 0) {
                inssertAtBeginning(data);
                return;
            }

            if (index >= size()) {
                insertAtEnd(data);
                return;
            }

            Node newNode = new Node(data);
            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        public void deleteAt(int index) {
            Node current = head;

            if (index == 0) {
                head = head.next;
                return;
            }
            for (int i = 0; i < index - 1; i++) {
                if (current.next == null) {
                    return;
                }
                current.next = current.next;

            }
            current.next = current.next.next;
        }

        public int get(int index) {
            if (head == null) {
                System.out.println("Error: La lista esta vacia");
                return 0;
            }
            if (index < 0) {
                System.out.println("Error: El indice no puede ser negativo");
                return head.data;
            }
            Node current = head;
            for (int i = 0; i < index; i++) {
                if (current.next == null) {
                    System.out.println("Error: El indice es mayor que el tamaño de la lista");
                    return current.data;
                }
                current = current.next;
            }
            return current.data;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.println("---- Obtener un numero ----");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

    }
}