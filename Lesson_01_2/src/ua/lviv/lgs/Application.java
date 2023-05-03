package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello, world!");

		int a = 0;
		int b = a++;
		int c = a++;

		System.out.println("a = " + a + "  b = " + b + "  c = " + c);

		int d = 4;
		System.out.println("d%6 = " + d % 6);

		int i = 1;
		switch (i) {
		case 5:
		case 1:
		case 6:
			System.out.println("2");
			break;
		case 7:
			System.out.println("7");
			break;
		default:
			System.out.println("default");
		}
		
		// 1

	}

}
