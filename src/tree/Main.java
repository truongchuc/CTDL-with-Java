package tree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		tree.create();
		tree.kqxl();
		tree.tgp(tree.root);
		System.out.println("DSSV có điểm >= 5: ");
		tree.duyetif(tree.root);
		System.out.println("Sinh Viên có mã sinh viên là 1: ");
		tree.timkiem("1");

		while (true) {
			System.out.print("Nhập Mã Sinh Viên muốn chèn: ");
			String masv = sc.nextLine();
			if (masv.length() == 0) {
				break;
			}
			tree.chen(masv);
			System.out.println("Thông tin cây sau khi chèn:");
			tree.kqxl();
			tree.tgp(tree.root);
		}
	}

}
