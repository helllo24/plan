package just;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class justing {
	
	
		
	public void list() {	
	List<String> lil = new ArrayList<>();
	
	lil.add("gee");
	lil.add("deeeeedd");
	
	System.out.println(lil);
	

	}
	
	public void set() {
		
	Set<String>	se = new TreeSet<>();
	se.add("aaaaa");
	se.add("xxsxs");
	se.add("dedee");
	
	System.out.println(se);
		
	}
	
	public void map() {
		Map<Integer, String> stu = new HashMap<>();
		
		stu.put(2, "arul");
		stu.put(4, "vairam");
		System.out.println(stu);
	}
	
	public void listset() {
		List<Integer> li = List.of(3, 5);
		Set<Integer> uni = new HashSet<Integer>(li);
		System.out.println(uni);
	}
	
	public void list1() {
		
		List<String> li = new ArrayList<String>();
		li.add("java");
		li.add("python");
		
		li.add("c#");
		li.add("c");
		
		int size = li.size();
		
		String first = li.getFirst();
		
		System.out.println(first);
		System.out.println(size);
		
		
	}
	
	public void set2() {
		
		Set<String> mail = new HashSet<>();
		mail.add("A@gamil");
		mail.add("@gamil");
		mail.add("@gamil");
		mail.add("D@gamil");
		
		int size = mail.size();
		
		System.out.println(mail);
		System.out.println(size);
		

	}
	
	public void map2() {
		
		Map<Integer, String> ma = new HashMap<>();
		
		ma.put(1, "rahul");
		ma.put(2, "sudha");
		
		String ma2 = ma.get(2);
		
		ma.put(2, "pavi");
		
		
		System.out.println(ma);
		System.out.println(ma2);
		
		
		
		
	}
	
	public void taskList() {
		
		
		List<String> lil = List.of("apple", "banana", "apple", "orange", "banana");
		Set<String> u = new HashSet<String>(lil);
		
		System.out.println(u);
	}
	
	
	public void maploop() {
		
		Map<Integer, String> loop = new HashMap<>();
		loop.put(1, "apple");
		loop.put(2, "orange");
		loop.put(3, "grapes");
		
		for(Map.Entry<Integer, String> entry : loop.entrySet()) {
			
			System.out.println(entry.getKey() + "="  + entry.getValue());
		}
		
		
		System.out.println(loop);
		
	}
}

	
	 class InvalidageException extends RuntimeException{
		
		InvalidageException(String msg){
			super(msg);
		}
		
		public void  age() {
			
			int a=17;
			
			if(a<18) {
				throw  new InvalidageException("Fail:Your Age must be Above 18");
			}
			
			System.out.println("pass");
			
		}
		
		
		interface math{
			int add(int a,int b);
			
		}
		
		math m = (a,b) ->a+b ;
		
		
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//		InvalidageException inv = new InvalidageException("nmnmn");
//		inv.age();
//		}
//		catch(InvalidageException e) {
//			System.out.println(e.getMessage());
//		}
//		
		
		
		
		
		
		
		
		
//		justing j = new justing();
//		j.list();
//		j.set();
//		j.map();
//		j.listset();
//		j.list1();
//		j.set2();
//		j.map2();
//		j.taskList();
//		j.maploop();
		
	
		
		
		
		
		
	}
}
