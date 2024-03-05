package DeQuy;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Đặt giá trị của n tại đây

        long ketQua = tinhFibonacci(n);
        System.out.println("Số Fibonacci thứ " + n + " là: " + ketQua);
    }

    private static long tinhFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long fibHienTai = 1;
        long fibTruocDo = 0;

        for (int i = 2; i <= n; i++) {
            long tam = fibHienTai;
            fibHienTai = fibHienTai + fibTruocDo;
            fibTruocDo = tam;
        }

        return fibHienTai;
    }
}

