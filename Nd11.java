/*
@autor Vita

*/

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Nd11 {

    public static void main(String[] args) {

        //findLargestCommonDivisor();
        // findSmallestCommonIterativ();

        // arrayIntsToNumber(task3());//makes  from number array (length 10) the largest number
        // System.out.println(Arrays.toString());
         task4();//array3[i]=array1[i]+array2[i]
       // task5(); //searching and counting Words

    }

    private static void task5() {
        String text = " The good day for teaching ...Every day ";
        String searchingWord = "day";
        String[] textArray;
        textArray = text.split(" ");
        int counter = 0;
        for (String s : textArray) {
            if (searchingWord.equals(s)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void task4() {
        int[] array1;
        array1 = fillArray();
        int[] array2 ;
        array2 = fillArray();
        int[] array3 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }

    public static int[] task3() {
        int[] array = new int[10];
        array = fillArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                String first = Integer.toString(array[j]);
                String second = Integer.toString(array[j + 1]);
                if ((Integer.parseInt(second + first)) > (Integer.parseInt(first + second))) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static BigInteger arrayIntsToNumber(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        String numberString = "";
        for (int i = 0; i < nums.length; i++) {
            stringBuilder.append(nums[i]);
        }
        BigInteger number = new BigInteger(String.valueOf(stringBuilder));
        System.out.println(number);
        return number;

    }

    private static int[] fillArray() {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    public static void findSmallestCommonIterativ() {
        System.out.println("Iveskite skaicius, kuriu MBK norite rasi:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int biggestNumber = Math.max(firstNumber, secondNumber);
        int smallerNumber = Math.min(firstNumber, secondNumber);
        if (biggestNumber % smallerNumber == 0) {
            System.out.println("MBK yra: " + biggestNumber);
        } else for (int i = 1; i < smallerNumber + 1; i++) {

            if (biggestNumber * i % smallerNumber == 0) {
                System.out.println("MBK yra" + biggestNumber * i);
            }

        }
    }

    private static void findLargestCommonDivisor() {
        System.out.println("Iveskite skaicius, kuriu DBD norite rasi:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int Lcd = 1;

        firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (secondNumber == 0 || firstNumber == 0) {
            System.out.println(("Iveskite sveikuosius skaicius didesnius uz nuli"));
            findLargestCommonDivisor();
        }
        int smallerNumber = Math.min(firstNumber, secondNumber);
        int biggestNumber = Math.max(firstNumber, secondNumber);
        if (biggestNumber % smallerNumber == 0) {
            System.out.println(("DBD yar: " + smallerNumber));
        } else {

            for (int i = 1; i < smallerNumber; i++) {

                if (smallerNumber % i == 0 & biggestNumber % i == 0) {
                    Lcd = i;
                }
            }
            System.out.println("DBD yra: " + Lcd);

        }

    }
}