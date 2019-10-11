import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Nd10 {


    Random random = new Random();

    public static void main(String[] args) {
        sortedArray(); //task 1, create arrays of integer and sorted with Bubble sorting
        //fibonaciNumbers();//task nr 2, print 120 number of Fibonacci
        // calculateAverageOfTwoArrays();// task nr 3

    }

    private static void sortedArray() {
        int[] array = new int[100];
        array = fillArray();
        System.out.println(Arrays.toString(array));
        bubbleSorting(array);
        System.out.println(Arrays.toString(array));
    }


    static void bubbleSorting(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    private static void calculateAverageOfTwoArrays() {

        int[] firstArray = new int[1000];
        int[] secondArray = new int[1000];

        firstArray = fillArray();//create first Array
        secondArray = fillArray();//create second Array
        int average = (findMaxValue(firstArray) + findMaxValue(secondArray)) / 2;
        System.out.println("Average value is: " + average);
    }

    public static BigInteger[] fibonaciNumbers() { // int nMinusTwo = 0; //int

        BigInteger[] n = new BigInteger[121];
        n[0] = BigInteger.valueOf(0);
        n[1] = BigInteger.valueOf(1);
        n[2] = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 3; i < 121; i++) {
            n[i] = sum.add(n[i - 2]);
            sum = sum.add(n[i - 2]);
        }
        System.out.println(n[120]);
        return n;
    }

    private static int[] fillArray() {
        Random random = new Random();
        int[] numbers = new int[1000];
        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    private static int findMaxValue(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
