import java.util.LinkedList;
// LinkList Arry list
public class Student {

	
	public void removeList (int f , int t, LinkedList<String> l1) {
		
		l1.subList(f, t);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list =new LinkedList<String>();
		
//		list.add("Dhaka1");
//		list.add("Dhaka2");
//		list.add("Dhaka3");
//		list.add("Dhaka4");
//		list.add("Dhaka5");
//		
//		
//		
//		System.out.println(list.subList(2, 4));
//		
//		list.subList(2, 4).clear();
//		
//		System.out.println(list);
		
		String[] bikash = {"b1","b2","b3","b4","b5"};
		String[] paypal = {"p1","p2","p3","p4","p5"};
		
		
		for(String s : bikash)
			list.add(s);
		
		for(String p :paypal)
			list.add(p);
		
		
		System.out.println(list);
		
		LinkedList<String> bikashList =new LinkedList<String>();
		
		bikashList.addAll(list.subList(0,5));
		
		LinkedList<String> paypalList =new LinkedList<String>();
		
		paypalList.addAll(list.subList(5,10));
		
		
		System.out.println("BikashList :"+bikashList);
		
		System.out.println("paypalList :"+paypalList);
		
		String[] b = bikashList.toArray(new String[bikashList.size()]);
		
		for(String i : b)
		{
			System.out.print(" "+i);
		}
		System.out.println("\n");
		String[] b1 = paypalList.toArray(new String[paypalList.size()]);
		
		for(String j : b1) {
			System.out.print(" "+j);
		}
		
	
	}

}
