package DoAn;

public class DQ {
//1. Tính giai thừa:
	//đệ quy
	public static int tinhgiaithuong(int n) {
	    if (n == 0 || n == 1) {
	        return 1;
	    } else {
	        return n * tinhgiaithuong(n - 1);
	    }
	}
	//khử đệ quy
	public static int tinhgiaithuong1(int n) {
	    int r = 1;
	    for (int i = 1; i <= n; i++) {
	        r *= i;
	    }
	    return r;
	}

//2. Tính số Fibonacci:
	//đệ quy
	public static int fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}
	//khử đệ quy
	public static int fibonacci1(int n) {
	    if (n <= 1) {
	        return n;
	    }
	    int a = 0, b = 1, c;
	    for (int i = 2; i <= n; i++) {
	        c = a + b;
	        a = b;
	        b = c;
	    }
	    return b;
	}

//3. Tính tổng các số từ 1 đến n:
	//đệ quy
	public static int sum(int n) {
	    if (n == 0) {
	        return 0;
	    } else {
	        return n + sum(n - 1);
	    }
	}
	//khử đệ quy
	public static int sum1(int n) {
	    int result = 0;
	    for (int i = 1; i <= n; i++) {
	        result += i;
	    }
	    return result;
	}

//4. Tính lũy thừa:
	//đệ quy
	public static int luythua(int base, int exponent) {
	    if (exponent == 0) {
	        return 1;
	    } else {
	        return base * luythua(base, exponent - 1);
	    }
	}
	//khử đệ quy
	public static int luythua1(int base, int exponent) {
	    int result = 1;
	    for (int i = 0; i < exponent; i++) {
	        result *= base;
	    }
	    return result;
	}

//4. Đảo ngược chuỗi:
	//đệ quy
	public static String reverse(String str) {
	    if (str.isEmpty()) {
	        return str;
	    } else {
	        return reverse(str.substring(1)) + str.charAt(0);
	    }
	}
	//khử đệ quy
	public static String reverse1(String str) {
	    char[] chars = str.toCharArray();
	    int left = 0;
	    int right = chars.length - 1;
	    while (left < right) {
	        char temp = chars[left];
	        chars[left] = chars[right];
	        chars[right] = temp;
	        left++;
	        right--;
	    }
	    return new String(chars);
	}
}
