package DoThi;

import java.util.Scanner;

public class TimKiemNhiPhan {

	int TimKiemNhiPhan(int array[], int x, int low, int high) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			// nếu tìm thấy mid, thì trả về
			if (array[mid] == x)
				return mid;
			// tìm giá trị nữa trái
			if (array[mid] > x)
				return TimKiemNhiPhan(array, x, low, mid - 1);
			// tìm giá trị nữa phải
			return TimKiemNhiPhan(array, x, mid + 1, high);
		}
		return -1;
	}// hàm có gọi lại là hàm đệ quy

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimKiemNhiPhan ob = new TimKiemNhiPhan();
		int array[] = { 3, 4, 5, 6, 7, 8, 9 };
		int n = array.length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị cần tìm :");
		int x = sc.nextInt();
		int result = ob.TimKiemNhiPhan(array, x, 0, n - 1);
		if (result == -1)
			System.out.println("Not Found");
		else
			System.out.println("Element Found at index " + result);
	}

}
