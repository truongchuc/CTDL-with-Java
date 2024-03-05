package DoAn;

import java.util.*;

public class Menus {
    Scanner scanner = new Scanner(System.in);
    Linklist obj = new Linklist();
    BinaryTree tree = new BinaryTree();

    public void menuDSLKD() {
        int choice;
        do {
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║        MENU DANH SÁCH LIÊN KẾT ĐƠN     ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1. Tạo danh sách và ghi vào file       ║");
            System.out.println("║ 2. Đọc từ file và in danh sách         ║");
            System.out.println("║ 3. In danh sách                        ║");
            System.out.println("║ 4. In điểm cao nhất                    ║");
            System.out.println("║ 5. Tìm kiếm theo mã SV                 ║");
            System.out.println("║ 6. Tìm kiếm theo tên                   ║");
            System.out.println("║ 7. Xóa sinh viên theo mã SV            ║");
            System.out.println("║ 8. Sắp xếp danh sách theo tên          ║");
            System.out.println("║ 9. Chèn sinh viên vào danh sách        ║");
            System.out.println("║ 0. Thoát                               ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng enter

            switch (choice) {
                case 1:
                    obj.creatlist();
                    obj.displaySortedResults();
                    break;
                case 2:
                    obj.docfile();
                    obj.displaySortedResults();
                    break;
                case 3:
                    obj.printlist();
                    obj.kq();
                    obj.xl();
                    break;
                case 4:
                    System.out.println("Điểm cao nhất: " + obj.max());
                    break;
                case 5:
                    System.out.print("Nhập mã SV cần tìm: ");
                    String maSV = scanner.nextLine();
                    Link result = obj.search(maSV);
                    if (result != null) {
                        System.out.println("Thông tin sinh viên: " + result.getHoten() + " " + result.getDiem());
                    } else {
                        System.out.println("Không tìm thấy sinh viên có mã SV: " + maSV);
                    }
                    break;
                case 6:
                    System.out.print("Nhập tên cần tìm: ");
                    String tenSV = scanner.nextLine();
                    obj.search1(tenSV);
                    break;
                case 7:
                    System.out.print("Nhập mã SV cần xóa: ");
                    String maSVDelete = scanner.nextLine();
                    obj.delete(maSVDelete);
                    System.out.println("Danh sách sau khi xóa:");
                    obj.printlist();
                    break;
                case 8:
                    obj.sort();
                    System.out.println("Danh sách sau khi sắp xếp:");
                    obj.printlist();
                    break;
                case 9:
                    System.out.print("Nhập mã sinh viên: ");
                    String maSV1 = scanner.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoten = scanner.nextLine();
                    System.out.print("Nhập điểm: ");
                    double diem = scanner.nextDouble();
                    scanner.nextLine();
                    obj.chen(maSV1, hoten, diem);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Chọn chức năng không hợp lệ.");
                    break;
            }
        } while (choice != 0);
    }


    public void menuCay() {
        int choice;
        do {
            System.out.println("╔════════════════════════════╗");
            System.out.println("║           MENU CÂY         ║");
            System.out.println("╠════════════════════════════╣");
            System.out.println("║ 1. Thêm sinh viên          ║");
            System.out.println("║ 2. Tìm kiếm sinh viên      ║");
            System.out.println("║ 3. Hiển thị danh sách SV   ║");
            System.out.println("║ 4. Danh sách SV có điểm >5 ║");
            System.out.println("║ 0. Thoát                   ║");
            System.out.println("╚════════════════════════════╝");
            System.out.print("Chọn chức năng (0-4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự mới

            switch (choice) {
                case 1:
                    tree.create();
                    break;
                case 2:
                    System.out.print("Nhập mã sinh viên cần tìm: ");
                    String maSV = scanner.nextLine();
                    tree.timkiem(maSV);
                    break;
                case 3:
                    System.out.println("===== Danh sách sinh viên =====");
                    tree.kqxl();
                    tree.tgp(tree.root);
                    break;
                case 4:
                    System.out.println("===== Danh sách sinh viên có điểm trên 5 =====");
                    tree.kqxl();
                    tree.duyetif(tree.root);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }

    public void menuDeQuy() {
        int choice;
        do {
        	System.out.println("╔═══════════════════════════════════════════════╗");
        	System.out.println("║                MENU ĐỆ QUY                  	║");
        	System.out.println("╠═══════════════════════════════════════════════╣");
        	System.out.println("║ 1. Tính giai thừa (Đệ quy)                	║");
        	System.out.println("║ 2. Tính số Fibonacci (Đệ quy)              	║");
        	System.out.println("║ 3. Tính tổng các số từ 1 đến n (Đệ quy)    	║");
        	System.out.println("║ 4. Tính lũy thừa (Đệ quy)                  	║");
        	System.out.println("║ 5. Đảo ngược chuỗi (Đệ quy)                	║");
        	System.out.println("║ 6. Tính giai thừa (Khử đệ quy)            	║");
        	System.out.println("║ 7. Tính số Fibonacci (Khử đệ quy)           	║");
        	System.out.println("║ 8. Tính tổng các số từ 1 đến n (Khử đệ quy)	║");
        	System.out.println("║ 9. Tính lũy thừa (Khử đệ quy)               	║");
        	System.out.println("║ 10. Đảo ngược chuỗi (Khử đệ quy)          	║");
        	System.out.println("║ 0. Thoát                                  	║");
        	System.out.println("╚═══════════════════════════════════════════════╝");
            System.out.print("Chọn chức năng (0-10): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng enter
            switch (choice) {
                case 1:
                    System.out.print("Nhập số n: ");
                    int n1 = scanner.nextInt();
                    System.out.println("Giai thừa của " + n1 + " là: " + DQ.tinhgiaithuong(n1));
                    break;
                case 2:
                    System.out.print("Nhập số n: ");
                    int n2 = scanner.nextInt();
                    System.out.println("Số Fibonacci thứ " + n2 + " là: " + DQ.fibonacci(n2));
                    break;
                case 3:
                    System.out.print("Nhập số n: ");
                    int n3 = scanner.nextInt();
                    System.out.println("Tổng các số từ 1 đến " + n3 + " là: " + DQ.sum(n3));
                    break;
                case 4:
                    System.out.print("Nhập số cơ số: ");
                    int base = scanner.nextInt();
                    System.out.print("Nhập số mũ: ");
                    int exponent = scanner.nextInt();
                    System.out.println(base + " ^ " + exponent + " = " + DQ.luythua(base, exponent));
                    break;
                case 5:
                    scanner.nextLine(); // Đọc ký tự newline
                    System.out.print("Nhập chuỗi cần đảo ngược: ");
                    String str = scanner.nextLine();
                    System.out.println("Chuỗi sau khi đảo ngược: " + DQ.reverse(str));
                    break;
                case 6:
                    System.out.print("Nhập số n: ");
                    int n6 = scanner.nextInt();
                    System.out.println("Giai thừa của " + n6 + " là: " + DQ.tinhgiaithuong1(n6));
                    break;
                case 7:
                    System.out.print("Nhập số n: ");
                    int n7 = scanner.nextInt();
                    System.out.println("Số Fibonacci thứ " + n7 + " là: " + DQ.fibonacci1(n7));
                    break;
                case 8:
                    System.out.print("Nhập số n: ");
                    int n8 = scanner.nextInt();
                    System.out.println("Tổng các số từ 1 đến " + n8 + " là: " + DQ.sum1(n8));
                    break;
                case 9:
                    System.out.print("Nhập số cơ số: ");
                    int base9 = scanner.nextInt();
                    System.out.print	("Nhập số mũ: ");
                    int exponent9 = scanner.nextInt();
                    System.out.println(base9 + " ^ " + exponent9 + " = " + DQ.luythua1(base9, exponent9));
                    break;
                case 10:
                    scanner.nextLine(); // Đọc ký tự newline
                    System.out.print("Nhập chuỗi cần đảo ngược: ");
                    String str10 = scanner.nextLine();
                    System.out.println("Chuỗi sau khi đảo ngược: " + DQ.reverse1(str10));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }

}
