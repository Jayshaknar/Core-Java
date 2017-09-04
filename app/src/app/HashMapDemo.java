package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "jay");
		map.put(5, "shankar");
		map.put(6, "prasad");
		map.put(1, "akela");
		
		Set<Entry<Integer, String>> set=map.entrySet();
		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer,String>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				//return o1.getValue().compareTo(o2.getValue());
				return o1.getKey().compareTo(o2.getKey());
				
			}
			
			
			
			
		});
		System.out.println(list);
		

	}

}
