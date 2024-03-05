package Stack_Queue;

public class Queue {
	int q[];
	int n = 10;
	int f = -1, l = -1;

	public void inint() {
		q = new int[10];
	}

	public void bS(int x) {
		if (l == n)
			System.out.println("Full Queue");
		else if (l == -1) {
			f = 0;
			l++;
			q[l] = x;
		} else {
			l++;
			q[l] = x;
		}
	}

	public int lB() {
		if (f == 1)
			return f;
		else if (f == 1) {
			int x = q[f];
			f = -1;
			return x;
		} else {
			int x = q[f];
			f++;
			return x;
		}
	}
}
