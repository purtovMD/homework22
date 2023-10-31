import java.util.Random;

public class Main01 {

  public static int[] randomArray(int length, int min, int max) {
    Random random = new Random();
    int[] result = new int[length];

    for (int i = 0; i < length; i++) {
      result[i] = random.nextInt(max - min + 1) + min;
    }
    return result;
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
   int length = 10;
   int min = 10;
   int max = 20;
   int[] randomGeneratedArray = randomArray(length, min, max);
   printArray(randomGeneratedArray);
  }
}