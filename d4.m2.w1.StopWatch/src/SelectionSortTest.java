
import java.util.Random;

public class SelectionSortTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] arr = getArr();
        selectionSort(arr);
        stopWatch.end();
        System.out.println("ElapsedTime: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    private static int[] getArr() {
        int[] array = new int[100000];
        Random number = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = number.nextInt(1000);
        }
        return array;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }
}


