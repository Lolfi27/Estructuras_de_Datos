package Trabajos_clase.Semana_3;

public class Clase_1 {

    static class PriorityQueue {
        int[] heap;
        int size;

        PriorityQueue(int capacity) {
            heap = new int[capacity];
            size = 0;
        }

        int parent(int index) {
            return (index - 1 / 2);
        }

        public int left_son(int index) {
            return (index * 2 + 1);
        }

        public int right_son(int index) {
            return (index * 2 + 2);
        }

        public void swap(int i, int j){
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }
        public void insert(int value){
            int index = size;
            heap[index] = value;
            size ++;
        }
        

    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(6);

        System.out.println(pq.parent(5));
    }

}
