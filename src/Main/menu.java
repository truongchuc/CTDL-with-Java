package Main;

import java.util.Scanner;

public class menu {
	Scanner sc = new Scanner(System.in);
	public void menuDQ() {
		int c1;
		do {
			System.out.println("1. de quy Giai thua");
			System.out.println("2. de quy day Fibo");
			System.out.println("3. moi ban chon");
			c1 = sc.nextInt();
			switch (c1) {
			case 1:
				System.out.println("giai thua cua 5 la: ");
				
				break;
			case 2:
				System.out.println("giai thua day so Fibo la: ");
				break;
			default:
				break;
			}
		} while (c1<3);
	}

	public void menuKhuDQ() {
		int c2;
		do {
			System.out.println("1. Khu de quy Giai thua");
			System.out.println("2. Khu de quy day Fibo");
			System.out.println("3. moi ban chon");
			c2 = sc.nextInt();
			switch (c2) {
			case 1:
				System.out.println("giai thua cua 5 la: ");
				break;
			case 2:
				System.out.println("giai thua day so Fibo la: ");
				break;
			default:
				break;
			}
		} while (c2<3);
	}
}
