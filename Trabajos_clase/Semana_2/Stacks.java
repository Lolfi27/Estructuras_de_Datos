package Trabajos_clase.Semana_2;

public class Stacks {
    static class Stack {
        int[] data;
        int top;

        public Stack(int capacity) {
            data = new int[capacity];
            top = -1;
        }

        public void push(int value) {
            if (top == data.length - 1) {
                System.out.println("La pila esta llena");
            }
            top++;
            data[top] = value;
        }

        public int peek() {
            if (top == -1) {
                throw new RuntimeException("La pila esta vacia");
            }
            return data[top];
        }

        public int pop() {
            if (top == -1) {
                throw new RuntimeException("La pila esta vacia");
            }
            int value = data[top];
            top--;
            return value;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public int size() {
            return top + 1;
        }

        public void display() {
            for (int i = top; i >= 0; i--) {
                System.out.println(data[i]);
            }
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();

    }

}
