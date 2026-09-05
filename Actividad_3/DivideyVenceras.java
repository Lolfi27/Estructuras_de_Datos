package Actividad_3;

public class DivideyVenceras {
  static int max(int[] array, int start, int end) {
    if (start == end) {
      return array[start];
    }
    int middle = (start + end) / 2;

    int leftMax = max(array, start, middle);
    int rightMax = max(array, middle + 1, end);

    return Math.max(leftMax, rightMax);
  }

  public static void main(String[] args) {
    int[] numbers = { 418, 732, 156, 894, 327, 641, 285, 519,
        763, 204, 947, 386, 675, 128, 856, 493 };

    System.out.println("Maximo: " + max(numbers, 0, numbers.length - 1));
  }

}
