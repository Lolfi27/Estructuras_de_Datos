package Trabajos_clase.Semana_2;

public class Colasynodos {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;

        Queue() {
            front = null;
            rear = null;
        }

        public void enqueue(int data) {
            Node newNode = new Node(data);

            if (front == null) {
                front = newNode;
                rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public int dequeue() {
            if (front == null) {
                System.out.println("La cola esta vacia");
            }
            int value = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }
            return value;
        }

        public int peek() {
            if (front == null) {
                System.out.println("La cola esta vacia");
            }
            return front.data;
        }

        public boolean isEmpty() {
            return (front == null);
        }

        public int size() {
            int count = 0;
            Node current = front;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

}
