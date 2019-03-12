import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
// list Arry ,ArryList
public class Employee {
	
	
	public String EmpName;
	
    public String EmpId;
	
	public String Salary;
	
	public String Department;
	public static String[] data = {"Riasad","101","500000","CSE"};
	
	public static String[] data1 = {"Ria","102","500000","ESE"};
	
	public static String[] data2 = {"Riad","103","500000","CSE"};
	
	public static String[] data3 = {"Rasel","104","500000","EEE"};
	
	
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Collection<String> col =new Collection<String>();
			int i =0;
			ArrayList alist =new ArrayList();
			
			List<String> list =new ArrayList<String>();
			
			list.add("Riasad101");
			list.add("101");
			
			String[] y = {"E","10"};
			
			for(String k :y) {
				list.add(k);
			}
			
			System.out.println(list);
			
//			ArrayList<Integer> alist2 =new ArrayList<Integer>();
//			
//			ArrayList<Student> alist3 =new ArrayList<Student>();
//			
//			ArrayList alist1 =new ArrayList();
			
//			alist.add("Daud");
//			alist.add("30");
//			//alist.add(data[0]);
//			for ( i=0; i<data.length; i++) {
//				alist.add(data[i]);
//				
//			}
//			
//			for ( i=0; i<data1.length; i++) {
//				alist1.add(data1[i]);
//				
//			}
			
			//System.out.println(alist);
			
		
			//System.out.println(alist1);
			//System.out.println("list :"+alist.size()+"   list 1 :"+alist1.size());
			
//			alist.addAll(alist1);
//			
			//alist.addAll(3, alist1);
			
//			System.out.println(alist);
			
			
			LinkedList<String> list1 =new LinkedList<String>();
			
			list1.add("Dhaka");
			list1.add("Rampura");
			System.out.println(list1);
			//list1.clear();
			//System.out.println(list1);
			
			list1.addFirst("Rangpur");
			System.out.println(list1);
			list1.addLast("Badda");
			list1.add(1, "Daud");
			System.out.println(list1);
			list1.remove("Daud");
			System.out.println(list1);
			list1.removeFirst();
			System.out.println(list1);
			list1.removeLast();
			System.out.println(list1);
		   // list1.getFirst();	
		    System.out.println(list1.getFirst());
			
		//	String[] x = {"A","B","C","D","E"};
			
			
		
			
		}
		
	}
	
	

