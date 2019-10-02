package lt.vtmc.javaprojektas7;

import java.util.Scanner;

public class CalcVitos {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Iveskite pirmaji skaiciu: ");
        double a = input.nextDouble();
        System.out.print("Iveskite operacijos zenkla ( +, -, *, /, sqrt, sin): ");
        String zenklas = input.next();
        switch (zenklas) {
            case "+":
                addition(a);
                break;
            case "-":
                minus(a);
                break;
            case "*":
                multiply(a);
                break;
            case "/":
                division(a);
                break;
            case "sqrt":
                sqrt(a);
                break;
            case "sin":
                sin(a);
                break;
            default:
                System.out.println("Tokia operacija dar neaprašyta. Apgailestauju.");
        }
    }

    private static void addition(double a) {
        System.out.print("Iveskite antraji skaiciu: ");
        double b = input.nextDouble();
        System.out.println("Suma yra: " + String.format("%.4f", (a + b)));
    }

    private static void minus(double a) {
        System.out.print("Iveskite antraji skaiciu: -");
        double b = input.nextDouble();
        System.out.println("Skirtumas yra: " + String.format("%.4f", (a - b)));
    }

    private static void multiply(double a) {
        System.out.print("Iveskite antraji skaiciu: *");
        double b = input.nextDouble();
        System.out.println("Sandauga yra: " + String.format("%.4f", (a * b)));
    }

    private static void division(double a) {
        System.out.print("Iveskite antraji skaiciu: /");
        double b = input.nextDouble();
        System.out.println("Dalmuo yra: " + String.format("%.4f", (a / b)));

    }

    private static void sqrt(double a) {
        System.out.println("Saknis yra: " + String.format("%.4f", (Math.sqrt(a))));
    }

    private static void sin(double a) {
        System.out.println("Sin yra: " + String.format("%.4f", (Math.sin(a))));
    }
}
	
	
	
