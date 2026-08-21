package Trabajos_clase.Semana_2;

public class PilasyNodos {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        Node top;

        stack() {
            top = null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek() {
            if (top == null) {
                throw new RuntimeException("La pila esta vacia");
            }
            return top.data;
        }

        public boolean isEmpty() {
            return (top != null);
        }

        public int size() {
            Node current = top;
            int count = 0;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
    }
}
