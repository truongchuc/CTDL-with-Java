package danhsachlienketkep;

import java.util.Scanner;

import danhsachlienket.linklist;

public class Main {
    public static void main(String[] args) {
        Linklist linkList = new Linklist();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. In danh sách sinh viên từ cuối đến đầu");
            System.out.println("4. In danh sách sinh viên theo điểm");
            System.out.println("5. Tính và in kết quả và xếp loại");
            System.out.println("6. Tìm và in sinh viên theo tên");
            System.out.println("7. Sắp xếp danh sách theo tên");
            System.out.println("8. Thêm sinh viên sau nút cho trước");
            System.out.println("9. Thêm sinh viên trước nút cho trước");
            System.out.println("10. Xóa sinh viên theo mã sinh viên");
            System.out.println("11. Thông kê sinh viên theo xếp loại");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới sau khi nhập số

            switch (choice) {
                case 1:
                    linkList.creatlist();
                    break;
                case 2:
                    linkList.printlist(true);
                    break;
                case 3:
                    linkList.printlist(false);
                    break;
                case 4:
                    linkList.printif();
                    break;
                case 5:
                    linkList.xlvakq();
                    linkList.printlist(true);
                    break;
                case 6:
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String tenSV = scanner.nextLine();
                    linkList.search1(tenSV);
                    break;
                case 7:
                    linkList.sort();
                    linkList.printlist(true);
                    break;
                case 8:
                	DoubleLink node01 = linkList.search("01");
                	if (node01 != null) {
                	    linkList.insertAfter(node01, "99", "Sinh Viên mới", 7.5);
                	} else {
                	    System.out.println("Không tìm thấy sinh viên có mã SV 01.");
                	}
                    break;
                case 9:
                	DoubleLink node02 = linkList.search("02");
                	if (node02 != null) {
                	    linkList.insertBefore(node02, "98", "Sinh Viên mới", 6.0);
                	} else {
                	    System.out.println("Không tìm thấy sinh viên có mã SV 02.");
                	}
                    break;
                case 10:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String maSV = scanner.nextLine();
                    linkList.delete(maSV);
                    linkList.printlist(true);
                    break;
                case 11:
                	linkList.thongKeTheoXepLoai();
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }
}

