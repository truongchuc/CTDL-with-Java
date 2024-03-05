package Stack_Queue;

public class Stack {
	int s[];
	int n = 10;
	int top = -1;

	public void inint() {
		s = new int[10];
	}

	public void push(int x) {
		if (top == n)
			System.out.println("Stack Full");
		else
			top++;
		s[top] = x;
	}

	public int pop() {
		if(top<0) return top;
		else {int x=s[top]; top--;return x;}
	}
}
