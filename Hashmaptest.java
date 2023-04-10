package corejavapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Hashmaptest {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
		HashMap<String, Integer>hm=new HashMap<>();
		hm.put("mahesh", 10);
		hm.put("rajesh", 20);
		hm.put("yogesh", null);
		hm.put("rajesh", 21);
		System.out.println("Hashmap data"+hm.entrySet());
		System.out.println(hm.values());
		
		Set stringvalues=hm.keySet();
		Iterator itr=stringvalues.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		TreeMap<String, Integer>TM=new TreeMap<>();
		
	
		TM.put("Ravi", 12);
		TM.put("abc", 1);
		TM.put("abhi", 21);
		TM.put("yogesh", null);
		System.out.println("Treemap data"+TM);
		
		LinkedHashMap<String, Integer>Lm=new LinkedHashMap<>();
		Lm.put("mahesh", 10);
		Lm.put("rajesh", 20);
		Lm.put("yogesh", null);
		Lm.put("ravindar", 21);
		Lm.put("abhi", 21);
		System.out.println("LinkedHashMap data"+Lm.entrySet());
	}
	

	

}
