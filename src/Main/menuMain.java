package Main;

import java.util.Scanner;

public class menuMain {
	static Scanner sc = new Scanner(System.in);
	static menu menu = new menu();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1;
		int tam = 0;
		do {
			System.out.println("1. lam viec voi de quy va khu de quy");
			System.out.println("2. lam viec voi danh sach lien ket");
			System.out.println("3. lam viec voi danh sach lien ket kep");
			System.out.println("4. moi ban chon");
			c1 = sc.nextInt();
			switch (c1) {
			case 1: {
				do {
					System.out.println("1. lam viec voi de quy ");
					System.out.println("2. lam viec voi khu de quy");
					System.out.println("4. moi ban chon");
					switch (c1) {
					case 1:
						menu.menuDQ();
						break;
					case 2:
						menu.menuKhuDQ();
						break;
					default:
						break;
					}
				} while (c1 < 2);

			}
			case 2:

				break;
			default:
				break;
			}
		} while (tam < 3);
	}

}
