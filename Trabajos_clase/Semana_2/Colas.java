package Trabajos_clase.Semana_2;

public class Colas {
    static class Queue {
        int front, rear;
        int[] data;

        Queue(int capacity) {
            data = new int[capacity];
            front = 0;
            rear = -1;
        }

        public void enqueue(int value) {
            if (rear == data.length - 1) {
                System.out.println("La cola está llena.");
                return;
            }
            rear++;
            data[rear] = value;
        }

        public int dequeue() {
            int value = data[front];
            front++;
            return value;
        }

        public int peek() {
            return data[front];
        }

        public boolean isEmpty() {
            return (rear == -1);
        }

        public int size() {
            return (rear + 1);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.size());

    }
}
