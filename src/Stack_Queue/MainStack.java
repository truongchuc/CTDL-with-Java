package Stack_Queue;

public class MainStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj = new Stack();
		obj.inint();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		System.out.println(obj.pop() + "; " + obj.pop() + "; " + obj.pop());
		System.out.println(obj.pop());
	}

}
