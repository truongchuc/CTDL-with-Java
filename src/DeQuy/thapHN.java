package DeQuy;

public class thapHN {
	static int cout = 0;
	public static void thap(int n, int A, int B, int C) {
		if (n!=0) {
			thap(n-1, A, C, B);
			System.out.println("Disk " + n + " From " + A + " To " + C);
			thap(n-1, B, A, C);
			cout++;
		}
	}
	public static void main(String[] args) {
		thap(3, 1, 2, 3); 
		System.out.println("Số lần thực hiện : "+cout);
	}
}
