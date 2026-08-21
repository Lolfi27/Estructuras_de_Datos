package Actividad_2;

public class Queue {
    Node front, rear;

    Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(String data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public String dequeue() {
        if (front == null) {
            System.out.println("La cola esta vacia");
        }
        String value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return value;
    }

    public String peek() {
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

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
