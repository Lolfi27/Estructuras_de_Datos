package Actividad_2;

public class Stacks {
    static class stack {
        Node top;

        stack() {
            top = null;
        }

        public void push(String data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public String pop() {
            String data = top.data;
            top = top.next;
            return data;
        }

        public String peek() {
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

        public void display() {
            Node current = top;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
