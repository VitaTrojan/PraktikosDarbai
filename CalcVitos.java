package lt.vtmc.javaprojektas7;

import java.util.Scanner;

public class CalcVitos {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double b;
        System.out.print("Iveskite pirmaji skaiciu: ");
        double a = input.nextDouble();
        System.out.print("Iveskite operacijos zenkla ( +, -, *, /, sqrt, sin): ");
        String zenklas = input.next();
        if (zenklas.equals("+") | zenklas.equals("-") | zenklas.equals("*") | zenklas.equals("/") | zenklas.equals("^") | zenklas.equals("%")) {
            System.out.print("Iveskite antraji skaiciu: ");
             b = input.nextDouble();


        if (zenklas.equals("+")) {
            addition(a, b);
        } else if (zenklas.equals("-")) {
            minus(a, b);
        } else if (zenklas.equals("*")) multiply(a, b);
       else if (zenklas.equals("/")) {
            if (b == 0) System.out.println("Dalyba is nulio negalima");
        } else {
            division(a, b);
        }}
    else if(zenklas.equals("sqrt")) {sqrt(a);}
    else if(zenklas.equals("sin")){sin(a);}

}


    private static void addition(double a, double b) {
        System.out.println("Suma yra: " + (a + b));

    }

    private static void minus(double a, double b) {
        System.out.println("Skirtumas yra: " + (a - b));
    }

    private static void multiply(double a, double b) {
        System.out.println("Sandauga yra: " + (a * b));
    }

    private static void division(double a, double b) {
        System.out.println("Dalmuo yra: " + (a / b));
    }

    private static void sqrt(double a) {
        System.out.println("Saknis yra: " + Math.sqrt(a));
    }
    private static void sin(double a) {
        System.out.println("Sin yra: " + Math.sin(a));
    }
}