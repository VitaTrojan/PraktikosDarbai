import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class pratybos {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            // spausdinsTeksta();// 1uzd
            // char[] hello = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'
            // };]'|}:
            // masyvoKeitimas(hello);// 2uzd
            // char[] data = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' };
            // masyvoKeitimas4(data);//4uzd
            // masyvoKeitimas3(data);//3 uzd
            // String string = ").cte ,iP yrrebpsaR ,xuniL ,caM ,swodniW( smroftalp
            // tnereffid no skrow avaJ";
            // masyvoKeitimas5(string);// 5uzd
            // XorTable();//6uzd
            //	String str = "A\240b3&4\040";
            //	checkStringMetods(str);
          //  check_Min_Max_Value();//8 uzd
           // stringToBinary();//9 uzd  Negerai veikia
           // ByteToString();//10 uzd
//          squareAndPerimeterOfRectangle();
         //   WhatsIsYourName();//13 uzd
            WeekDay();//14uzd



        }

    private static void WeekDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar(2013,10,31);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        int a = calendar.get(Calendar.DAY_OF_WEEK);
        switch (a){
            case 1:
                System.out.println("Buvo pirmadienis");
                break;
        }
        //calendar.get(Calendar.DAY_OF_WEEK);

//        .setTime(2019-10-17);
//        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

    }

    private static void WhatsIsYourName() {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite varda");
        String name = scanner.nextLine();
        int s=name.length();
        Character letter = name.charAt(s-1);
        if ((letter.equals(('a') ))|| (letter.equals(('e')) )){
            System.out.println(name + " is women name.");
        } else System.out.println(name +" is man name");

    }

    private static void squareAndPerimeterOfRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite kvadrato krastine:");
        double a =scanner.nextDouble();
//        float a = scanner.nextFloat();

//        System.out.println("Kvadrato plotas yra" + a*a);
//        System.out.println("Kvadrato perimetras" +4*a);
        System.out.println(a);


    }

    private static void ByteToString() {
            byte [] byteArray =  {84, 104, 101, 32, 98, 101, 115, 116, 32, 112, 97, 115, 115, 119, 111, 114, 100, 32, 109, 97, 110, 97, 103, 101, 114, 115, 32, 102, 111, 114, 32, 50, 48, 49, 57};
            String s = new String(byteArray);
        System.out.println(s);
    }

    private static void stringToBinary()  {

        byte[] infoBin = null;
        infoBin = "this is plain text".getBytes();
        System.out.println(Arrays.toString(infoBin));
        for (byte b:infoBin) {
            System.out.print(Integer.toBinaryString(b));
        }
    }

    public static void check_Min_Max_Value(){
            System.out.println("Int max value" + Integer.MAX_VALUE);
            System.out.println("Int minvalue" + Integer.MIN_VALUE);
            System.out.println("Byte min value" + Byte.MIN_VALUE);
            System.out.println("Byte max value" + Byte.MAX_VALUE);
            System.out.println("Short min value" + Short.MIN_VALUE);
            System.out.println("Short max value" + Short.MAX_VALUE);
            System.out.println("Long min value" + Long.MIN_VALUE);
            System.out.println("Long max value" + Long.MAX_VALUE);
        }
        public static void checkStringMetods(String string) {
            System.out.print("Char    ");
            returnchar(string);
            System.out.print("Chars    ");
            returnchars(string);
            System.out.println();
            System.out.print("Char code    ");
            returncharsCode(string);
            char[] strArray = string.toCharArray();
            System.out.println("is Digit()\t\t" + Character.isDigit(strArray[0]) + "\t" + Character.isDigit(strArray[1])
                    + "\t" + Character.isDigit(strArray[2]) + "\t" + Character.isDigit(strArray[3]) + "\t"
                    + Character.isDigit(strArray[4]) + "\t" + Character.isDigit(strArray[5]) + "\t"
                    + Character.isDigit(strArray[6]) + "\t");
        }

        public static void returncharsCode(String string) {
            int b;
            for (int i = 0; i < string.length(); i++) {
                b = string.charAt(i);
                System.out.print(b + "      ");
            }

        }

        public static void returnchars(String string) {

            for (int i = 0; i < string.length(); i++) {
                System.out.print(string.charAt(i) + "      ");
            }

        }

        public static void returnchar(String string) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                builder.append(string.charAt(i));
            }
            System.out.println(builder);

        }

        public static void XorTable() {
            System.out.println("XOR truth table:");
            System.out.println("a					b					a^b");
            int a;
            int b;
            for (a = 0; a <= 1; a++) {
                for (b = 0; b <= 1; b++) {
                    System.out.println(a + " | " + b + " | " + (a ^ b));
                }
            }

        }

        public static void masyvoKeitimas5(String string) {
            // String[] stringArray = new String[] { string };
            // System.out.println(stringArray[0]);
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < string.length(); i++) {
                builder.append(string.charAt(i));
            }
            System.out.println(builder);
            int ilgis = builder.length();
            for (int i = ilgis - 1; i >= 0; i--) {
                System.out.print(builder.charAt(i));
            }
        }

        public static void masyvoKeitimas3(char[] charArray) {
            char charakter = charArray[0];
            System.out.print(Character.toUpperCase(charakter));
            for (int i = 1; i < charArray.length - 1; i++) {
                char char1 = charArray[i];
                System.out.print(char1);
            }
            System.out.println();

            for (char charakters : charArray) {

                System.out.print(Character.toUpperCase(charakters));
            }
        }

        public static void spausdinsTeksta() {
            System.out.println("*******************Programming*******************");
            System.out.println("* Java is a popular programming language, created in 1995 *");
            System.out.println("*************************************************");
        }

        public static void masyvoKeitimas(char[] charArray) {

            for (char charakter : charArray) {
                System.out.print(charakter);
            }
            // String string = new String(hello); // taip spausdins su kableliais
            // System.out.println(Arrays.toString(hello));
        }

        public static void masyvoKeitimas4(char[] charArray) {

            for (char charakter : charArray) {
                System.out.print(charakter);

            }
            System.out.println();
            int ilgis = charArray.length;
            for (int i = ilgis - 1; i >= 0; i--) {
                System.out.print(charArray[i]);
            }

        }

}
