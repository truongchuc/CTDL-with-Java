package DeQuy;

public class TongGiaiThua {
	public static int gthua(int n) {
		if (n==0) return 1 ;
		else return n*gthua(n-1);
	}
	public static int tonggthua(int n) {
		if (n==1) return 1;
		else return gthua(n)+tonggthua(n-1);
	}
	public static void main(String[] arg) {
		System.out.println("Tong gia thuong cua 3 la : " + tonggthua(3));
	}
}
