package Actividad_1;

public class Nodes {
    static class Book {
        String code;
        String title;
        String author;

        Book(String code, String title, String author) {
            this.code = code;
            this.title = title;
            this.author = author;
        }

        public String toString() {
            return "Código: " + code + " | Título: " + title + " | Autor: " + author;
        }
    }

    static class Node {
        Book data;
        Node next;

        Node(Book data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        LinkedList() {
            head = null;
        }

        // 1. Insertar al inicio
        public void insertAtBeginning(Book data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // 2. Insertar al final
        public void insertAtEnd(Book data) {
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

        public boolean insertAt(int index, Book data) {
            if (index < 0 || index > size()) {
                return false;
            }
            if (index == 0) {
                insertAtBeginning(data);
                return true;
            }
            if (index == size()) {
                insertAtEnd(data);
                return true;
            }
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return true;
        }

        // 4. Mostrar todos los libros
        public void display() {
            if (head == null) {
                System.out.println("La biblioteca no tiene libros registrados.");
                return;
            }
            Node current = head;
            int i = 0;
            while (current != null) {
                System.out.println(i + " -> " + current.data);
                current = current.next;
                i++;
            }
        }

        // 5. Buscar un libro por código
        public boolean search(String code) {
            Node current = head;
            while (current != null) {
                if (current.data.code == code) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // 6. Obtener un libro por posición
        public Book get(int index) {
            if (index < 0 || index >= size()) {
                return null;
            }
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        // 7. Eliminar un libro por código
        public boolean delete(String code) {
            if (head == null) {
                return false;
            }
            if (head.data.code == code) {
                head = head.next;
                return true;
            }
            Node current = head;
            while (current.next != null) {
                if (current.next.data.code.equals(code)) {
                    current.next = current.next.next;
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // 8. Eliminar por posición
        public boolean deleteAt(int index) {
            if (head == null || index < 0 || index >= size()) {
                return false;
            }
            if (index == 0) {
                head = head.next;
                return true;
            }
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            return true;
        }

        // 9. Tamaño de la lista
        public int size() {
            Node current = head;
            int count = 0;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }
}
