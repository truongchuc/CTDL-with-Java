package DeQuy;

public class TongLuyThua {

	/*
	 * public static long luythua(int n, int i) { return (long) Math.pow(n, i); }
	 * 
	 * public static long tongLuyThua(int n) { long tong = 0;
	 * 
	 * for (int i = 1; i <= n; i++) { tong += luythua(i, i); }
	 * 
	 * return tong; }
	 */
	
    public static int LuyThua(int x, int n) {
        if (n == 0) return 1;
             else return x * LuyThua(x, n - 1);
    }

    public static int tongLuyThua(int n) {
        if (n == 1) return 1; 
        else return LuyThua(n, n) + tongLuyThua(n - 1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tong = tongLuyThua(n);
		System.out.println("Tổng lũy thừa của " + n + " là : " + tong);
	}

}
