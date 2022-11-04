package selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class list {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("pineapple");
		list.add("Apple");
		list.add("Apple");
		list.add("Orange");
		list.add("Orange");
		int list_size=list.size();
		System.out.println("List Size: "+list_size);
		
		System.out.println(list);
		
		boolean b=list.containsAll(list);
		System.out.println(b);
		list.get(0);
		
		//set
		Set<String> set=new HashSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("pineapple");
		set.add("Apple");
		set.add("Apple");
		set.add("Orange");
		set.add("Orange");
		
		System.out.println(set);
		Set<String> set1=new TreeSet<String>();
		set1.add("Apple");
		set1.add("Mango");
		set1.add("pineapple");
		set1.add("Apple");
		set1.add("Apple");
		set1.add("Orange");
		set1.add("Orange");
		System.out.println(set1);
		
		Set<String> set2=new LinkedHashSet<String>();
		set2.add("Apple");
		set2.add("Mango");
		set2.add("pineapple");
		set2.add("Apple");
		set2.add("Apple");
		set2.add("Orange");
		set2.add("Orange");
		System.out.println(set2);
		
		boolean b1=set2.contains("Gova");
		System.out.println(b1);

	}
}
