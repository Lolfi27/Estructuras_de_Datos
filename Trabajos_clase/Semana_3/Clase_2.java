package Trabajos_clase.Semana_3;


public class Clase_2 {
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

        public void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        public void insert(int value) {
            int index = size;
            heap[index] = value;
            size++;
        }

        public void heapifyDown() {
            int index = 0;
            while (left_son(index) < size) {
                int largerSonIndex = left_son(index);

                if (right_son(index) < size && heap[right_son(index)] > heap[largerSonIndex]) {
                    largerSonIndex = right_son(index);
                }

                if (heap[index] >= heap[largerSonIndex]) {
                    break;
                }

                swap(index, largerSonIndex);
                index = largerSonIndex;
            }
        }

        public int delete_top() {
            if (size == 0) {
                throw new RuntimeException("Lista vacia");
            }
            int result = heap[0];
            heap[0] = heap[size - 1];
            size--;
            heapifyDown();
            return result;
        }

    }
}
