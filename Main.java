import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
//Stack 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stack<String> stack =new Stack<String>();
		
		stack.push("Riasad");
		stack.push("Dhaka");
		stack.push("banasree");
	System.out.println(stack);
		
		stack.pop();
	System.out.println(stack);
		stack.peek();
		stack.pop();
	System.out.println(stack);	
	
	PriorityQueue <String> q = new 	PriorityQueue<String>();
	
	q.add("Bus");
	q.add("Track");
	q.add("car");
	System.out.println(q);
	q.peek();
	System.out.println(q);
	
	
	}

}
