package danhsachlienket;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        linklist obj = new linklist();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tao danh sach");
            System.out.println("2. In danh sach");
            System.out.println("3. Tim kiem theo ma SV");
            System.out.println("4. Xoa theo ma SV");
            System.out.println("5. Sap xep danh sach");
            System.out.println("0. Thoat");

            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng enter

            switch (choice) {
                case 1:
                    obj.creatlist();
                    break;
                case 2:
        			obj.kq();
        			obj.xl();
                    obj.printlist();
                    break;
                case 3:
                    System.out.print("Nhap ma SV can tim kiem: ");
                    String maSV = scanner.nextLine();
                    link result = obj.search(maSV);
                    if (result != null) {
                        System.out.println("Tim thay: " + result.getHoten());
                    } else {
                        System.out.println("Khong tim thay");
                    }
                    break;
                case 4:
                	obj.kq();
        			obj.xl();
                    System.out.print("Nhap ma SV can xoa: ");
                    String maSVDelete = scanner.nextLine();
                    obj.delete(maSVDelete);
                    System.out.println("Danh sach sau khi xoa:");
                    obj.printlist();
                    break;
                case 5:
                	obj.kq();
        			obj.xl();
                    obj.sort();
                    System.out.println("Danh sach sau khi sap xep:");
                    obj.printlist();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon chuc nang khong hop le.");
                    break;
            }
        }
    }
}
