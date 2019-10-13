import java.lang.reflect.Array;
import java.util.Scanner;

public class Nd11 {

    public static void main(String[] args) {
        findLargestCommonDivisor();
    }

    private static int findLargestCommonDivisor() {
        System.out.println("Iveskite skaicius, kuriu DBD norite rasi:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int Lcd = 0;

        firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (secondNumber == 0 || firstNumber == 0){
            System.out.println(("Iveskite sveikuosius skaicius didesnius uz nuli"));
            findLargestCommonDivisor();
        }
        int smallerNumber = Math.min(firstNumber, secondNumber);
        int biggestNumber = Math.max(firstNumber, secondNumber);
        if(biggestNumber % smallerNumber == 0){
            System.out.println(("DBD yar: " + smallerNumber));
        }else {

            for (int i = 1; i < smallerNumber; i++) {

                if (smallerNumber % i == 0 & biggestNumber % i == 0){
                    Lcd = i;
                }
            }
            System.out.println("DBD yra: " + Lcd);

        }

        return secondNumber;


    }
}
