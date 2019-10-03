import java.util.Random;
import java.util.Scanner;

/*
 * @author Vita
 *
 */
public class Darbas8 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// checkPitagorTeorem(); // 1 task

		// checkDiskriminant();// 2 task
		// checkNumberRandom();// 3 task
		// checkSumWithFor();// 6task
		// checkSumWithWhile();// 7 task
		// printMultiplyTable(); // 10 task
		// checkWhile(); //5 task
		// checkFor();//4 task
		// checkSumWithDoWhile();// 8 task
		// printFromAtoZ();// 9 task

	}

	private static void printMultiplyTable() {
		int i;
		int j;
		int rez;
		for (i = 0; i < 101; i++) {
			for (j = 0; j < 101; j++) {
				rez = i * j;
				System.out.println(i + "*" + j + "=" + rez);
			}
		}
	}

	private static void printFromAtoZ() {

	}

	private static void checkSumWithDoWhile() {
		int sum = 0;
		int i = 0;
		do {
			sum = sum + i;
			i++;
		} while (i < 101);
		System.out.println(sum);
	}

	private static void checkSumWithWhile() {
		int sum = 0;
		int i = 0;
		while (i < 101) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

	private static void checkSumWithFor() {
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	private static void checkWhile() {
		byte x = 0;
		int y;
		while (x < 11) {
			y = 3 * x;
			System.out.println("Kai x = " + x + ", tai y = " + y);
			x++;
		}

	}

	private static void checkFor() {
		byte x;
		int y;
		for (x = 0; x < 11; x++) {
			y = 3 * x;
			System.out.println("Kai x = " + x + ", tai y = " + y);
		}

	}

	private static void checkNumberRandom() {

		Random random = new Random();
		int randomNum = random.nextInt(100);
		System.out.println("Iveskite skaiciu nuo 0 iki 100");
		int number = input.nextInt();
		if (number <= 100) {
			if (number == randomNum) {
				System.out.println("Atspejote");
			} else {
				System.out.println("Neatspejote, bandykite dar karta");
				checkNumberRandom();
			}
			;
			{
				// else {System.out.println("Ivedete neteisinga skaiciu.");} kodel neveikia?
			}
		}
	}

	private static void checkDiskriminant() {
		System.out.println("Iveskite a koeficineto reiksme: ");
		Double a = input.nextDouble();
		if (a == 0) {
			System.out.println("Tai nera kvadratine lygtis");
		} else {
			System.out.println("Iveskite b koeficineto reiksme: ");
			Double b = input.nextDouble();
			System.out.println("Iveskite c koeficineto reiksme: ");
			Double c = input.nextDouble();
			Double result = b * b - 4 * a * c;
			System.out.println("Diskriminantas yra lygus" + result);
			if (result < 0) {
				System.out.println("Diskrimantas yra negiamas, lygtis sprendiniu neturi");
			}
		}
	}

	private static void checkPitagorTeorem() {
		System.out.println("Iveskite trikampio krastine: ");
		Double a = input.nextDouble();
		System.out.println("Iveskite trikampio krastine: ");
		Double b = input.nextDouble();
		System.out.println("Iveskite trikampio krastine: ");
		Double c = input.nextDouble();
		if (a > 0 & b > 0 & c > 0) {
//          if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
			if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {

				System.out.println("Trikampis yra status");
			} else {
				System.out.println("Trikampis nera status");
			}
		} else
			System.out.println("Krastines gali buti tik teigiami skaiciai.");
	}

}
/*
 * private static void checkPitagorTeorem2() {
 * System.out.println("Iveskite trikampio krastines: "); Int [] krastines =
 * input.nex } }
 */