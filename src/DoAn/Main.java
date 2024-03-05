package DoAn;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menus menus = new Menus();
        Scanner scanner = new Scanner(System.in);
        
        int mainChoice;
        do {
            try {
                System.out.println("╔═════════════════════════╗");
                System.out.println("║        MAIN MENU        ║");
                System.out.println("╠═════════════════════════╣");
                System.out.println("║  1. Danh sách liên kết  ║");
                System.out.println("║     đơn (DSLKD)         ║");
                System.out.println("║  2. Cây                 ║");
                System.out.println("║  3. Đệ quy              ║");
                System.out.println("║  0. Thoát               ║");
                System.out.println("╚═════════════════════════╝");
                System.out.print("Chọn menu (0-3): ");
                mainChoice = scanner.nextInt();
                scanner.nextLine();
                
                switch (mainChoice) {
                    case 1:
                        menus.menuDSLKD();
                        break;
                    case 2:
                        menus.menuCay();
                        break;
                    case 3:
                        menus.menuDeQuy();
                        break;
                    case 0:
                        System.out.println("Thoát chương trình.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Lỗi: Không có dữ liệu đầu vào. Thoát khỏi chương trình.");
                break;
            } catch (Exception e) {
                System.out.println("Lỗi không xác định: " + e.getMessage());
                break;
            }
        } while (mainChoice != 0);

        scanner.close();
    }
}
