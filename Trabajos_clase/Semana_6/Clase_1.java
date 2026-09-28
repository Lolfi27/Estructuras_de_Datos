package Trabajos_clase.Semana_6;

public class Clase_1 {
    static void bubbleSort(int arr[]) {
        int intercambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                comparaciones++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambios++;
                }
            }
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }

    static void selectionSort(int arr[]) {
        int intercambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                comparaciones++;
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                intercambios++;
            }
        }

        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }

    static void imprimir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 7, 4, 2, 9, 1, 5 };
        System.out.println("Bubble sort");
        System.out.println("\nAntes de ordenar");
        imprimir(arr);

        bubbleSort(arr);

        System.out.println("\nDespués de ordenar");
        imprimir(arr);
        int[] arr2 = { 8, 3, 7, 4, 2, 9, 1, 5 };

        System.out.println("\nSelection sort");
        System.out.println("\nAntes de ordenar");
        imprimir(arr2);

        selectionSort(arr2);

        System.out.println("\nDespués de ordenar");
        imprimir(arr2);
    }

}