import java.util.Random;

public class Main02 {

  public static int[] randomArray(int length, int min, int max) {
    Random random = new Random();
    int[] result = new int[length];

    for (int i = 0; i < length; i++) {
      result[i] = random.nextInt(max - min + 1) + min;
    }
    return result;
  }

  public static int[] reverseArray(int[] arr) {
    int[] reverseArray = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      reverseArray[i] = arr[arr.length - 1 - i];
    }
    return reverseArray;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int length = 10;
    int min = 1;
    int max = 100;

    int[] array = randomArray(length, min, max);
    printArray(array);
    System.out.println();
    int[] reverseArray = reverseArray(array);
    printArray(reverseArray);
  }

}
