package Trabajos_clase.Semana_6;

public class Clase_2 {
    static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 5, 2, 6 };
        System.out.println("Insertion sort");
        System.out.println("\nAntes de ordenar");
        imprimir(arr);
        insertionSort(arr);
        System.out.println("\nDespués de ordenar");
        imprimir(arr);
    }

    static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}