import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Nd10 {


    Random random = new Random();

    public static void main(String[] args) {
        //  sortedArray(); //task 1, create arrays of integer and sorted with Bubble sorting
        //fibonaciNumbers();//task nr 2, print 120 number of Fibonacci
        // calculateAverageOfTwoArrays();// task nr 3

        //sortingStringArray (); //task nr4 -- nerusiuoja iki galo, kazkadaryti su antru for
        longArraySorting();// task nr5


    }

    private static void longArraySorting() {
        long[] array = new long[5000];
        fillArrayLong(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        quicksorting(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    private static void quicksorting(long array[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);
            quicksorting(array, begin, partitionIndex - 1);
            quicksorting(array, partitionIndex + 1, end);

        }


    }

    private static int partition(long array[], int begin, int end) {

        long pivot = array[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                long swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;

            }
        }
        long swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;
        return i + 1;
    }

    private static void sortingStringArray() {
        String[] stringArray = {"d", "vardas", "valgis", "preke", "c", "kede", "lova", "stalas", "kompiuteris", "Rude"};
        // String [] arrays = new String [stringArray.length];
        for (int i = 0; i < (stringArray.length - 1); i++) {

            int pirmoIlgis = stringArray[i].length();
            int antroIlgis = stringArray[i + 1].length();
            int trumpesnis = Math.min(pirmoIlgis, antroIlgis);
            for (int j = 1; j < stringArray.length - i; j++) {
                for (int k = 0; k < trumpesnis; k++) {
                    if (stringArray[i].charAt(k) == stringArray[i + 1].charAt(k)) {
                        continue;
                    } else if (stringArray[i].charAt(k) < stringArray[i + 1].charAt(k)) {
                        break;
                    } else if (stringArray[i].charAt(k) > stringArray[i + 1].charAt(k)) {
                        String temp = stringArray[i + 1];
                        stringArray[i + 1] = stringArray[i];
                        stringArray[i] = temp;
                        System.out.println(Arrays.toString(stringArray));
                        break;


                    }
                }
                System.out.println(Arrays.toString(stringArray));
            }
        }
        //for (int i=0, j=1; j<stringArray.length; i++, j++){
        //   int iLength = stringArray[i].length();
        // int iPlus = stringArray[j].length();
        //    int shorter = 0;
        //  if (iLength > iPlus) {
        //    shorter = iPlus;
        //} else {
        //  shorter = iLength;
        //}
        //for (int k = 0; k<shorter; k++){
        // int firstElement = stringArray[i].toLowerCase().charAt(k); //array[i]
        //int seconfElement = stringArray[j].toLowerCase().charAt(k);//array [j]
        //if (firstElement<seconfElement){
        //break;}
        //else if (firstElement>seconfElement){
        //  String temp=stringArray[j];
        //stringArray[j]=stringArray[i];
        //stringArray[i]=temp;
        //System.out.println((Arrays.toString(stringArray)));
        //}

    }//
    //}
    //System.out.print(Arrays.toString(stringArray));


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

    private static long[] fillArrayLong(long[] array) {
        Random random = new Random();
        long[] numbers = new long[5000];
        for (int i = 0; i < 5000; i++) {
            numbers[i] = random.nextLong();
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
