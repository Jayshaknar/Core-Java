package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortDemo {
	private static class Employee {
		public String name;
		public int id;

		public Employee(String name) {
			this.name = name;
		
		}

		@Override
		public String toString() {
			return name ;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
	}

	public static void main(String[] args) {

		Map<Employee,Integer> map = new HashMap<>();
		Employee e1=new Employee("jay");
		Employee e2=new Employee("shankar");
		Employee e3=new Employee("prasad");
		Employee e4=new Employee("akela");
		
		map.put(e1,1);
		map.put(e2,5);
		map.put(e3,4);
		map.put(e4,2);

		List<Map.Entry<Employee,Integer>> list = new ArrayList<Map.Entry<Employee,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Employee,Integer>>() {

			@Override
			public int compare(Entry<Employee,Integer> o1, Entry<Employee,Integer> o2) {

				//return o1.getKey().name.compareTo(o2.getKey().name);
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		System.out.println(list);

	}
}
/*Output:
  1.[akela=2, jay=1, prasad=4, shankar=5]
   2.[jay=1, akela=2, prasad=4, shankar=5]
 */
