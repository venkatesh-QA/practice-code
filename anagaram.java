package corejavapractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class anagaram {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//		
//System.out.println(numbers);
ArrayList ar=new ArrayList<>();
ar.add("10");
ar.add("20");
ar.add("12");
ar.add("11");
ar.sort(Comparator.naturalOrder());
System.out.println(ar);

}
}