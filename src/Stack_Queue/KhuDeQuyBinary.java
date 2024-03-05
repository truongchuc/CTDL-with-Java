package Stack_Queue;

public class KhuDeQuyBinary {

	public static void chuyen(int so) {
		Stack obj = new Stack();
		obj.inint();
		while (so != 0) {
			obj.push(so % 2);
			so = so / 2;
		}
		boolean oke = true;
		while (oke) {
			if (obj.top == -1) {
				oke = false;
			} else {
				System.out.print(obj.pop());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chuyen(2);
	}

}
