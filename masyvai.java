import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class masyvai {
    Random random = new Random();

    public static void main(String[] args) {
        // fillArray();
       // fibonaciNumbers();
calculateAverageofTwoArrays();

    }
    private static void calculateAverageofTwoArrays() {

        int[] firstArray = new int[1000];
        int[] secondArray = new int[1000];

        firstArray = fillArray();
        secondArray = fillArray();
        int average= (findMaxValue(firstArray) + findMaxValue(secondArray))
                / 2;
        System.out.println("Average value is: " + average;
    }


    /*private static BigInteger [] fibonaciNumbers() {
       // int nMinusTwo = 0;
        //int nMinusOne = 1;
        BigInteger[] n = new BigInteger[120];
        n[0]= BigInteger.valueOf(0);
        n[1]= BigInteger.valueOf(1);
        n[2]= BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 3; i < 121; i++) {
            n[i] = sum.add(n[i - 2]);
            sum = sum.add(n[i - 2]);
        }
        System.out.println(n.length);
        return n;
    }

     */

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
