package DeQuy;

public class KhuDeQuyGiaiThua {
    public static void main(String[] args) {
        int n = 5; // Đặt giá trị của n tại đây

        long ketQua = tinhGiaiThua(n);
        System.out.println(n + "! = " + ketQua);
    }

    private static long tinhGiaiThua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long ketQua = 1;
        
        for (int i = 2; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }
}

