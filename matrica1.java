package lt.vtmc.javabasics;

public class matrica1 {
	public static void main(String[] args) {
	M1();
	M2();
	M3();
	M4();
	M5();
	M6();
	M7();
	M8();
		
	}

	private static void M1() {
		for (int i = 0;i < 10; i++) {
			for (int j = 0; j < 10; j++){
		System.out.print(0);}
			System.out.println ();
		}
	}
	private static void M2() {
	for (int i = 0;i < 10; i++) {
		for (int j = 0; j < 10; j++){
			if (i == j) {
				System.out.print(1);
			}
			else {System.out.print(0);
				}
			
		}
		System.out.println ();
	}}
	private static void M3() {
		for (int i = 0;i < 10; i++) {
			for (int j = 0; j < 10; j++){
				if ((i == j)||((i+j)==9)) {
					System.out.print(1);
				}
				else {System.out.print(0);
					}
				
			}
			System.out.println ();
		}
	}
	private static void M4() {
		for (int i = 0;i < 10; i++) {
			for (int j = 0; j < 10; j++){
				if (i % 2 == 0) {
					System.out.print(1);
			}
				else { System.out.print(0);
				}
				}
			System.out.println();
		}
	}
	private static void M5() {
		
			for (int i = 0;i < 10; i++) {
				for (int j = 0; j < 10; j++){
					if (i == 0) {
						System.out.print(1);
					}
					else if (j % 2 == 0){System.out.print(1);
						}
					else System.out.print(0);
				}
				System.out.println ();
			}
	}
	private static void M6() {
		for (int i = 0;i < 10; i++) {
			for (int j = 0; j < 10; j++){
				if (i == 0) {
					System.out.print(1);
				}
				else if ((j  == 0)|| (j == 9)){System.out.print(1);
					}
				else System.out.print(0);
			}
			System.out.println ();
		}
	}
	private static void M7() {
		for (int i = 0;i < 9; i++) {
			for (int j = 0; j < 10; j++){
				
					System.out.print(i + 1);
	
			
		}System.out.println ();
	}
	}
	private static void M8() {
		for (int i = 0;i < 9; i++) {
			for (int j = 0; j < 10; j++){
				
					System.out.print(j + i + 1);
	
			
		}System.out.println ();
	
	}
	}
}